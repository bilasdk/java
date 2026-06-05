// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.usebila.api.core.ClientOptions
import com.usebila.api.core.RequestOptions
import com.usebila.api.core.http.HttpResponseFor
import com.usebila.api.models.collections.CollectionGetStatusByReferenceParams
import com.usebila.api.models.collections.CollectionGetStatusByReferenceResponse
import com.usebila.api.models.collections.CollectionInitiateMobileMoneyCollectionParams
import com.usebila.api.models.collections.CollectionInitiateMobileMoneyCollectionResponse
import com.usebila.api.models.collections.CollectionListParams
import com.usebila.api.models.collections.CollectionListResponse
import com.usebila.api.models.collections.CollectionRetrieveParams
import com.usebila.api.models.collections.CollectionRetrieveResponse
import java.util.function.Consumer

/** Payment collection operation endpoints */
interface CollectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectionService

    /** Retrieve a single collection by its UUID */
    fun retrieve(id: String): CollectionRetrieveResponse =
        retrieve(id, CollectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
    ): CollectionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CollectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CollectionRetrieveParams): CollectionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CollectionRetrieveResponse =
        retrieve(id, CollectionRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of payment collections for the authenticated merchant */
    fun list(): CollectionListResponse = list(CollectionListParams.none())

    /** @see list */
    fun list(
        params: CollectionListParams = CollectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionListResponse

    /** @see list */
    fun list(params: CollectionListParams = CollectionListParams.none()): CollectionListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CollectionListResponse =
        list(CollectionListParams.none(), requestOptions)

    /** Retrieve collection status by client reference */
    fun getStatusByReference(reference: String): CollectionGetStatusByReferenceResponse =
        getStatusByReference(reference, CollectionGetStatusByReferenceParams.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        params: CollectionGetStatusByReferenceParams = CollectionGetStatusByReferenceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionGetStatusByReferenceResponse =
        getStatusByReference(params.toBuilder().reference(reference).build(), requestOptions)

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        params: CollectionGetStatusByReferenceParams = CollectionGetStatusByReferenceParams.none(),
    ): CollectionGetStatusByReferenceResponse =
        getStatusByReference(reference, params, RequestOptions.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        params: CollectionGetStatusByReferenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionGetStatusByReferenceResponse

    /** @see getStatusByReference */
    fun getStatusByReference(
        params: CollectionGetStatusByReferenceParams
    ): CollectionGetStatusByReferenceResponse = getStatusByReference(params, RequestOptions.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        requestOptions: RequestOptions,
    ): CollectionGetStatusByReferenceResponse =
        getStatusByReference(reference, CollectionGetStatusByReferenceParams.none(), requestOptions)

    /**
     * Initiate a payment collection from a mobile money account. Creates a transaction record in
     * your dashboard.
     */
    fun initiateMobileMoneyCollection(
        params: CollectionInitiateMobileMoneyCollectionParams
    ): CollectionInitiateMobileMoneyCollectionResponse =
        initiateMobileMoneyCollection(params, RequestOptions.none())

    /** @see initiateMobileMoneyCollection */
    fun initiateMobileMoneyCollection(
        params: CollectionInitiateMobileMoneyCollectionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionInitiateMobileMoneyCollectionResponse

    /** A view of [CollectionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/collections/{id}`, but is otherwise the
         * same as [CollectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CollectionRetrieveResponse> =
            retrieve(id, CollectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
        ): HttpResponseFor<CollectionRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CollectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CollectionRetrieveParams
        ): HttpResponseFor<CollectionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionRetrieveResponse> =
            retrieve(id, CollectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/collections`, but is otherwise the same
         * as [CollectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CollectionListResponse> = list(CollectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CollectionListParams = CollectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CollectionListParams = CollectionListParams.none()
        ): HttpResponseFor<CollectionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CollectionListResponse> =
            list(CollectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/collections/status/{reference}`, but is
         * otherwise the same as [CollectionService.getStatusByReference].
         */
        @MustBeClosed
        fun getStatusByReference(
            reference: String
        ): HttpResponseFor<CollectionGetStatusByReferenceResponse> =
            getStatusByReference(reference, CollectionGetStatusByReferenceParams.none())

        /** @see getStatusByReference */
        @MustBeClosed
        fun getStatusByReference(
            reference: String,
            params: CollectionGetStatusByReferenceParams =
                CollectionGetStatusByReferenceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionGetStatusByReferenceResponse> =
            getStatusByReference(params.toBuilder().reference(reference).build(), requestOptions)

        /** @see getStatusByReference */
        @MustBeClosed
        fun getStatusByReference(
            reference: String,
            params: CollectionGetStatusByReferenceParams =
                CollectionGetStatusByReferenceParams.none(),
        ): HttpResponseFor<CollectionGetStatusByReferenceResponse> =
            getStatusByReference(reference, params, RequestOptions.none())

        /** @see getStatusByReference */
        @MustBeClosed
        fun getStatusByReference(
            params: CollectionGetStatusByReferenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionGetStatusByReferenceResponse>

        /** @see getStatusByReference */
        @MustBeClosed
        fun getStatusByReference(
            params: CollectionGetStatusByReferenceParams
        ): HttpResponseFor<CollectionGetStatusByReferenceResponse> =
            getStatusByReference(params, RequestOptions.none())

        /** @see getStatusByReference */
        @MustBeClosed
        fun getStatusByReference(
            reference: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionGetStatusByReferenceResponse> =
            getStatusByReference(
                reference,
                CollectionGetStatusByReferenceParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/collections/mobile-money`, but is
         * otherwise the same as [CollectionService.initiateMobileMoneyCollection].
         */
        @MustBeClosed
        fun initiateMobileMoneyCollection(
            params: CollectionInitiateMobileMoneyCollectionParams
        ): HttpResponseFor<CollectionInitiateMobileMoneyCollectionResponse> =
            initiateMobileMoneyCollection(params, RequestOptions.none())

        /** @see initiateMobileMoneyCollection */
        @MustBeClosed
        fun initiateMobileMoneyCollection(
            params: CollectionInitiateMobileMoneyCollectionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionInitiateMobileMoneyCollectionResponse>
    }
}
