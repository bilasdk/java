// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Payout/transfer operation endpoints */
interface TransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferServiceAsync

    /** Retrieve a single transfer by its UUID */
    fun retrieve(id: String): CompletableFuture<TransferRetrieveResponse> =
        retrieve(id, TransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRetrieveParams = TransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRetrieveParams = TransferRetrieveParams.none(),
    ): CompletableFuture<TransferRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: TransferRetrieveParams): CompletableFuture<TransferRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferRetrieveResponse> =
        retrieve(id, TransferRetrieveParams.none(), requestOptions)

    /** Retrieve a paginated list of transfers/payouts for the authenticated merchant */
    fun list(): CompletableFuture<TransferListResponse> = list(TransferListParams.none())

    /** @see list */
    fun list(
        params: TransferListParams = TransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferListResponse>

    /** @see list */
    fun list(
        params: TransferListParams = TransferListParams.none()
    ): CompletableFuture<TransferListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransferListResponse> =
        list(TransferListParams.none(), requestOptions)

    /** Retrieve transfer status by client reference */
    fun getStatusByReference(
        reference: String
    ): CompletableFuture<TransferGetStatusByReferenceResponse> =
        getStatusByReference(reference, TransferGetStatusByReferenceParams.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        params: TransferGetStatusByReferenceParams = TransferGetStatusByReferenceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferGetStatusByReferenceResponse> =
        getStatusByReference(params.toBuilder().reference(reference).build(), requestOptions)

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        params: TransferGetStatusByReferenceParams = TransferGetStatusByReferenceParams.none(),
    ): CompletableFuture<TransferGetStatusByReferenceResponse> =
        getStatusByReference(reference, params, RequestOptions.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        params: TransferGetStatusByReferenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferGetStatusByReferenceResponse>

    /** @see getStatusByReference */
    fun getStatusByReference(
        params: TransferGetStatusByReferenceParams
    ): CompletableFuture<TransferGetStatusByReferenceResponse> =
        getStatusByReference(params, RequestOptions.none())

    /** @see getStatusByReference */
    fun getStatusByReference(
        reference: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransferGetStatusByReferenceResponse> =
        getStatusByReference(reference, TransferGetStatusByReferenceParams.none(), requestOptions)

    /** Initiate a transfer to a bank account. Creates a transaction record in your dashboard. */
    fun initiateBankTransfer(
        params: TransferInitiateBankTransferParams
    ): CompletableFuture<TransferInitiateBankTransferResponse> =
        initiateBankTransfer(params, RequestOptions.none())

    /** @see initiateBankTransfer */
    fun initiateBankTransfer(
        params: TransferInitiateBankTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferInitiateBankTransferResponse>

    /**
     * Initiate a transfer to a mobile money account. Creates a transaction record in your
     * dashboard.
     */
    fun initiateMobileMoneyTransfer(
        params: TransferInitiateMobileMoneyTransferParams
    ): CompletableFuture<TransferInitiateMobileMoneyTransferResponse> =
        initiateMobileMoneyTransfer(params, RequestOptions.none())

    /** @see initiateMobileMoneyTransfer */
    fun initiateMobileMoneyTransfer(
        params: TransferInitiateMobileMoneyTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferInitiateMobileMoneyTransferResponse>

    /**
     * A view of [TransferServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transfers/{id}`, but is otherwise the
         * same as [TransferServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<TransferRetrieveResponse>> =
            retrieve(id, TransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransferRetrieveParams = TransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransferRetrieveParams = TransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TransferRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<TransferRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferRetrieveResponse>> =
            retrieve(id, TransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transfers`, but is otherwise the same
         * as [TransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TransferListResponse>> =
            list(TransferListParams.none())

        /** @see list */
        fun list(
            params: TransferListParams = TransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferListResponse>>

        /** @see list */
        fun list(
            params: TransferListParams = TransferListParams.none()
        ): CompletableFuture<HttpResponseFor<TransferListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransferListResponse>> =
            list(TransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/bila/transfers/status/{reference}`, but is
         * otherwise the same as [TransferServiceAsync.getStatusByReference].
         */
        fun getStatusByReference(
            reference: String
        ): CompletableFuture<HttpResponseFor<TransferGetStatusByReferenceResponse>> =
            getStatusByReference(reference, TransferGetStatusByReferenceParams.none())

        /** @see getStatusByReference */
        fun getStatusByReference(
            reference: String,
            params: TransferGetStatusByReferenceParams = TransferGetStatusByReferenceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferGetStatusByReferenceResponse>> =
            getStatusByReference(params.toBuilder().reference(reference).build(), requestOptions)

        /** @see getStatusByReference */
        fun getStatusByReference(
            reference: String,
            params: TransferGetStatusByReferenceParams = TransferGetStatusByReferenceParams.none(),
        ): CompletableFuture<HttpResponseFor<TransferGetStatusByReferenceResponse>> =
            getStatusByReference(reference, params, RequestOptions.none())

        /** @see getStatusByReference */
        fun getStatusByReference(
            params: TransferGetStatusByReferenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferGetStatusByReferenceResponse>>

        /** @see getStatusByReference */
        fun getStatusByReference(
            params: TransferGetStatusByReferenceParams
        ): CompletableFuture<HttpResponseFor<TransferGetStatusByReferenceResponse>> =
            getStatusByReference(params, RequestOptions.none())

        /** @see getStatusByReference */
        fun getStatusByReference(
            reference: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransferGetStatusByReferenceResponse>> =
            getStatusByReference(
                reference,
                TransferGetStatusByReferenceParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/transfers/bank-account`, but is
         * otherwise the same as [TransferServiceAsync.initiateBankTransfer].
         */
        fun initiateBankTransfer(
            params: TransferInitiateBankTransferParams
        ): CompletableFuture<HttpResponseFor<TransferInitiateBankTransferResponse>> =
            initiateBankTransfer(params, RequestOptions.none())

        /** @see initiateBankTransfer */
        fun initiateBankTransfer(
            params: TransferInitiateBankTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferInitiateBankTransferResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/bila/transfers/mobile-money`, but is
         * otherwise the same as [TransferServiceAsync.initiateMobileMoneyTransfer].
         */
        fun initiateMobileMoneyTransfer(
            params: TransferInitiateMobileMoneyTransferParams
        ): CompletableFuture<HttpResponseFor<TransferInitiateMobileMoneyTransferResponse>> =
            initiateMobileMoneyTransfer(params, RequestOptions.none())

        /** @see initiateMobileMoneyTransfer */
        fun initiateMobileMoneyTransfer(
            params: TransferInitiateMobileMoneyTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferInitiateMobileMoneyTransferResponse>>
    }
}
