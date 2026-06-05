// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.blocking

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Webhook configuration and delivery history */
interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService

    /** Create a webhook config */
    fun create(params: WebhookCreateParams): WebhookCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookCreateResponse

    /** Update a webhook config */
    fun update(id: String): WebhookUpdateResponse = update(id, WebhookUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
    ): WebhookUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookUpdateResponse

    /** @see update */
    fun update(params: WebhookUpdateParams): WebhookUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): WebhookUpdateResponse =
        update(id, WebhookUpdateParams.none(), requestOptions)

    /** List webhook configs */
    fun list(): WebhookListResponse = list(WebhookListParams.none())

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListResponse

    /** @see list */
    fun list(params: WebhookListParams = WebhookListParams.none()): WebhookListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WebhookListResponse =
        list(WebhookListParams.none(), requestOptions)

    /** Deactivate a webhook */
    fun deactivate(id: String): WebhookDeactivateResponse =
        deactivate(id, WebhookDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        id: String,
        params: WebhookDeactivateParams = WebhookDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDeactivateResponse = deactivate(params.toBuilder().id(id).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        id: String,
        params: WebhookDeactivateParams = WebhookDeactivateParams.none(),
    ): WebhookDeactivateResponse = deactivate(id, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: WebhookDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDeactivateResponse

    /** @see deactivate */
    fun deactivate(params: WebhookDeactivateParams): WebhookDeactivateResponse =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(id: String, requestOptions: RequestOptions): WebhookDeactivateResponse =
        deactivate(id, WebhookDeactivateParams.none(), requestOptions)

    /** Get delivery history */
    fun getDeliveries(id: String): WebhookGetDeliveriesResponse =
        getDeliveries(id, WebhookGetDeliveriesParams.none())

    /** @see getDeliveries */
    fun getDeliveries(
        id: String,
        params: WebhookGetDeliveriesParams = WebhookGetDeliveriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookGetDeliveriesResponse =
        getDeliveries(params.toBuilder().id(id).build(), requestOptions)

    /** @see getDeliveries */
    fun getDeliveries(
        id: String,
        params: WebhookGetDeliveriesParams = WebhookGetDeliveriesParams.none(),
    ): WebhookGetDeliveriesResponse = getDeliveries(id, params, RequestOptions.none())

    /** @see getDeliveries */
    fun getDeliveries(
        params: WebhookGetDeliveriesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookGetDeliveriesResponse

    /** @see getDeliveries */
    fun getDeliveries(params: WebhookGetDeliveriesParams): WebhookGetDeliveriesResponse =
        getDeliveries(params, RequestOptions.none())

    /** @see getDeliveries */
    fun getDeliveries(id: String, requestOptions: RequestOptions): WebhookGetDeliveriesResponse =
        getDeliveries(id, WebhookGetDeliveriesParams.none(), requestOptions)

    /** List webhook event types */
    fun listEvents(): WebhookListEventsResponse = listEvents(WebhookListEventsParams.none())

    /** @see listEvents */
    fun listEvents(
        params: WebhookListEventsParams = WebhookListEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListEventsResponse

    /** @see listEvents */
    fun listEvents(
        params: WebhookListEventsParams = WebhookListEventsParams.none()
    ): WebhookListEventsResponse = listEvents(params, RequestOptions.none())

    /** @see listEvents */
    fun listEvents(requestOptions: RequestOptions): WebhookListEventsResponse =
        listEvents(WebhookListEventsParams.none(), requestOptions)

    /** Rotate webhook signing secret */
    fun rotateSecret(id: String): WebhookRotateSecretResponse =
        rotateSecret(id, WebhookRotateSecretParams.none())

    /** @see rotateSecret */
    fun rotateSecret(
        id: String,
        params: WebhookRotateSecretParams = WebhookRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookRotateSecretResponse = rotateSecret(params.toBuilder().id(id).build(), requestOptions)

    /** @see rotateSecret */
    fun rotateSecret(
        id: String,
        params: WebhookRotateSecretParams = WebhookRotateSecretParams.none(),
    ): WebhookRotateSecretResponse = rotateSecret(id, params, RequestOptions.none())

    /** @see rotateSecret */
    fun rotateSecret(
        params: WebhookRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookRotateSecretResponse

    /** @see rotateSecret */
    fun rotateSecret(params: WebhookRotateSecretParams): WebhookRotateSecretResponse =
        rotateSecret(params, RequestOptions.none())

    /** @see rotateSecret */
    fun rotateSecret(id: String, requestOptions: RequestOptions): WebhookRotateSecretResponse =
        rotateSecret(id, WebhookRotateSecretParams.none(), requestOptions)

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/webhooks`, but is otherwise the same
         * as [WebhookService.create].
         */
        @MustBeClosed
        fun create(params: WebhookCreateParams): HttpResponseFor<WebhookCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/bila/webhooks/{id}`, but is otherwise the
         * same as [WebhookService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<WebhookUpdateResponse> =
            update(id, WebhookUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
        ): HttpResponseFor<WebhookUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: WebhookUpdateParams): HttpResponseFor<WebhookUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookUpdateResponse> =
            update(id, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/webhooks`, but is otherwise the same as
         * [WebhookService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WebhookListResponse> = list(WebhookListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): HttpResponseFor<WebhookListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookListResponse> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/bila/webhooks/{id}`, but is otherwise the
         * same as [WebhookService.deactivate].
         */
        @MustBeClosed
        fun deactivate(id: String): HttpResponseFor<WebhookDeactivateResponse> =
            deactivate(id, WebhookDeactivateParams.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            id: String,
            params: WebhookDeactivateParams = WebhookDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDeactivateResponse> =
            deactivate(params.toBuilder().id(id).build(), requestOptions)

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            id: String,
            params: WebhookDeactivateParams = WebhookDeactivateParams.none(),
        ): HttpResponseFor<WebhookDeactivateResponse> =
            deactivate(id, params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: WebhookDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDeactivateResponse>

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: WebhookDeactivateParams
        ): HttpResponseFor<WebhookDeactivateResponse> = deactivate(params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookDeactivateResponse> =
            deactivate(id, WebhookDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/webhooks/{id}/deliveries`, but is
         * otherwise the same as [WebhookService.getDeliveries].
         */
        @MustBeClosed
        fun getDeliveries(id: String): HttpResponseFor<WebhookGetDeliveriesResponse> =
            getDeliveries(id, WebhookGetDeliveriesParams.none())

        /** @see getDeliveries */
        @MustBeClosed
        fun getDeliveries(
            id: String,
            params: WebhookGetDeliveriesParams = WebhookGetDeliveriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookGetDeliveriesResponse> =
            getDeliveries(params.toBuilder().id(id).build(), requestOptions)

        /** @see getDeliveries */
        @MustBeClosed
        fun getDeliveries(
            id: String,
            params: WebhookGetDeliveriesParams = WebhookGetDeliveriesParams.none(),
        ): HttpResponseFor<WebhookGetDeliveriesResponse> =
            getDeliveries(id, params, RequestOptions.none())

        /** @see getDeliveries */
        @MustBeClosed
        fun getDeliveries(
            params: WebhookGetDeliveriesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookGetDeliveriesResponse>

        /** @see getDeliveries */
        @MustBeClosed
        fun getDeliveries(
            params: WebhookGetDeliveriesParams
        ): HttpResponseFor<WebhookGetDeliveriesResponse> =
            getDeliveries(params, RequestOptions.none())

        /** @see getDeliveries */
        @MustBeClosed
        fun getDeliveries(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookGetDeliveriesResponse> =
            getDeliveries(id, WebhookGetDeliveriesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/webhooks/events`, but is otherwise the
         * same as [WebhookService.listEvents].
         */
        @MustBeClosed
        fun listEvents(): HttpResponseFor<WebhookListEventsResponse> =
            listEvents(WebhookListEventsParams.none())

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            params: WebhookListEventsParams = WebhookListEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListEventsResponse>

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            params: WebhookListEventsParams = WebhookListEventsParams.none()
        ): HttpResponseFor<WebhookListEventsResponse> = listEvents(params, RequestOptions.none())

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(requestOptions: RequestOptions): HttpResponseFor<WebhookListEventsResponse> =
            listEvents(WebhookListEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/webhooks/{id}/rotate-secret`, but is
         * otherwise the same as [WebhookService.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(id: String): HttpResponseFor<WebhookRotateSecretResponse> =
            rotateSecret(id, WebhookRotateSecretParams.none())

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            id: String,
            params: WebhookRotateSecretParams = WebhookRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookRotateSecretResponse> =
            rotateSecret(params.toBuilder().id(id).build(), requestOptions)

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            id: String,
            params: WebhookRotateSecretParams = WebhookRotateSecretParams.none(),
        ): HttpResponseFor<WebhookRotateSecretResponse> =
            rotateSecret(id, params, RequestOptions.none())

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            params: WebhookRotateSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookRotateSecretResponse>

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            params: WebhookRotateSecretParams
        ): HttpResponseFor<WebhookRotateSecretResponse> =
            rotateSecret(params, RequestOptions.none())

        /** @see rotateSecret */
        @MustBeClosed
        fun rotateSecret(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookRotateSecretResponse> =
            rotateSecret(id, WebhookRotateSecretParams.none(), requestOptions)
    }
}
