// File generated from our OpenAPI spec by Stainless.

package com.bila.api.client

import com.bila.api.core.ClientOptions
import com.bila.api.services.async.AccountServiceAsync
import com.bila.api.services.async.BankServiceAsync
import com.bila.api.services.async.CollectionServiceAsync
import com.bila.api.services.async.ResolveServiceAsync
import com.bila.api.services.async.TransactionServiceAsync
import com.bila.api.services.async.TransferRecipientServiceAsync
import com.bila.api.services.async.TransferServiceAsync
import com.bila.api.services.async.WebhookServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Bila REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface BilaClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): BilaClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BilaClientAsync

    /** Account/wallet management endpoints */
    fun accounts(): AccountServiceAsync

    /** Transfer recipient management endpoints */
    fun transferRecipients(): TransferRecipientServiceAsync

    /** Payout/transfer operation endpoints */
    fun transfers(): TransferServiceAsync

    /** Payment collection operation endpoints */
    fun collections(): CollectionServiceAsync

    /** Transaction history endpoints */
    fun transactions(): TransactionServiceAsync

    /** Webhook configuration and delivery history */
    fun webhooks(): WebhookServiceAsync

    /** Bank reference data endpoints */
    fun banks(): BankServiceAsync

    /** Account resolution/verification endpoints */
    fun resolve(): ResolveServiceAsync

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

    /** A view of [BilaClientAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BilaClientAsync.WithRawResponse

        /** Account/wallet management endpoints */
        fun accounts(): AccountServiceAsync.WithRawResponse

        /** Transfer recipient management endpoints */
        fun transferRecipients(): TransferRecipientServiceAsync.WithRawResponse

        /** Payout/transfer operation endpoints */
        fun transfers(): TransferServiceAsync.WithRawResponse

        /** Payment collection operation endpoints */
        fun collections(): CollectionServiceAsync.WithRawResponse

        /** Transaction history endpoints */
        fun transactions(): TransactionServiceAsync.WithRawResponse

        /** Webhook configuration and delivery history */
        fun webhooks(): WebhookServiceAsync.WithRawResponse

        /** Bank reference data endpoints */
        fun banks(): BankServiceAsync.WithRawResponse

        /** Account resolution/verification endpoints */
        fun resolve(): ResolveServiceAsync.WithRawResponse
    }
}
