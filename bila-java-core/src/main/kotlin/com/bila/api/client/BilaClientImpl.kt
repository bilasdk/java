// File generated from our OpenAPI spec by Stainless.

package com.bila.api.client

import com.bila.api.core.ClientOptions
import com.bila.api.core.getPackageVersion
import com.bila.api.services.blocking.AccountService
import com.bila.api.services.blocking.AccountServiceImpl
import com.bila.api.services.blocking.BankService
import com.bila.api.services.blocking.BankServiceImpl
import com.bila.api.services.blocking.CollectionService
import com.bila.api.services.blocking.CollectionServiceImpl
import com.bila.api.services.blocking.ResolveService
import com.bila.api.services.blocking.ResolveServiceImpl
import com.bila.api.services.blocking.TransactionService
import com.bila.api.services.blocking.TransactionServiceImpl
import com.bila.api.services.blocking.TransferRecipientService
import com.bila.api.services.blocking.TransferRecipientServiceImpl
import com.bila.api.services.blocking.TransferService
import com.bila.api.services.blocking.TransferServiceImpl
import com.bila.api.services.blocking.WebhookService
import com.bila.api.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

class BilaClientImpl(private val clientOptions: ClientOptions) : BilaClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: BilaClientAsync by lazy { BilaClientAsyncImpl(clientOptions) }

    private val withRawResponse: BilaClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val transferRecipients: TransferRecipientService by lazy {
        TransferRecipientServiceImpl(clientOptionsWithUserAgent)
    }

    private val transfers: TransferService by lazy {
        TransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val collections: CollectionService by lazy {
        CollectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionService by lazy {
        TransactionServiceImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    private val banks: BankService by lazy { BankServiceImpl(clientOptionsWithUserAgent) }

    private val resolve: ResolveService by lazy { ResolveServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): BilaClientAsync = async

    override fun withRawResponse(): BilaClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BilaClient =
        BilaClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Account/wallet management endpoints */
    override fun accounts(): AccountService = accounts

    /** Transfer recipient management endpoints */
    override fun transferRecipients(): TransferRecipientService = transferRecipients

    /** Payout/transfer operation endpoints */
    override fun transfers(): TransferService = transfers

    /** Payment collection operation endpoints */
    override fun collections(): CollectionService = collections

    /** Transaction history endpoints */
    override fun transactions(): TransactionService = transactions

    /** Webhook configuration and delivery history */
    override fun webhooks(): WebhookService = webhooks

    /** Bank reference data endpoints */
    override fun banks(): BankService = banks

    /** Account resolution/verification endpoints */
    override fun resolve(): ResolveService = resolve

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BilaClient.WithRawResponse {

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transferRecipients: TransferRecipientService.WithRawResponse by lazy {
            TransferRecipientServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transfers: TransferService.WithRawResponse by lazy {
            TransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val collections: CollectionService.WithRawResponse by lazy {
            CollectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionService.WithRawResponse by lazy {
            TransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val banks: BankService.WithRawResponse by lazy {
            BankServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val resolve: ResolveService.WithRawResponse by lazy {
            ResolveServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BilaClient.WithRawResponse =
            BilaClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Account/wallet management endpoints */
        override fun accounts(): AccountService.WithRawResponse = accounts

        /** Transfer recipient management endpoints */
        override fun transferRecipients(): TransferRecipientService.WithRawResponse =
            transferRecipients

        /** Payout/transfer operation endpoints */
        override fun transfers(): TransferService.WithRawResponse = transfers

        /** Payment collection operation endpoints */
        override fun collections(): CollectionService.WithRawResponse = collections

        /** Transaction history endpoints */
        override fun transactions(): TransactionService.WithRawResponse = transactions

        /** Webhook configuration and delivery history */
        override fun webhooks(): WebhookService.WithRawResponse = webhooks

        /** Bank reference data endpoints */
        override fun banks(): BankService.WithRawResponse = banks

        /** Account resolution/verification endpoints */
        override fun resolve(): ResolveService.WithRawResponse = resolve
    }
}
