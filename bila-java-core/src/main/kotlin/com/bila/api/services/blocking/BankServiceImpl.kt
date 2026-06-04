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
import com.bila.api.core.http.parseable
import com.bila.api.core.prepare
import com.bila.api.models.banks.BankListParams
import com.bila.api.models.banks.BankListResponse
import java.util.function.Consumer

/** Bank reference data endpoints */
class BankServiceImpl internal constructor(private val clientOptions: ClientOptions) : BankService {

    private val withRawResponse: BankService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BankService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BankService =
        BankServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: BankListParams, requestOptions: RequestOptions): BankListResponse =
        // get /api/v1/bila/banks
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BankService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BankService.WithRawResponse =
            BankServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<BankListResponse> =
            jsonHandler<BankListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BankListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BankListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "banks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
