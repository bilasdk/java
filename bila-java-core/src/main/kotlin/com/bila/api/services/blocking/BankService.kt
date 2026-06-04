// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.blocking

import com.bila.api.core.ClientOptions
import com.bila.api.core.RequestOptions
import com.bila.api.core.http.HttpResponseFor
import com.bila.api.models.banks.BankListParams
import com.bila.api.models.banks.BankListResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Bank reference data endpoints */
interface BankService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BankService

    /** Retrieve a list of all supported banks and financial institutions */
    fun list(): BankListResponse = list(BankListParams.none())

    /** @see list */
    fun list(
        params: BankListParams = BankListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BankListResponse

    /** @see list */
    fun list(params: BankListParams = BankListParams.none()): BankListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BankListResponse =
        list(BankListParams.none(), requestOptions)

    /** A view of [BankService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BankService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/banks`, but is otherwise the same as
         * [BankService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BankListResponse> = list(BankListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BankListParams = BankListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BankListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BankListParams = BankListParams.none()
        ): HttpResponseFor<BankListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BankListResponse> =
            list(BankListParams.none(), requestOptions)
    }
}
