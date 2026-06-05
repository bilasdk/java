// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

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
import com.usebila.api.core.http.parseable
import com.usebila.api.core.prepare
import com.usebila.api.models.transactions.TransactionListParams
import com.usebila.api.models.transactions.TransactionListResponse
import com.usebila.api.models.transactions.TransactionRetrieveParams
import com.usebila.api.models.transactions.TransactionRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Transaction history endpoints */
class TransactionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionService {

    private val withRawResponse: TransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionService =
        TransactionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): TransactionRetrieveResponse =
        // get /api/v1/bila/transactions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): TransactionListResponse =
        // get /api/v1/bila/transactions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionService.WithRawResponse =
            TransactionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<TransactionRetrieveResponse> =
            jsonHandler<TransactionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transactions", params._pathParam(0))
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

        private val listHandler: Handler<TransactionListResponse> =
            jsonHandler<TransactionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "transactions")
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
