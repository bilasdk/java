// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.blocking

import com.bila.api.core.ClientOptions
import com.bila.api.core.RequestOptions
import com.bila.api.core.http.HttpResponseFor
import com.bila.api.models.accounts.AccountGetBalanceParams
import com.bila.api.models.accounts.AccountGetBalanceResponse
import com.bila.api.models.accounts.AccountListParams
import com.bila.api.models.accounts.AccountListResponse
import com.bila.api.models.accounts.AccountRetrieveParams
import com.bila.api.models.accounts.AccountRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Account/wallet management endpoints */
interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    /** Retrieve a single account by its UUID */
    fun retrieve(id: String): AccountRetrieveResponse = retrieve(id, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): AccountRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams): AccountRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AccountRetrieveResponse =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of accounts/wallets for the authenticated merchant */
    fun list(): AccountListResponse = list(AccountListParams.none())

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountListResponse

    /** @see list */
    fun list(params: AccountListParams = AccountListParams.none()): AccountListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccountListResponse =
        list(AccountListParams.none(), requestOptions)

    /** Retrieve the balance of a specific account */
    fun getBalance(id: String): AccountGetBalanceResponse =
        getBalance(id, AccountGetBalanceParams.none())

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetBalanceResponse = getBalance(params.toBuilder().id(id).build(), requestOptions)

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
    ): AccountGetBalanceResponse = getBalance(id, params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(
        params: AccountGetBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetBalanceResponse

    /** @see getBalance */
    fun getBalance(params: AccountGetBalanceParams): AccountGetBalanceResponse =
        getBalance(params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(id: String, requestOptions: RequestOptions): AccountGetBalanceResponse =
        getBalance(id, AccountGetBalanceParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/accounts/{id}`, but is otherwise the
         * same as [AccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AccountRetrieveResponse> =
            retrieve(id, AccountRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): HttpResponseFor<AccountRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AccountRetrieveParams): HttpResponseFor<AccountRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountRetrieveResponse> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/accounts`, but is otherwise the same as
         * [AccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountListResponse> = list(AccountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): HttpResponseFor<AccountListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountListResponse> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/accounts/{id}/balance`, but is
         * otherwise the same as [AccountService.getBalance].
         */
        @MustBeClosed
        fun getBalance(id: String): HttpResponseFor<AccountGetBalanceResponse> =
            getBalance(id, AccountGetBalanceParams.none())

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            id: String,
            params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetBalanceResponse> =
            getBalance(params.toBuilder().id(id).build(), requestOptions)

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            id: String,
            params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
        ): HttpResponseFor<AccountGetBalanceResponse> =
            getBalance(id, params, RequestOptions.none())

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            params: AccountGetBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetBalanceResponse>

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            params: AccountGetBalanceParams
        ): HttpResponseFor<AccountGetBalanceResponse> = getBalance(params, RequestOptions.none())

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountGetBalanceResponse> =
            getBalance(id, AccountGetBalanceParams.none(), requestOptions)
    }
}
