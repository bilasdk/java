// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.blocking

import com.bila.api.core.ClientOptions
import com.bila.api.core.RequestOptions
import com.bila.api.core.http.HttpResponseFor
import com.bila.api.models.transfers.TransferGetStatusByReferenceParams
import com.bila.api.models.transfers.TransferGetStatusByReferenceResponse
import com.bila.api.models.transfers.TransferInitiateBankTransferParams
import com.bila.api.models.transfers.TransferInitiateBankTransferResponse
import com.bila.api.models.transfers.TransferInitiateMobileMoneyTransferParams
import com.bila.api.models.transfers.TransferInitiateMobileMoneyTransferResponse
import com.bila.api.models.transfers.TransferListParams
import com.bila.api.models.transfers.TransferListResponse
import com.bila.api.models.transfers.TransferRetrieveParams
import com.bila.api.models.transfers.TransferRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Payout/transfer operation endpoints */
interface TransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferService

    /** Retrieve a single transfer by its UUID */
    fun retrieve(id: String): TransferRetrieveResponse = retrieve(id, TransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRetrieveParams = TransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRetrieveParams = TransferRetrieveParams.none(),
    ): TransferRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TransferRetrieveParams): TransferRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TransferRetrieveResponse =
        retrieve(id, TransferRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of transfers/payouts for the authenticated merchant */
    fun list(): TransferListResponse = list(TransferListParams.none())

    /** @see list */
    fun list(
        params: TransferListParams = TransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferListResponse

    /** @see list */
    fun list(params: TransferListParams = TransferListParams.none()): TransferListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TransferListResponse =
        list(TransferListParams.none(), requestOptions)

    /** Retrieve transfer status by client reference */
    fun getStatusByReference(reference: String): TransferGetStatusByReferenceResponse =
        getStatusByReference(reference, TransferGetStatusByReferenceParams.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        params: TransferGetStatusByReferenceParams = TransferGetStatusByReferenceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferGetStatusByReferenceResponse =
        getStatusByReference(params.toBuilder().reference(reference).build(), requestOptions)

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        params: TransferGetStatusByReferenceParams = TransferGetStatusByReferenceParams.none(),
    ): TransferGetStatusByReferenceResponse =
        getStatusByReference(reference, params, RequestOptions.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        params: TransferGetStatusByReferenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferGetStatusByReferenceResponse

    /** @see getStatusByReference */
    fun getStatusByReference(
        params: TransferGetStatusByReferenceParams
    ): TransferGetStatusByReferenceResponse = getStatusByReference(params, RequestOptions.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        requestOptions: RequestOptions,
    ): TransferGetStatusByReferenceResponse =
        getStatusByReference(reference, TransferGetStatusByReferenceParams.none(), requestOptions)

    /** Initiate a transfer to a bank account. Creates a transaction record in your dashboard. */
    fun initiateBankTransfer(
        params: TransferInitiateBankTransferParams
    ): TransferInitiateBankTransferResponse = initiateBankTransfer(params, RequestOptions.none())

    /** @see initiateBankTransfer */
    fun initiateBankTransfer(
        params: TransferInitiateBankTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferInitiateBankTransferResponse

    /**
     * Initiate a transfer to a mobile money account. Creates a transaction record in your
     * dashboard.
     */
    fun initiateMobileMoneyTransfer(
        params: TransferInitiateMobileMoneyTransferParams
    ): TransferInitiateMobileMoneyTransferResponse =
        initiateMobileMoneyTransfer(params, RequestOptions.none())

    /** @see initiateMobileMoneyTransfer */
    fun initiateMobileMoneyTransfer(
        params: TransferInitiateMobileMoneyTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferInitiateMobileMoneyTransferResponse

    /** A view of [TransferService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transfers/{id}`, but is otherwise the
         * same as [TransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TransferRetrieveResponse> =
            retrieve(id, TransferRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransferRetrieveParams = TransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransferRetrieveParams = TransferRetrieveParams.none(),
        ): HttpResponseFor<TransferRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TransferRetrieveParams): HttpResponseFor<TransferRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransferRetrieveResponse> =
            retrieve(id, TransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transfers`, but is otherwise the same
         * as [TransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TransferListResponse> = list(TransferListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransferListParams = TransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransferListParams = TransferListParams.none()
        ): HttpResponseFor<TransferListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransferListResponse> =
            list(TransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transfers/status/{reference}`, but is
         * otherwise the same as [TransferService.getStatusByReference].
         */
        @MustBeClosed
        fun getStatusByReference(
            reference: String
        ): HttpResponseFor<TransferGetStatusByReferenceResponse> =
            getStatusByReference(reference, TransferGetStatusByReferenceParams.none())

        /** @see getStatusByReference */
        @MustBeClosed
        fun getStatusByReference(
            reference: String,
            params: TransferGetStatusByReferenceParams = TransferGetStatusByReferenceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferGetStatusByReferenceResponse> =
            getStatusByReference(params.toBuilder().reference(reference).build(), requestOptions)

        /** @see getStatusByReference */
        @MustBeClosed
        fun getStatusByReference(
            reference: String,
            params: TransferGetStatusByReferenceParams = TransferGetStatusByReferenceParams.none(),
        ): HttpResponseFor<TransferGetStatusByReferenceResponse> =
            getStatusByReference(reference, params, RequestOptions.none())

        /** @see getStatusByReference */
        @MustBeClosed
        fun getStatusByReference(
            params: TransferGetStatusByReferenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferGetStatusByReferenceResponse>

        /** @see getStatusByReference */
        @MustBeClosed
        fun getStatusByReference(
            params: TransferGetStatusByReferenceParams
        ): HttpResponseFor<TransferGetStatusByReferenceResponse> =
            getStatusByReference(params, RequestOptions.none())

        /** @see getStatusByReference */
        @MustBeClosed
        fun getStatusByReference(
            reference: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransferGetStatusByReferenceResponse> =
            getStatusByReference(
                reference,
                TransferGetStatusByReferenceParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/transfers/bank-account`, but is
         * otherwise the same as [TransferService.initiateBankTransfer].
         */
        @MustBeClosed
        fun initiateBankTransfer(
            params: TransferInitiateBankTransferParams
        ): HttpResponseFor<TransferInitiateBankTransferResponse> =
            initiateBankTransfer(params, RequestOptions.none())

        /** @see initiateBankTransfer */
        @MustBeClosed
        fun initiateBankTransfer(
            params: TransferInitiateBankTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferInitiateBankTransferResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/transfers/mobile-money`, but is
         * otherwise the same as [TransferService.initiateMobileMoneyTransfer].
         */
        @MustBeClosed
        fun initiateMobileMoneyTransfer(
            params: TransferInitiateMobileMoneyTransferParams
        ): HttpResponseFor<TransferInitiateMobileMoneyTransferResponse> =
            initiateMobileMoneyTransfer(params, RequestOptions.none())

        /** @see initiateMobileMoneyTransfer */
        @MustBeClosed
        fun initiateMobileMoneyTransfer(
            params: TransferInitiateMobileMoneyTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferInitiateMobileMoneyTransferResponse>
    }
}
