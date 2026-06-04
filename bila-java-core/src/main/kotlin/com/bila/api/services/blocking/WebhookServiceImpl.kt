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
import com.bila.api.models.accounts.BilaResponse
import com.bila.api.models.webhooks.WebhookCreateParams
import com.bila.api.models.webhooks.WebhookCreateResponse
import com.bila.api.models.webhooks.WebhookDeactivateParams
import com.bila.api.models.webhooks.WebhookGetDeliveriesParams
import com.bila.api.models.webhooks.WebhookGetDeliveriesResponse
import com.bila.api.models.webhooks.WebhookListEventsParams
import com.bila.api.models.webhooks.WebhookListEventsResponse
import com.bila.api.models.webhooks.WebhookListParams
import com.bila.api.models.webhooks.WebhookListResponse
import com.bila.api.models.webhooks.WebhookRotateSecretParams
import com.bila.api.models.webhooks.WebhookRotateSecretResponse
import com.bila.api.models.webhooks.WebhookUpdateParams
import com.bila.api.models.webhooks.WebhookUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Webhook configuration and delivery history */
class WebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService =
        WebhookServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions,
    ): WebhookCreateResponse =
        // post /api/v1/bila/webhooks
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions,
    ): WebhookUpdateResponse =
        // patch /api/v1/bila/webhooks/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: WebhookListParams,
        requestOptions: RequestOptions,
    ): WebhookListResponse =
        // get /api/v1/bila/webhooks
        withRawResponse().list(params, requestOptions).parse()

    override fun deactivate(
        params: WebhookDeactivateParams,
        requestOptions: RequestOptions,
    ): BilaResponse =
        // delete /api/v1/bila/webhooks/{id}
        withRawResponse().deactivate(params, requestOptions).parse()

    override fun getDeliveries(
        params: WebhookGetDeliveriesParams,
        requestOptions: RequestOptions,
    ): WebhookGetDeliveriesResponse =
        // get /api/v1/bila/webhooks/{id}/deliveries
        withRawResponse().getDeliveries(params, requestOptions).parse()

    override fun listEvents(
        params: WebhookListEventsParams,
        requestOptions: RequestOptions,
    ): WebhookListEventsResponse =
        // get /api/v1/bila/webhooks/events
        withRawResponse().listEvents(params, requestOptions).parse()

    override fun rotateSecret(
        params: WebhookRotateSecretParams,
        requestOptions: RequestOptions,
    ): WebhookRotateSecretResponse =
        // post /api/v1/bila/webhooks/{id}/rotate-secret
        withRawResponse().rotateSecret(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookService.WithRawResponse =
            WebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WebhookCreateResponse> =
            jsonHandler<WebhookCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "webhooks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<WebhookUpdateResponse> =
            jsonHandler<WebhookUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "webhooks", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<WebhookListResponse> =
            jsonHandler<WebhookListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WebhookListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "webhooks")
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

        private val deactivateHandler: Handler<BilaResponse> =
            jsonHandler<BilaResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: WebhookDeactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BilaResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "webhooks", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deactivateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getDeliveriesHandler: Handler<WebhookGetDeliveriesResponse> =
            jsonHandler<WebhookGetDeliveriesResponse>(clientOptions.jsonMapper)

        override fun getDeliveries(
            params: WebhookGetDeliveriesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookGetDeliveriesResponse> {
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
                        "webhooks",
                        params._pathParam(0),
                        "deliveries",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDeliveriesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listEventsHandler: Handler<WebhookListEventsResponse> =
            jsonHandler<WebhookListEventsResponse>(clientOptions.jsonMapper)

        override fun listEvents(
            params: WebhookListEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookListEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "webhooks", "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rotateSecretHandler: Handler<WebhookRotateSecretResponse> =
            jsonHandler<WebhookRotateSecretResponse>(clientOptions.jsonMapper)

        override fun rotateSecret(
            params: WebhookRotateSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookRotateSecretResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "bila",
                        "webhooks",
                        params._pathParam(0),
                        "rotate-secret",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { rotateSecretHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
