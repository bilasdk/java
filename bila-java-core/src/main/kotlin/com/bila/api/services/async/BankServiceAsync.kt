// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.async

import com.bila.api.core.ClientOptions
import com.bila.api.core.RequestOptions
import com.bila.api.core.http.HttpResponseFor
import com.bila.api.models.banks.BankListParams
import com.bila.api.models.banks.BankListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Bank reference data endpoints */
interface BankServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BankServiceAsync

    /** Retrieve a list of all supported banks and financial institutions */
    fun list(): CompletableFuture<BankListResponse> = list(BankListParams.none())

    /** @see list */
    fun list(
        params: BankListParams = BankListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BankListResponse>

    /** @see list */
    fun list(params: BankListParams = BankListParams.none()): CompletableFuture<BankListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BankListResponse> =
        list(BankListParams.none(), requestOptions)

    /** A view of [BankServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BankServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/banks`, but is otherwise the same as
         * [BankServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BankListResponse>> =
            list(BankListParams.none())

        /** @see list */
        fun list(
            params: BankListParams = BankListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BankListResponse>>

        /** @see list */
        fun list(
            params: BankListParams = BankListParams.none()
        ): CompletableFuture<HttpResponseFor<BankListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BankListResponse>> =
            list(BankListParams.none(), requestOptions)
    }
}
