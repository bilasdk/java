// File generated from our OpenAPI spec by Stainless.

package com.bila.api.client

import com.bila.api.core.ClientOptions
import com.bila.api.core.getPackageVersion
import com.bila.api.services.async.AccountServiceAsync
import com.bila.api.services.async.AccountServiceAsyncImpl
import com.bila.api.services.async.BankServiceAsync
import com.bila.api.services.async.BankServiceAsyncImpl
import com.bila.api.services.async.CollectionServiceAsync
import com.bila.api.services.async.CollectionServiceAsyncImpl
import com.bila.api.services.async.ResolveServiceAsync
import com.bila.api.services.async.ResolveServiceAsyncImpl
import com.bila.api.services.async.TransactionServiceAsync
import com.bila.api.services.async.TransactionServiceAsyncImpl
import com.bila.api.services.async.TransferRecipientServiceAsync
import com.bila.api.services.async.TransferRecipientServiceAsyncImpl
import com.bila.api.services.async.TransferServiceAsync
import com.bila.api.services.async.TransferServiceAsyncImpl
import com.bila.api.services.async.WebhookServiceAsync
import com.bila.api.services.async.WebhookServiceAsyncImpl
import java.util.function.Consumer

class BilaClientAsyncImpl(private val clientOptions: ClientOptions) : BilaClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: BilaClient by lazy { BilaClientImpl(clientOptions) }

    private val withRawResponse: BilaClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transferRecipients: TransferRecipientServiceAsync by lazy {
        TransferRecipientServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transfers: TransferServiceAsync by lazy {
        TransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val collections: CollectionServiceAsync by lazy {
        CollectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val banks: BankServiceAsync by lazy { BankServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val resolve: ResolveServiceAsync by lazy {
        ResolveServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): BilaClient = sync

    override fun withRawResponse(): BilaClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BilaClientAsync =
        BilaClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Account/wallet management endpoints */
    override fun accounts(): AccountServiceAsync = accounts

    /** Transfer recipient management endpoints */
    override fun transferRecipients(): TransferRecipientServiceAsync = transferRecipients

    /** Payout/transfer operation endpoints */
    override fun transfers(): TransferServiceAsync = transfers

    /** Payment collection operation endpoints */
    override fun collections(): CollectionServiceAsync = collections

    /** Transaction history endpoints */
    override fun transactions(): TransactionServiceAsync = transactions

    /** Webhook configuration and delivery history */
    override fun webhooks(): WebhookServiceAsync = webhooks

    /** Bank reference data endpoints */
    override fun banks(): BankServiceAsync = banks

    /** Account resolution/verification endpoints */
    override fun resolve(): ResolveServiceAsync = resolve

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BilaClientAsync.WithRawResponse {

        private val accounts: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transferRecipients: TransferRecipientServiceAsync.WithRawResponse by lazy {
            TransferRecipientServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transfers: TransferServiceAsync.WithRawResponse by lazy {
            TransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val collections: CollectionServiceAsync.WithRawResponse by lazy {
            CollectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionServiceAsync.WithRawResponse by lazy {
            TransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val banks: BankServiceAsync.WithRawResponse by lazy {
            BankServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val resolve: ResolveServiceAsync.WithRawResponse by lazy {
            ResolveServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BilaClientAsync.WithRawResponse =
            BilaClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Account/wallet management endpoints */
        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        /** Transfer recipient management endpoints */
        override fun transferRecipients(): TransferRecipientServiceAsync.WithRawResponse =
            transferRecipients

        /** Payout/transfer operation endpoints */
        override fun transfers(): TransferServiceAsync.WithRawResponse = transfers

        /** Payment collection operation endpoints */
        override fun collections(): CollectionServiceAsync.WithRawResponse = collections

        /** Transaction history endpoints */
        override fun transactions(): TransactionServiceAsync.WithRawResponse = transactions

        /** Webhook configuration and delivery history */
        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks

        /** Bank reference data endpoints */
        override fun banks(): BankServiceAsync.WithRawResponse = banks

        /** Account resolution/verification endpoints */
        override fun resolve(): ResolveServiceAsync.WithRawResponse = resolve
    }
}
