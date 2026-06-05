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
import com.usebila.api.core.http.json
import com.usebila.api.core.http.parseable
import com.usebila.api.core.prepare
import com.usebila.api.models.collections.CollectionGetStatusByReferenceParams
import com.usebila.api.models.collections.CollectionGetStatusByReferenceResponse
import com.usebila.api.models.collections.CollectionInitiateMobileMoneyCollectionParams
import com.usebila.api.models.collections.CollectionInitiateMobileMoneyCollectionResponse
import com.usebila.api.models.collections.CollectionListParams
import com.usebila.api.models.collections.CollectionListResponse
import com.usebila.api.models.collections.CollectionRetrieveParams
import com.usebila.api.models.collections.CollectionRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Payment collection operation endpoints */
class CollectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CollectionService {

    private val withRawResponse: CollectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CollectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectionService =
        CollectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CollectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CollectionRetrieveResponse =
        // get /api/v1/bila/collections/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CollectionListParams,
        requestOptions: RequestOptions,
    ): CollectionListResponse =
        // get /api/v1/bila/collections
        withRawResponse().list(params, requestOptions).parse()

    override fun getStatusByReference(
        params: CollectionGetStatusByReferenceParams,
        requestOptions: RequestOptions,
    ): CollectionGetStatusByReferenceResponse =
        // get /api/v1/bila/collections/status/{reference}
        withRawResponse().getStatusByReference(params, requestOptions).parse()

    override fun initiateMobileMoneyCollection(
        params: CollectionInitiateMobileMoneyCollectionParams,
        requestOptions: RequestOptions,
    ): CollectionInitiateMobileMoneyCollectionResponse =
        // post /api/v1/bila/collections/mobile-money
        withRawResponse().initiateMobileMoneyCollection(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CollectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectionService.WithRawResponse =
            CollectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CollectionRetrieveResponse> =
            jsonHandler<CollectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CollectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "collections", params._pathParam(0))
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

        private val listHandler: Handler<CollectionListResponse> =
            jsonHandler<CollectionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CollectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "collections")
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

        private val getStatusByReferenceHandler: Handler<CollectionGetStatusByReferenceResponse> =
            jsonHandler<CollectionGetStatusByReferenceResponse>(clientOptions.jsonMapper)

        override fun getStatusByReference(
            params: CollectionGetStatusByReferenceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionGetStatusByReferenceResponse> {
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
                        "collections",
                        "status",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStatusByReferenceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val initiateMobileMoneyCollectionHandler:
            Handler<CollectionInitiateMobileMoneyCollectionResponse> =
            jsonHandler<CollectionInitiateMobileMoneyCollectionResponse>(clientOptions.jsonMapper)

        override fun initiateMobileMoneyCollection(
            params: CollectionInitiateMobileMoneyCollectionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionInitiateMobileMoneyCollectionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "collections", "mobile-money")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { initiateMobileMoneyCollectionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
