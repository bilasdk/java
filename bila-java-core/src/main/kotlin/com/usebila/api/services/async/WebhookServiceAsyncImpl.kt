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
import com.usebila.api.models.webhooks.WebhookCreateParams
import com.usebila.api.models.webhooks.WebhookCreateResponse
import com.usebila.api.models.webhooks.WebhookDeactivateParams
import com.usebila.api.models.webhooks.WebhookDeactivateResponse
import com.usebila.api.models.webhooks.WebhookGetDeliveriesParams
import com.usebila.api.models.webhooks.WebhookGetDeliveriesResponse
import com.usebila.api.models.webhooks.WebhookListEventsParams
import com.usebila.api.models.webhooks.WebhookListEventsResponse
import com.usebila.api.models.webhooks.WebhookListParams
import com.usebila.api.models.webhooks.WebhookListResponse
import com.usebila.api.models.webhooks.WebhookRotateSecretParams
import com.usebila.api.models.webhooks.WebhookRotateSecretResponse
import com.usebila.api.models.webhooks.WebhookUpdateParams
import com.usebila.api.models.webhooks.WebhookUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Webhook configuration and delivery history */
class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val withRawResponse: WebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync =
        WebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookCreateResponse> =
        // post /api/v1/bila/webhooks
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookUpdateResponse> =
        // patch /api/v1/bila/webhooks/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WebhookListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookListResponse> =
        // get /api/v1/bila/webhooks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deactivate(
        params: WebhookDeactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookDeactivateResponse> =
        // delete /api/v1/bila/webhooks/{id}
        withRawResponse().deactivate(params, requestOptions).thenApply { it.parse() }

    override fun getDeliveries(
        params: WebhookGetDeliveriesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookGetDeliveriesResponse> =
        // get /api/v1/bila/webhooks/{id}/deliveries
        withRawResponse().getDeliveries(params, requestOptions).thenApply { it.parse() }

    override fun listEvents(
        params: WebhookListEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookListEventsResponse> =
        // get /api/v1/bila/webhooks/events
        withRawResponse().listEvents(params, requestOptions).thenApply { it.parse() }

    override fun rotateSecret(
        params: WebhookRotateSecretParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookRotateSecretResponse> =
        // post /api/v1/bila/webhooks/{id}/rotate-secret
        withRawResponse().rotateSecret(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse =
            WebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WebhookCreateResponse> =
            jsonHandler<WebhookCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "webhooks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<WebhookUpdateResponse> =
            jsonHandler<WebhookUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<WebhookListResponse> =
            jsonHandler<WebhookListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WebhookListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "webhooks")
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

        private val deactivateHandler: Handler<WebhookDeactivateResponse> =
            jsonHandler<WebhookDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: WebhookDeactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookDeactivateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deactivateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getDeliveriesHandler: Handler<WebhookGetDeliveriesResponse> =
            jsonHandler<WebhookGetDeliveriesResponse>(clientOptions.jsonMapper)

        override fun getDeliveries(
            params: WebhookGetDeliveriesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookGetDeliveriesResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDeliveriesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listEventsHandler: Handler<WebhookListEventsResponse> =
            jsonHandler<WebhookListEventsResponse>(clientOptions.jsonMapper)

        override fun listEvents(
            params: WebhookListEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookListEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "bila", "webhooks", "events")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEventsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val rotateSecretHandler: Handler<WebhookRotateSecretResponse> =
            jsonHandler<WebhookRotateSecretResponse>(clientOptions.jsonMapper)

        override fun rotateSecret(
            params: WebhookRotateSecretParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookRotateSecretResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
