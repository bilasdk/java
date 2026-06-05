// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Transfer recipient management endpoints */
interface TransferRecipientService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferRecipientService

    /** Retrieve a single transfer recipient by its UUID */
    fun retrieve(id: String): TransferRecipientRetrieveResponse =
        retrieve(id, TransferRecipientRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRecipientRetrieveParams = TransferRecipientRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferRecipientRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRecipientRetrieveParams = TransferRecipientRetrieveParams.none(),
    ): TransferRecipientRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransferRecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferRecipientRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TransferRecipientRetrieveParams): TransferRecipientRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TransferRecipientRetrieveResponse =
        retrieve(id, TransferRecipientRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of saved transfer recipients */
    fun list(): TransferRecipientListResponse = list(TransferRecipientListParams.none())

    /** @see list */
    fun list(
        params: TransferRecipientListParams = TransferRecipientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferRecipientListResponse

    /** @see list */
    fun list(
        params: TransferRecipientListParams = TransferRecipientListParams.none()
    ): TransferRecipientListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TransferRecipientListResponse =
        list(TransferRecipientListParams.none(), requestOptions)

    /** Create a new bank account transfer recipient */
    fun createBankAccount(
        params: TransferRecipientCreateBankAccountParams
    ): TransferRecipientCreateBankAccountResponse = createBankAccount(params, RequestOptions.none())

    /** @see createBankAccount */
    fun createBankAccount(
        params: TransferRecipientCreateBankAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferRecipientCreateBankAccountResponse

    /** Create a new mobile money transfer recipient */
    fun createMobileMoney(
        params: TransferRecipientCreateMobileMoneyParams
    ): TransferRecipientCreateMobileMoneyResponse = createMobileMoney(params, RequestOptions.none())

    /** @see createMobileMoney */
    fun createMobileMoney(
        params: TransferRecipientCreateMobileMoneyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferRecipientCreateMobileMoneyResponse

    /**
     * A view of [TransferRecipientService] that provides access to raw HTTP responses for each
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
        ): TransferRecipientService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transfer-recipients/{id}`, but is
         * otherwise the same as [TransferRecipientService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TransferRecipientRetrieveResponse> =
            retrieve(id, TransferRecipientRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransferRecipientRetrieveParams = TransferRecipientRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferRecipientRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransferRecipientRetrieveParams = TransferRecipientRetrieveParams.none(),
        ): HttpResponseFor<TransferRecipientRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransferRecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferRecipientRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransferRecipientRetrieveParams
        ): HttpResponseFor<TransferRecipientRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransferRecipientRetrieveResponse> =
            retrieve(id, TransferRecipientRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transfer-recipients`, but is otherwise
         * the same as [TransferRecipientService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TransferRecipientListResponse> =
            list(TransferRecipientListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransferRecipientListParams = TransferRecipientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferRecipientListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransferRecipientListParams = TransferRecipientListParams.none()
        ): HttpResponseFor<TransferRecipientListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransferRecipientListResponse> =
            list(TransferRecipientListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/transfer-recipients/bank-account`, but
         * is otherwise the same as [TransferRecipientService.createBankAccount].
         */
        @MustBeClosed
        fun createBankAccount(
            params: TransferRecipientCreateBankAccountParams
        ): HttpResponseFor<TransferRecipientCreateBankAccountResponse> =
            createBankAccount(params, RequestOptions.none())

        /** @see createBankAccount */
        @MustBeClosed
        fun createBankAccount(
            params: TransferRecipientCreateBankAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferRecipientCreateBankAccountResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/transfer-recipients/mobile-money`, but
         * is otherwise the same as [TransferRecipientService.createMobileMoney].
         */
        @MustBeClosed
        fun createMobileMoney(
            params: TransferRecipientCreateMobileMoneyParams
        ): HttpResponseFor<TransferRecipientCreateMobileMoneyResponse> =
            createMobileMoney(params, RequestOptions.none())

        /** @see createMobileMoney */
        @MustBeClosed
        fun createMobileMoney(
            params: TransferRecipientCreateMobileMoneyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferRecipientCreateMobileMoneyResponse>
    }
}
