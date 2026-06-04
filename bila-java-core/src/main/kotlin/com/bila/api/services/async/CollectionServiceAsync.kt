// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.async

import com.bila.api.core.ClientOptions
import com.bila.api.core.RequestOptions
import com.bila.api.core.http.HttpResponseFor
import com.bila.api.models.collections.CollectionGetStatusByReferenceParams
import com.bila.api.models.collections.CollectionGetStatusByReferenceResponse
import com.bila.api.models.collections.CollectionInitiateMobileMoneyCollectionParams
import com.bila.api.models.collections.CollectionInitiateMobileMoneyCollectionResponse
import com.bila.api.models.collections.CollectionListParams
import com.bila.api.models.collections.CollectionListResponse
import com.bila.api.models.collections.CollectionRetrieveParams
import com.bila.api.models.collections.CollectionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Payment collection operation endpoints */
interface CollectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectionServiceAsync

    /** Retrieve a single collection by its UUID */
    fun retrieve(id: String): CompletableFuture<CollectionRetrieveResponse> =
        retrieve(id, CollectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
    ): CompletableFuture<CollectionRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CollectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: CollectionRetrieveParams): CompletableFuture<CollectionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionRetrieveResponse> =
        retrieve(id, CollectionRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of payment collections for the authenticated merchant */
    fun list(): CompletableFuture<CollectionListResponse> = list(CollectionListParams.none())

    /** @see list */
    fun list(
        params: CollectionListParams = CollectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionListResponse>

    /** @see list */
    fun list(
        params: CollectionListParams = CollectionListParams.none()
    ): CompletableFuture<CollectionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CollectionListResponse> =
        list(CollectionListParams.none(), requestOptions)

    /** Retrieve collection status by client reference */
    fun getStatusByReference(
        reference: String
    ): CompletableFuture<CollectionGetStatusByReferenceResponse> =
        getStatusByReference(reference, CollectionGetStatusByReferenceParams.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        params: CollectionGetStatusByReferenceParams = CollectionGetStatusByReferenceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionGetStatusByReferenceResponse> =
        getStatusByReference(params.toBuilder().reference(reference).build(), requestOptions)

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        params: CollectionGetStatusByReferenceParams = CollectionGetStatusByReferenceParams.none(),
    ): CompletableFuture<CollectionGetStatusByReferenceResponse> =
        getStatusByReference(reference, params, RequestOptions.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        params: CollectionGetStatusByReferenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionGetStatusByReferenceResponse>

    /** @see getStatusByReference */
    fun getStatusByReference(
        params: CollectionGetStatusByReferenceParams
    ): CompletableFuture<CollectionGetStatusByReferenceResponse> =
        getStatusByReference(params, RequestOptions.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionGetStatusByReferenceResponse> =
        getStatusByReference(reference, CollectionGetStatusByReferenceParams.none(), requestOptions)

    /**
     * Initiate a payment collection from a mobile money account. Creates a transaction record in
     * your dashboard.
     */
    fun initiateMobileMoneyCollection(
        params: CollectionInitiateMobileMoneyCollectionParams
    ): CompletableFuture<CollectionInitiateMobileMoneyCollectionResponse> =
        initiateMobileMoneyCollection(params, RequestOptions.none())

    /** @see initiateMobileMoneyCollection */
    fun initiateMobileMoneyCollection(
        params: CollectionInitiateMobileMoneyCollectionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionInitiateMobileMoneyCollectionResponse>

    /**
     * A view of [CollectionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/collections/{id}`, but is otherwise the
         * same as [CollectionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CollectionRetrieveResponse>> =
            retrieve(id, CollectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CollectionRetrieveParams = CollectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CollectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CollectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionRetrieveResponse>> =
            retrieve(id, CollectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/collections`, but is otherwise the same
         * as [CollectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CollectionListResponse>> =
            list(CollectionListParams.none())

        /** @see list */
        fun list(
            params: CollectionListParams = CollectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionListResponse>>

        /** @see list */
        fun list(
            params: CollectionListParams = CollectionListParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionListResponse>> =
            list(CollectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/collections/status/{reference}`, but is
         * otherwise the same as [CollectionServiceAsync.getStatusByReference].
         */
        fun getStatusByReference(
            reference: String
        ): CompletableFuture<HttpResponseFor<CollectionGetStatusByReferenceResponse>> =
            getStatusByReference(reference, CollectionGetStatusByReferenceParams.none())

        /** @see getStatusByReference */
        fun getStatusByReference(
            reference: String,
            params: CollectionGetStatusByReferenceParams =
                CollectionGetStatusByReferenceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionGetStatusByReferenceResponse>> =
            getStatusByReference(params.toBuilder().reference(reference).build(), requestOptions)

        /** @see getStatusByReference */
        fun getStatusByReference(
            reference: String,
            params: CollectionGetStatusByReferenceParams =
                CollectionGetStatusByReferenceParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionGetStatusByReferenceResponse>> =
            getStatusByReference(reference, params, RequestOptions.none())

        /** @see getStatusByReference */
        fun getStatusByReference(
            params: CollectionGetStatusByReferenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionGetStatusByReferenceResponse>>

        /** @see getStatusByReference */
        fun getStatusByReference(
            params: CollectionGetStatusByReferenceParams
        ): CompletableFuture<HttpResponseFor<CollectionGetStatusByReferenceResponse>> =
            getStatusByReference(params, RequestOptions.none())

        /** @see getStatusByReference */
        fun getStatusByReference(
            reference: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionGetStatusByReferenceResponse>> =
            getStatusByReference(
                reference,
                CollectionGetStatusByReferenceParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/collections/mobile-money`, but is
         * otherwise the same as [CollectionServiceAsync.initiateMobileMoneyCollection].
         */
        fun initiateMobileMoneyCollection(
            params: CollectionInitiateMobileMoneyCollectionParams
        ): CompletableFuture<HttpResponseFor<CollectionInitiateMobileMoneyCollectionResponse>> =
            initiateMobileMoneyCollection(params, RequestOptions.none())

        /** @see initiateMobileMoneyCollection */
        fun initiateMobileMoneyCollection(
            params: CollectionInitiateMobileMoneyCollectionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionInitiateMobileMoneyCollectionResponse>>
    }
}
