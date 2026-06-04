// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.async

import com.bila.api.core.ClientOptions
import com.bila.api.core.RequestOptions
import com.bila.api.core.http.HttpResponseFor
import com.bila.api.models.resolve.ResolveBankAccountParams
import com.bila.api.models.resolve.ResolveBankAccountResponse
import com.bila.api.models.resolve.ResolveMobileMoneyParams
import com.bila.api.models.resolve.ResolveMobileMoneyResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Account resolution/verification endpoints */
interface ResolveServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResolveServiceAsync

    /** Verify and retrieve bank account holder details */
    fun bankAccount(
        params: ResolveBankAccountParams
    ): CompletableFuture<ResolveBankAccountResponse> = bankAccount(params, RequestOptions.none())

    /** @see bankAccount */
    fun bankAccount(
        params: ResolveBankAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResolveBankAccountResponse>

    /** Verify and retrieve mobile money account holder details */
    fun mobileMoney(
        params: ResolveMobileMoneyParams
    ): CompletableFuture<ResolveMobileMoneyResponse> = mobileMoney(params, RequestOptions.none())

    /** @see mobileMoney */
    fun mobileMoney(
        params: ResolveMobileMoneyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResolveMobileMoneyResponse>

    /**
     * A view of [ResolveServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResolveServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/resolve/bank-account`, but is
         * otherwise the same as [ResolveServiceAsync.bankAccount].
         */
        fun bankAccount(
            params: ResolveBankAccountParams
        ): CompletableFuture<HttpResponseFor<ResolveBankAccountResponse>> =
            bankAccount(params, RequestOptions.none())

        /** @see bankAccount */
        fun bankAccount(
            params: ResolveBankAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResolveBankAccountResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/resolve/mobile-money`, but is
         * otherwise the same as [ResolveServiceAsync.mobileMoney].
         */
        fun mobileMoney(
            params: ResolveMobileMoneyParams
        ): CompletableFuture<HttpResponseFor<ResolveMobileMoneyResponse>> =
            mobileMoney(params, RequestOptions.none())

        /** @see mobileMoney */
        fun mobileMoney(
            params: ResolveMobileMoneyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResolveMobileMoneyResponse>>
    }
}
