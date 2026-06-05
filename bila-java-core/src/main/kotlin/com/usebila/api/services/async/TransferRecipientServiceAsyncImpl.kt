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
import com.usebila.api.models.transferrecipients.TransferRecipientCreateBankAccountParams
import com.usebila.api.models.transferrecipients.TransferRecipientCreateBankAccountResponse
import com.usebila.api.models.transferrecipients.TransferRecipientCreateMobileMoneyParams
import com.usebila.api.models.transferrecipients.TransferRecipientCreateMobileMoneyResponse
import com.usebila.api.models.transferrecipients.TransferRecipientListParams
import com.usebila.api.models.transferrecipients.TransferRecipientListResponse
import com.usebila.api.models.transferrecipients.TransferRecipientRetrieveParams
import com.usebila.api.models.transferrecipients.TransferRecipientRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Transfer recipient management endpoints */
class TransferRecipientServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TransferRecipientServiceAsync {

    private val withRawResponse: TransferRecipientServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransferRecipientServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TransferRecipientServiceAsync =
        TransferRecipientServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: TransferRecipientRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferRecipientRetrieveResponse> =
        // get /api/v1/bila/transfer-recipients/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TransferRecipientListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferRecipientListResponse> =
        // get /api/v1/bila/transfer-recipients
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun createBankAccount(
        params: TransferRecipientCreateBankAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferRecipientCreateBankAccountResponse> =
        // post /api/v1/bila/transfer-recipients/bank-account
        withRawResponse().createBankAccount(params, requestOptions).thenApply { it.parse() }

    override fun createMobileMoney(
        params: TransferRecipientCreateMobileMoneyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferRecipientCreateMobileMoneyResponse> =
        // post /api/v1/bila/transfer-recipients/mobile-money
        withRawResponse().createMobileMoney(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransferRecipientServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransferRecipientServiceAsync.WithRawResponse =
            TransferRecipientServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<TransferRecipientRetrieveResponse> =
            jsonHandler<TransferRecipientRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TransferRecipientRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferRecipientRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "bila",
                        "transfer-recipients",
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
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TransferRecipientListResponse> =
            jsonHandler<TransferRecipientListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TransferRecipientListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferRecipientListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transfer-recipients")
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

        private val createBankAccountHandler: Handler<TransferRecipientCreateBankAccountResponse> =
            jsonHandler<TransferRecipientCreateBankAccountResponse>(clientOptions.jsonMapper)

        override fun createBankAccount(
            params: TransferRecipientCreateBankAccountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferRecipientCreateBankAccountResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transfer-recipients", "bank-account")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createBankAccountHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createMobileMoneyHandler: Handler<TransferRecipientCreateMobileMoneyResponse> =
            jsonHandler<TransferRecipientCreateMobileMoneyResponse>(clientOptions.jsonMapper)

        override fun createMobileMoney(
            params: TransferRecipientCreateMobileMoneyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferRecipientCreateMobileMoneyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transfer-recipients", "mobile-money")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createMobileMoneyHandler.handle(it) }
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
