// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.usebila.api.core.ClientOptions
import com.usebila.api.core.RequestOptions
import com.usebila.api.core.http.HttpResponseFor
import com.usebila.api.models.transactions.TransactionListParams
import com.usebila.api.models.transactions.TransactionListResponse
import com.usebila.api.models.transactions.TransactionRetrieveParams
import com.usebila.api.models.transactions.TransactionRetrieveResponse
import java.util.function.Consumer

/** Transaction history endpoints */
interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionService

    /** Retrieve a single transaction by its UUID */
    fun retrieve(id: String): TransactionRetrieveResponse =
        retrieve(id, TransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
    ): TransactionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TransactionRetrieveParams): TransactionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TransactionRetrieveResponse =
        retrieve(id, TransactionRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of transactions */
    fun list(): TransactionListResponse = list(TransactionListParams.none())

    /** @see list */
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListResponse

    /** @see list */
    fun list(
        params: TransactionListParams = TransactionListParams.none()
    ): TransactionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TransactionListResponse =
        list(TransactionListParams.none(), requestOptions)

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transactions/{id}`, but is otherwise
         * the same as [TransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(id, TransactionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams
        ): HttpResponseFor<TransactionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(id, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transactions`, but is otherwise the
         * same as [TransactionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TransactionListResponse> = list(TransactionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none()
        ): HttpResponseFor<TransactionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionListResponse> =
            list(TransactionListParams.none(), requestOptions)
    }
}
