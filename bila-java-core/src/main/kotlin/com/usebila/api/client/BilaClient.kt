// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.client

import com.usebila.api.core.ClientOptions
import com.usebila.api.services.blocking.AccountService
import com.usebila.api.services.blocking.BankService
import com.usebila.api.services.blocking.CollectionService
import com.usebila.api.services.blocking.ResolveService
import com.usebila.api.services.blocking.TransactionService
import com.usebila.api.services.blocking.TransferRecipientService
import com.usebila.api.services.blocking.TransferService
import com.usebila.api.services.blocking.WebhookService
import java.util.function.Consumer

/**
 * A client for interacting with the Bila REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface BilaClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): BilaClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BilaClient

    /** Account/wallet management endpoints */
    fun accounts(): AccountService

    /** Transfer recipient management endpoints */
    fun transferRecipients(): TransferRecipientService

    /** Payout/transfer operation endpoints */
    fun transfers(): TransferService

    /** Payment collection operation endpoints */
    fun collections(): CollectionService

    /** Transaction history endpoints */
    fun transactions(): TransactionService

    /** Webhook configuration and delivery history */
    fun webhooks(): WebhookService

    /** Bank reference data endpoints */
    fun banks(): BankService

    /** Account resolution/verification endpoints */
    fun resolve(): ResolveService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [BilaClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BilaClient.WithRawResponse

        /** Account/wallet management endpoints */
        fun accounts(): AccountService.WithRawResponse

        /** Transfer recipient management endpoints */
        fun transferRecipients(): TransferRecipientService.WithRawResponse

        /** Payout/transfer operation endpoints */
        fun transfers(): TransferService.WithRawResponse

        /** Payment collection operation endpoints */
        fun collections(): CollectionService.WithRawResponse

        /** Transaction history endpoints */
        fun transactions(): TransactionService.WithRawResponse

        /** Webhook configuration and delivery history */
        fun webhooks(): WebhookService.WithRawResponse

        /** Bank reference data endpoints */
        fun banks(): BankService.WithRawResponse

        /** Account resolution/verification endpoints */
        fun resolve(): ResolveService.WithRawResponse
    }
}
