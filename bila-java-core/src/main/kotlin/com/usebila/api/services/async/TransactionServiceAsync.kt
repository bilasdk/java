// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.async

import com.usebila.api.core.ClientOptions
import com.usebila.api.core.RequestOptions
import com.usebila.api.core.http.HttpResponseFor
import com.usebila.api.models.transactions.TransactionListParams
import com.usebila.api.models.transactions.TransactionListResponse
import com.usebila.api.models.transactions.TransactionRetrieveParams
import com.usebila.api.models.transactions.TransactionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Transaction history endpoints */
interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionServiceAsync

    /** Retrieve a single transaction by its UUID */
    fun retrieve(id: String): CompletableFuture<TransactionRetrieveResponse> =
        retrieve(id, TransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
    ): CompletableFuture<TransactionRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams
    ): CompletableFuture<TransactionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionRetrieveResponse> =
        retrieve(id, TransactionRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of transactions */
    fun list(): CompletableFuture<TransactionListResponse> = list(TransactionListParams.none())

    /** @see list */
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionListResponse>

    /** @see list */
    fun list(
        params: TransactionListParams = TransactionListParams.none()
    ): CompletableFuture<TransactionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransactionListResponse> =
        list(TransactionListParams.none(), requestOptions)

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transactions/{id}`, but is otherwise
         * the same as [TransactionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(id, TransactionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(id, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transactions`, but is otherwise the
         * same as [TransactionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TransactionListResponse>> =
            list(TransactionListParams.none())

        /** @see list */
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionListResponse>>

        /** @see list */
        fun list(
            params: TransactionListParams = TransactionListParams.none()
        ): CompletableFuture<HttpResponseFor<TransactionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransactionListResponse>> =
            list(TransactionListParams.none(), requestOptions)
    }
}
