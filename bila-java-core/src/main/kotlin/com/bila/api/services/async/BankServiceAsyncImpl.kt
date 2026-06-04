// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.async

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
import com.bila.api.core.prepareAsync
import com.bila.api.models.banks.BankListParams
import com.bila.api.models.banks.BankListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Bank reference data endpoints */
class BankServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BankServiceAsync {

    private val withRawResponse: BankServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BankServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BankServiceAsync =
        BankServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: BankListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BankListResponse> =
        // get /api/v1/bila/banks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BankServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BankServiceAsync.WithRawResponse =
            BankServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<BankListResponse> =
            jsonHandler<BankListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BankListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BankListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "banks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
