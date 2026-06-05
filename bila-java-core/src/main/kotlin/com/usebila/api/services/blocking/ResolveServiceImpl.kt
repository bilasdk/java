// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.usebila.api.core.ClientOptions
import com.usebila.api.core.RequestOptions
import com.usebila.api.core.handlers.errorBodyHandler
import com.usebila.api.core.handlers.errorHandler
import com.usebila.api.core.handlers.jsonHandler
import com.usebila.api.core.http.HttpMethod
import com.usebila.api.core.http.HttpRequest
import com.usebila.api.core.http.HttpResponse
import com.usebila.api.core.http.HttpResponse.Handler
import com.usebila.api.core.http.HttpResponseFor
import com.usebila.api.core.http.json
import com.usebila.api.core.http.parseable
import com.usebila.api.core.prepare
import com.usebila.api.models.resolve.ResolveBankAccountParams
import com.usebila.api.models.resolve.ResolveBankAccountResponse
import com.usebila.api.models.resolve.ResolveMobileMoneyParams
import com.usebila.api.models.resolve.ResolveMobileMoneyResponse
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
