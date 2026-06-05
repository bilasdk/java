// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.async

import com.usebila.api.core.ClientOptions
import com.usebila.api.core.RequestOptions
import com.usebila.api.core.http.HttpResponseFor
import com.usebila.api.models.accounts.AccountGetBalanceParams
import com.usebila.api.models.accounts.AccountGetBalanceResponse
import com.usebila.api.models.accounts.AccountListParams
import com.usebila.api.models.accounts.AccountListResponse
import com.usebila.api.models.accounts.AccountRetrieveParams
import com.usebila.api.models.accounts.AccountRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Account/wallet management endpoints */
interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    /** Retrieve a single account by its UUID */
    fun retrieve(id: String): CompletableFuture<AccountRetrieveResponse> =
        retrieve(id, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): CompletableFuture<AccountRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams): CompletableFuture<AccountRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountRetrieveResponse> =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of accounts/wallets for the authenticated merchant */
    fun list(): CompletableFuture<AccountListResponse> = list(AccountListParams.none())

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountListResponse>

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none()
    ): CompletableFuture<AccountListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountListResponse> =
        list(AccountListParams.none(), requestOptions)

    /** Retrieve the balance of a specific account */
    fun getBalance(id: String): CompletableFuture<AccountGetBalanceResponse> =
        getBalance(id, AccountGetBalanceParams.none())

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetBalanceResponse> =
        getBalance(params.toBuilder().id(id).build(), requestOptions)

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
    ): CompletableFuture<AccountGetBalanceResponse> = getBalance(id, params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(
        params: AccountGetBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetBalanceResponse>

    /** @see getBalance */
    fun getBalance(params: AccountGetBalanceParams): CompletableFuture<AccountGetBalanceResponse> =
        getBalance(params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountGetBalanceResponse> =
        getBalance(id, AccountGetBalanceParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/accounts/{id}`, but is otherwise the
         * same as [AccountServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(id, AccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountListResponse>> =
            list(AccountListParams.none())

        /** @see list */
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountListResponse>>

        /** @see list */
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountListResponse>> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/accounts/{id}/balance`, but is
         * otherwise the same as [AccountServiceAsync.getBalance].
         */
        fun getBalance(id: String): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>> =
            getBalance(id, AccountGetBalanceParams.none())

        /** @see getBalance */
        fun getBalance(
            id: String,
            params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>> =
            getBalance(params.toBuilder().id(id).build(), requestOptions)

        /** @see getBalance */
        fun getBalance(
            id: String,
            params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>> =
            getBalance(id, params, RequestOptions.none())

        /** @see getBalance */
        fun getBalance(
            params: AccountGetBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>>

        /** @see getBalance */
        fun getBalance(
            params: AccountGetBalanceParams
        ): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>> =
            getBalance(params, RequestOptions.none())

        /** @see getBalance */
        fun getBalance(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>> =
            getBalance(id, AccountGetBalanceParams.none(), requestOptions)
    }
}
