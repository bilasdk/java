// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.async

import com.usebila.api.core.ClientOptions
import com.usebila.api.core.RequestOptions
import com.usebila.api.core.checkRequired
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
import com.usebila.api.core.prepareAsync
import com.usebila.api.models.transfers.TransferGetStatusByReferenceParams
import com.usebila.api.models.transfers.TransferGetStatusByReferenceResponse
import com.usebila.api.models.transfers.TransferInitiateBankTransferParams
import com.usebila.api.models.transfers.TransferInitiateBankTransferResponse
import com.usebila.api.models.transfers.TransferInitiateMobileMoneyTransferParams
import com.usebila.api.models.transfers.TransferInitiateMobileMoneyTransferResponse
import com.usebila.api.models.transfers.TransferListParams
import com.usebila.api.models.transfers.TransferListResponse
import com.usebila.api.models.transfers.TransferRetrieveParams
import com.usebila.api.models.transfers.TransferRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Payout/transfer operation endpoints */
class TransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TransferServiceAsync {

    private val withRawResponse: TransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferServiceAsync =
        TransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: TransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferRetrieveResponse> =
        // get /api/v1/bila/transfers/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TransferListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferListResponse> =
        // get /api/v1/bila/transfers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getStatusByReference(
        params: TransferGetStatusByReferenceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferGetStatusByReferenceResponse> =
        // get /api/v1/bila/transfers/status/{reference}
        withRawResponse().getStatusByReference(params, requestOptions).thenApply { it.parse() }

    override fun initiateBankTransfer(
        params: TransferInitiateBankTransferParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferInitiateBankTransferResponse> =
        // post /api/v1/bila/transfers/bank-account
        withRawResponse().initiateBankTransfer(params, requestOptions).thenApply { it.parse() }

    override fun initiateMobileMoneyTransfer(
        params: TransferInitiateMobileMoneyTransferParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferInitiateMobileMoneyTransferResponse> =
        // post /api/v1/bila/transfers/mobile-money
        withRawResponse().initiateMobileMoneyTransfer(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransferServiceAsync.WithRawResponse =
            TransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<TransferRetrieveResponse> =
            jsonHandler<TransferRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TransferRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transfers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TransferListResponse> =
            jsonHandler<TransferListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TransferListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transfers")
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

        private val getStatusByReferenceHandler: Handler<TransferGetStatusByReferenceResponse> =
            jsonHandler<TransferGetStatusByReferenceResponse>(clientOptions.jsonMapper)

        override fun getStatusByReference(
            params: TransferGetStatusByReferenceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferGetStatusByReferenceResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reference", params.reference().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "bila",
                        "transfers",
                        "status",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStatusByReferenceHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val initiateBankTransferHandler: Handler<TransferInitiateBankTransferResponse> =
            jsonHandler<TransferInitiateBankTransferResponse>(clientOptions.jsonMapper)

        override fun initiateBankTransfer(
            params: TransferInitiateBankTransferParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferInitiateBankTransferResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transfers", "bank-account")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { initiateBankTransferHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val initiateMobileMoneyTransferHandler:
            Handler<TransferInitiateMobileMoneyTransferResponse> =
            jsonHandler<TransferInitiateMobileMoneyTransferResponse>(clientOptions.jsonMapper)

        override fun initiateMobileMoneyTransfer(
            params: TransferInitiateMobileMoneyTransferParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferInitiateMobileMoneyTransferResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transfers", "mobile-money")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { initiateMobileMoneyTransferHandler.handle(it) }
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
