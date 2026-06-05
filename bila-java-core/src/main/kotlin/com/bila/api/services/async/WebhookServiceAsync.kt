// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.async

import com.bila.api.core.ClientOptions
import com.bila.api.core.RequestOptions
import com.bila.api.core.http.HttpResponseFor
import com.bila.api.models.webhooks.WebhookCreateParams
import com.bila.api.models.webhooks.WebhookCreateResponse
import com.bila.api.models.webhooks.WebhookDeactivateParams
import com.bila.api.models.webhooks.WebhookDeactivateResponse
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Webhook configuration and delivery history */
interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync

    /** Create a webhook config */
    fun create(params: WebhookCreateParams): CompletableFuture<WebhookCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookCreateResponse>

    /** Update a webhook config */
    fun update(id: String): CompletableFuture<WebhookUpdateResponse> =
        update(id, WebhookUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
    ): CompletableFuture<WebhookUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookUpdateResponse>

    /** @see update */
    fun update(params: WebhookUpdateParams): CompletableFuture<WebhookUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookUpdateResponse> =
        update(id, WebhookUpdateParams.none(), requestOptions)

    /** List webhook configs */
    fun list(): CompletableFuture<WebhookListResponse> = list(WebhookListParams.none())

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListResponse>

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none()
    ): CompletableFuture<WebhookListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebhookListResponse> =
        list(WebhookListParams.none(), requestOptions)

    /** Deactivate a webhook */
    fun deactivate(id: String): CompletableFuture<WebhookDeactivateResponse> =
        deactivate(id, WebhookDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        id: String,
        params: WebhookDeactivateParams = WebhookDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeactivateResponse> =
        deactivate(params.toBuilder().id(id).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        id: String,
        params: WebhookDeactivateParams = WebhookDeactivateParams.none(),
    ): CompletableFuture<WebhookDeactivateResponse> = deactivate(id, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: WebhookDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeactivateResponse>

    /** @see deactivate */
    fun deactivate(params: WebhookDeactivateParams): CompletableFuture<WebhookDeactivateResponse> =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookDeactivateResponse> =
        deactivate(id, WebhookDeactivateParams.none(), requestOptions)

    /** Get delivery history */
    fun getDeliveries(id: String): CompletableFuture<WebhookGetDeliveriesResponse> =
        getDeliveries(id, WebhookGetDeliveriesParams.none())

    /** @see getDeliveries */
    fun getDeliveries(
        id: String,
        params: WebhookGetDeliveriesParams = WebhookGetDeliveriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookGetDeliveriesResponse> =
        getDeliveries(params.toBuilder().id(id).build(), requestOptions)

    /** @see getDeliveries */
    fun getDeliveries(
        id: String,
        params: WebhookGetDeliveriesParams = WebhookGetDeliveriesParams.none(),
    ): CompletableFuture<WebhookGetDeliveriesResponse> =
        getDeliveries(id, params, RequestOptions.none())

    /** @see getDeliveries */
    fun getDeliveries(
        params: WebhookGetDeliveriesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookGetDeliveriesResponse>

    /** @see getDeliveries */
    fun getDeliveries(
        params: WebhookGetDeliveriesParams
    ): CompletableFuture<WebhookGetDeliveriesResponse> =
        getDeliveries(params, RequestOptions.none())

    /** @see getDeliveries */
    fun getDeliveries(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookGetDeliveriesResponse> =
        getDeliveries(id, WebhookGetDeliveriesParams.none(), requestOptions)

    /** List webhook event types */
    fun listEvents(): CompletableFuture<WebhookListEventsResponse> =
        listEvents(WebhookListEventsParams.none())

    /** @see listEvents */
    fun listEvents(
        params: WebhookListEventsParams = WebhookListEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListEventsResponse>

    /** @see listEvents */
    fun listEvents(
        params: WebhookListEventsParams = WebhookListEventsParams.none()
    ): CompletableFuture<WebhookListEventsResponse> = listEvents(params, RequestOptions.none())

    /** @see listEvents */
    fun listEvents(requestOptions: RequestOptions): CompletableFuture<WebhookListEventsResponse> =
        listEvents(WebhookListEventsParams.none(), requestOptions)

    /** Rotate webhook signing secret */
    fun rotateSecret(id: String): CompletableFuture<WebhookRotateSecretResponse> =
        rotateSecret(id, WebhookRotateSecretParams.none())

    /** @see rotateSecret */
    fun rotateSecret(
        id: String,
        params: WebhookRotateSecretParams = WebhookRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookRotateSecretResponse> =
        rotateSecret(params.toBuilder().id(id).build(), requestOptions)

    /** @see rotateSecret */
    fun rotateSecret(
        id: String,
        params: WebhookRotateSecretParams = WebhookRotateSecretParams.none(),
    ): CompletableFuture<WebhookRotateSecretResponse> =
        rotateSecret(id, params, RequestOptions.none())

    /** @see rotateSecret */
    fun rotateSecret(
        params: WebhookRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookRotateSecretResponse>

    /** @see rotateSecret */
    fun rotateSecret(
        params: WebhookRotateSecretParams
    ): CompletableFuture<WebhookRotateSecretResponse> = rotateSecret(params, RequestOptions.none())

    /** @see rotateSecret */
    fun rotateSecret(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookRotateSecretResponse> =
        rotateSecret(id, WebhookRotateSecretParams.none(), requestOptions)

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/webhooks`, but is otherwise the same
         * as [WebhookServiceAsync.create].
         */
        fun create(
            params: WebhookCreateParams
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/bila/webhooks/{id}`, but is otherwise the
         * same as [WebhookServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(id, WebhookUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>>

        /** @see update */
        fun update(
            params: WebhookUpdateParams
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(id, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(WebhookListParams.none())

        /** @see list */
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>>

        /** @see list */
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/bila/webhooks/{id}`, but is otherwise the
         * same as [WebhookServiceAsync.deactivate].
         */
        fun deactivate(id: String): CompletableFuture<HttpResponseFor<WebhookDeactivateResponse>> =
            deactivate(id, WebhookDeactivateParams.none())

        /** @see deactivate */
        fun deactivate(
            id: String,
            params: WebhookDeactivateParams = WebhookDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeactivateResponse>> =
            deactivate(params.toBuilder().id(id).build(), requestOptions)

        /** @see deactivate */
        fun deactivate(
            id: String,
            params: WebhookDeactivateParams = WebhookDeactivateParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeactivateResponse>> =
            deactivate(id, params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            params: WebhookDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeactivateResponse>>

        /** @see deactivate */
        fun deactivate(
            params: WebhookDeactivateParams
        ): CompletableFuture<HttpResponseFor<WebhookDeactivateResponse>> =
            deactivate(params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookDeactivateResponse>> =
            deactivate(id, WebhookDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/webhooks/{id}/deliveries`, but is
         * otherwise the same as [WebhookServiceAsync.getDeliveries].
         */
        fun getDeliveries(
            id: String
        ): CompletableFuture<HttpResponseFor<WebhookGetDeliveriesResponse>> =
            getDeliveries(id, WebhookGetDeliveriesParams.none())

        /** @see getDeliveries */
        fun getDeliveries(
            id: String,
            params: WebhookGetDeliveriesParams = WebhookGetDeliveriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookGetDeliveriesResponse>> =
            getDeliveries(params.toBuilder().id(id).build(), requestOptions)

        /** @see getDeliveries */
        fun getDeliveries(
            id: String,
            params: WebhookGetDeliveriesParams = WebhookGetDeliveriesParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookGetDeliveriesResponse>> =
            getDeliveries(id, params, RequestOptions.none())

        /** @see getDeliveries */
        fun getDeliveries(
            params: WebhookGetDeliveriesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookGetDeliveriesResponse>>

        /** @see getDeliveries */
        fun getDeliveries(
            params: WebhookGetDeliveriesParams
        ): CompletableFuture<HttpResponseFor<WebhookGetDeliveriesResponse>> =
            getDeliveries(params, RequestOptions.none())

        /** @see getDeliveries */
        fun getDeliveries(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookGetDeliveriesResponse>> =
            getDeliveries(id, WebhookGetDeliveriesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/webhooks/events`, but is otherwise the
         * same as [WebhookServiceAsync.listEvents].
         */
        fun listEvents(): CompletableFuture<HttpResponseFor<WebhookListEventsResponse>> =
            listEvents(WebhookListEventsParams.none())

        /** @see listEvents */
        fun listEvents(
            params: WebhookListEventsParams = WebhookListEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListEventsResponse>>

        /** @see listEvents */
        fun listEvents(
            params: WebhookListEventsParams = WebhookListEventsParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookListEventsResponse>> =
            listEvents(params, RequestOptions.none())

        /** @see listEvents */
        fun listEvents(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookListEventsResponse>> =
            listEvents(WebhookListEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/webhooks/{id}/rotate-secret`, but is
         * otherwise the same as [WebhookServiceAsync.rotateSecret].
         */
        fun rotateSecret(
            id: String
        ): CompletableFuture<HttpResponseFor<WebhookRotateSecretResponse>> =
            rotateSecret(id, WebhookRotateSecretParams.none())

        /** @see rotateSecret */
        fun rotateSecret(
            id: String,
            params: WebhookRotateSecretParams = WebhookRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookRotateSecretResponse>> =
            rotateSecret(params.toBuilder().id(id).build(), requestOptions)

        /** @see rotateSecret */
        fun rotateSecret(
            id: String,
            params: WebhookRotateSecretParams = WebhookRotateSecretParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookRotateSecretResponse>> =
            rotateSecret(id, params, RequestOptions.none())

        /** @see rotateSecret */
        fun rotateSecret(
            params: WebhookRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookRotateSecretResponse>>

        /** @see rotateSecret */
        fun rotateSecret(
            params: WebhookRotateSecretParams
        ): CompletableFuture<HttpResponseFor<WebhookRotateSecretResponse>> =
            rotateSecret(params, RequestOptions.none())

        /** @see rotateSecret */
        fun rotateSecret(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookRotateSecretResponse>> =
            rotateSecret(id, WebhookRotateSecretParams.none(), requestOptions)
    }
}
