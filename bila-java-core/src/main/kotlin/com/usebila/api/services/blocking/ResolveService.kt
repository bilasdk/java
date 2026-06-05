// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.usebila.api.core.ClientOptions
import com.usebila.api.core.RequestOptions
import com.usebila.api.core.http.HttpResponseFor
import com.usebila.api.models.resolve.ResolveBankAccountParams
import com.usebila.api.models.resolve.ResolveBankAccountResponse
import com.usebila.api.models.resolve.ResolveMobileMoneyParams
import com.usebila.api.models.resolve.ResolveMobileMoneyResponse
import java.util.function.Consumer

/** Account resolution/verification endpoints */
interface ResolveService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResolveService

    /** Verify and retrieve bank account holder details */
    fun bankAccount(params: ResolveBankAccountParams): ResolveBankAccountResponse =
        bankAccount(params, RequestOptions.none())

    /** @see bankAccount */
    fun bankAccount(
        params: ResolveBankAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResolveBankAccountResponse

    /** Verify and retrieve mobile money account holder details */
    fun mobileMoney(params: ResolveMobileMoneyParams): ResolveMobileMoneyResponse =
        mobileMoney(params, RequestOptions.none())

    /** @see mobileMoney */
    fun mobileMoney(
        params: ResolveMobileMoneyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResolveMobileMoneyResponse

    /** A view of [ResolveService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResolveService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/resolve/bank-account`, but is
         * otherwise the same as [ResolveService.bankAccount].
         */
        @MustBeClosed
        fun bankAccount(
            params: ResolveBankAccountParams
        ): HttpResponseFor<ResolveBankAccountResponse> = bankAccount(params, RequestOptions.none())

        /** @see bankAccount */
        @MustBeClosed
        fun bankAccount(
            params: ResolveBankAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResolveBankAccountResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/resolve/mobile-money`, but is
         * otherwise the same as [ResolveService.mobileMoney].
         */
        @MustBeClosed
        fun mobileMoney(
            params: ResolveMobileMoneyParams
        ): HttpResponseFor<ResolveMobileMoneyResponse> = mobileMoney(params, RequestOptions.none())

        /** @see mobileMoney */
        @MustBeClosed
        fun mobileMoney(
            params: ResolveMobileMoneyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResolveMobileMoneyResponse>
    }
}
