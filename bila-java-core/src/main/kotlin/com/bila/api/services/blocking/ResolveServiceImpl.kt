// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.blocking

import com.bila.api.core.ClientOptions
import com.bila.api.core.RequestOptions
import com.bila.api.core.handlers.errorBodyHandler
import com.bila.api.core.handlers.errorHandler
import com.bila.api.core.handlers.jsonHandler
import com.bila.api.core.http.HttpMethod
import com.bila.api.core.http.HttpRequest
import com.bila.api.core.http.HttpResponse
import com.bila.api.core.http.HttpResponse.Handler
import com.bila.api.core.http.HttpResponseFor
import com.bila.api.core.http.json
import com.bila.api.core.http.parseable
import com.bila.api.core.prepare
import com.bila.api.models.resolve.ResolveBankAccountParams
import com.bila.api.models.resolve.ResolveBankAccountResponse
import com.bila.api.models.resolve.ResolveMobileMoneyParams
import com.bila.api.models.resolve.ResolveMobileMoneyResponse
import java.util.function.Consumer

/** Account resolution/verification endpoints */
class ResolveServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ResolveService {

    private val withRawResponse: ResolveService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ResolveService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResolveService =
        ResolveServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun bankAccount(
        params: ResolveBankAccountParams,
        requestOptions: RequestOptions,
    ): ResolveBankAccountResponse =
        // post /api/v1/bila/resolve/bank-account
        withRawResponse().bankAccount(params, requestOptions).parse()

    override fun mobileMoney(
        params: ResolveMobileMoneyParams,
        requestOptions: RequestOptions,
    ): ResolveMobileMoneyResponse =
        // post /api/v1/bila/resolve/mobile-money
        withRawResponse().mobileMoney(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ResolveService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResolveService.WithRawResponse =
            ResolveServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val bankAccountHandler: Handler<ResolveBankAccountResponse> =
            jsonHandler<ResolveBankAccountResponse>(clientOptions.jsonMapper)

        override fun bankAccount(
            params: ResolveBankAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResolveBankAccountResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "resolve", "bank-account")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { bankAccountHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val mobileMoneyHandler: Handler<ResolveMobileMoneyResponse> =
            jsonHandler<ResolveMobileMoneyResponse>(clientOptions.jsonMapper)

        override fun mobileMoney(
            params: ResolveMobileMoneyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResolveMobileMoneyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "resolve", "mobile-money")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { mobileMoneyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
