// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.blocking

import com.bila.api.core.ClientOptions
import com.bila.api.core.RequestOptions
import com.bila.api.core.checkRequired
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
import com.bila.api.models.transferrecipients.TransferRecipientCreateBankAccountParams
import com.bila.api.models.transferrecipients.TransferRecipientCreateBankAccountResponse
import com.bila.api.models.transferrecipients.TransferRecipientCreateMobileMoneyParams
import com.bila.api.models.transferrecipients.TransferRecipientCreateMobileMoneyResponse
import com.bila.api.models.transferrecipients.TransferRecipientListParams
import com.bila.api.models.transferrecipients.TransferRecipientListResponse
import com.bila.api.models.transferrecipients.TransferRecipientRetrieveParams
import com.bila.api.models.transferrecipients.TransferRecipientRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Transfer recipient management endpoints */
class TransferRecipientServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransferRecipientService {

    private val withRawResponse: TransferRecipientService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransferRecipientService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferRecipientService =
        TransferRecipientServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: TransferRecipientRetrieveParams,
        requestOptions: RequestOptions,
    ): TransferRecipientRetrieveResponse =
        // get /api/v1/bila/transfer-recipients/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TransferRecipientListParams,
        requestOptions: RequestOptions,
    ): TransferRecipientListResponse =
        // get /api/v1/bila/transfer-recipients
        withRawResponse().list(params, requestOptions).parse()

    override fun createBankAccount(
        params: TransferRecipientCreateBankAccountParams,
        requestOptions: RequestOptions,
    ): TransferRecipientCreateBankAccountResponse =
        // post /api/v1/bila/transfer-recipients/bank-account
        withRawResponse().createBankAccount(params, requestOptions).parse()

    override fun createMobileMoney(
        params: TransferRecipientCreateMobileMoneyParams,
        requestOptions: RequestOptions,
    ): TransferRecipientCreateMobileMoneyResponse =
        // post /api/v1/bila/transfer-recipients/mobile-money
        withRawResponse().createMobileMoney(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransferRecipientService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransferRecipientService.WithRawResponse =
            TransferRecipientServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<TransferRecipientRetrieveResponse> =
            jsonHandler<TransferRecipientRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TransferRecipientRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransferRecipientRetrieveResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<TransferRecipientListResponse> =
            jsonHandler<TransferRecipientListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TransferRecipientListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransferRecipientListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transfer-recipients")
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

        private val createBankAccountHandler: Handler<TransferRecipientCreateBankAccountResponse> =
            jsonHandler<TransferRecipientCreateBankAccountResponse>(clientOptions.jsonMapper)

        override fun createBankAccount(
            params: TransferRecipientCreateBankAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransferRecipientCreateBankAccountResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transfer-recipients", "bank-account")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createBankAccountHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createMobileMoneyHandler: Handler<TransferRecipientCreateMobileMoneyResponse> =
            jsonHandler<TransferRecipientCreateMobileMoneyResponse>(clientOptions.jsonMapper)

        override fun createMobileMoney(
            params: TransferRecipientCreateMobileMoneyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransferRecipientCreateMobileMoneyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transfer-recipients", "mobile-money")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
