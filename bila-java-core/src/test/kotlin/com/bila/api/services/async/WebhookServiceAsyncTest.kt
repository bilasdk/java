// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.async

import com.bila.api.client.okhttp.BilaOkHttpClientAsync
import com.bila.api.models.webhooks.WebhookCreateParams
import com.bila.api.models.webhooks.WebhookGetDeliveriesParams
import com.bila.api.models.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.create(
                WebhookCreateParams.builder()
                    .addEvent(WebhookCreateParams.Event.PAYMENT_COMPLETED)
                    .addEvent(WebhookCreateParams.Event.WITHDRAWAL_COMPLETED)
                    .url("https://example.com/webhooks")
                    .build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.update(
                WebhookUpdateParams.builder()
                    .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .addEvent(WebhookUpdateParams.Event.PAYMENT_COMPLETED)
                    .addEvent(WebhookUpdateParams.Event.COLLECTION_COMPLETED)
                    .isActive(true)
                    .url("https://example.com/webhooks")
                    .build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhooksFuture = webhookServiceAsync.list()

        val webhooks = webhooksFuture.get()
        webhooks.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deactivate() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val bilaResponseFuture =
            webhookServiceAsync.deactivate("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        val bilaResponse = bilaResponseFuture.get()
        bilaResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDeliveries() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val responseFuture =
            webhookServiceAsync.getDeliveries(
                WebhookGetDeliveriesParams.builder()
                    .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .endDate("2026-04-30T23:59:59.999Z")
                    .eventType("payment.completed")
                    .page(1.0)
                    .perPage(20.0)
                    .startDate("2026-04-01T00:00:00.000Z")
                    .status("DELIVERED")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEvents() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val responseFuture = webhookServiceAsync.listEvents()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotateSecret() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val responseFuture =
            webhookServiceAsync.rotateSecret("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        val response = responseFuture.get()
        response.validate()
    }
}
