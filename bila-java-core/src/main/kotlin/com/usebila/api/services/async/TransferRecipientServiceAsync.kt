// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.async

import com.usebila.api.core.ClientOptions
import com.usebila.api.core.RequestOptions
import com.usebila.api.core.http.HttpResponseFor
import com.usebila.api.models.transferrecipients.TransferRecipientCreateBankAccountParams
import com.usebila.api.models.transferrecipients.TransferRecipientCreateBankAccountResponse
import com.usebila.api.models.transferrecipients.TransferRecipientCreateMobileMoneyParams
import com.usebila.api.models.transferrecipients.TransferRecipientCreateMobileMoneyResponse
import com.usebila.api.models.transferrecipients.TransferRecipientListParams
import com.usebila.api.models.transferrecipients.TransferRecipientListResponse
import com.usebila.api.models.transferrecipients.TransferRecipientRetrieveParams
import com.usebila.api.models.transferrecipients.TransferRecipientRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Transfer recipient management endpoints */
interface TransferRecipientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferRecipientServiceAsync

    /** Retrieve a single transfer recipient by its UUID */
    fun retrieve(id: String): CompletableFuture<TransferRecipientRetrieveResponse> =
        retrieve(id, TransferRecipientRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRecipientRetrieveParams = TransferRecipientRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferRecipientRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRecipientRetrieveParams = TransferRecipientRetrieveParams.none(),
    ): CompletableFuture<TransferRecipientRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransferRecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferRecipientRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: TransferRecipientRetrieveParams
    ): CompletableFuture<TransferRecipientRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferRecipientRetrieveResponse> =
        retrieve(id, TransferRecipientRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of saved transfer recipients */
    fun list(): CompletableFuture<TransferRecipientListResponse> =
        list(TransferRecipientListParams.none())

    /** @see list */
    fun list(
        params: TransferRecipientListParams = TransferRecipientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferRecipientListResponse>

    /** @see list */
    fun list(
        params: TransferRecipientListParams = TransferRecipientListParams.none()
    ): CompletableFuture<TransferRecipientListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransferRecipientListResponse> =
        list(TransferRecipientListParams.none(), requestOptions)

    /** Create a new bank account transfer recipient */
    fun createBankAccount(
        params: TransferRecipientCreateBankAccountParams
    ): CompletableFuture<TransferRecipientCreateBankAccountResponse> =
        createBankAccount(params, RequestOptions.none())

    /** @see createBankAccount */
    fun createBankAccount(
        params: TransferRecipientCreateBankAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferRecipientCreateBankAccountResponse>

    /** Create a new mobile money transfer recipient */
    fun createMobileMoney(
        params: TransferRecipientCreateMobileMoneyParams
    ): CompletableFuture<TransferRecipientCreateMobileMoneyResponse> =
        createMobileMoney(params, RequestOptions.none())

    /** @see createMobileMoney */
    fun createMobileMoney(
        params: TransferRecipientCreateMobileMoneyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferRecipientCreateMobileMoneyResponse>

    /**
     * A view of [TransferRecipientServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransferRecipientServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transfer-recipients/{id}`, but is
         * otherwise the same as [TransferRecipientServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<TransferRecipientRetrieveResponse>> =
            retrieve(id, TransferRecipientRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransferRecipientRetrieveParams = TransferRecipientRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferRecipientRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransferRecipientRetrieveParams = TransferRecipientRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TransferRecipientRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransferRecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferRecipientRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TransferRecipientRetrieveParams
        ): CompletableFuture<HttpResponseFor<TransferRecipientRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferRecipientRetrieveResponse>> =
            retrieve(id, TransferRecipientRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transfer-recipients`, but is otherwise
         * the same as [TransferRecipientServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TransferRecipientListResponse>> =
            list(TransferRecipientListParams.none())

        /** @see list */
        fun list(
            params: TransferRecipientListParams = TransferRecipientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferRecipientListResponse>>

        /** @see list */
        fun list(
            params: TransferRecipientListParams = TransferRecipientListParams.none()
        ): CompletableFuture<HttpResponseFor<TransferRecipientListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransferRecipientListResponse>> =
            list(TransferRecipientListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/transfer-recipients/bank-account`, but
         * is otherwise the same as [TransferRecipientServiceAsync.createBankAccount].
         */
        fun createBankAccount(
            params: TransferRecipientCreateBankAccountParams
        ): CompletableFuture<HttpResponseFor<TransferRecipientCreateBankAccountResponse>> =
            createBankAccount(params, RequestOptions.none())

        /** @see createBankAccount */
        fun createBankAccount(
            params: TransferRecipientCreateBankAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferRecipientCreateBankAccountResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/transfer-recipients/mobile-money`, but
         * is otherwise the same as [TransferRecipientServiceAsync.createMobileMoney].
         */
        fun createMobileMoney(
            params: TransferRecipientCreateMobileMoneyParams
        ): CompletableFuture<HttpResponseFor<TransferRecipientCreateMobileMoneyResponse>> =
            createMobileMoney(params, RequestOptions.none())

        /** @see createMobileMoney */
        fun createMobileMoney(
            params: TransferRecipientCreateMobileMoneyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferRecipientCreateMobileMoneyResponse>>
    }
}
