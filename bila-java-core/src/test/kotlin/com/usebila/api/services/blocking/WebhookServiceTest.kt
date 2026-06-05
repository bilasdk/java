// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.usebila.api.client.okhttp.BilaOkHttpClient
import com.usebila.api.models.webhooks.WebhookCreateParams
import com.usebila.api.models.webhooks.WebhookGetDeliveriesParams
import com.usebila.api.models.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhook =
            webhookService.create(
                WebhookCreateParams.builder()
                    .addEvent(WebhookCreateParams.Event.PAYMENT_COMPLETED)
                    .addEvent(WebhookCreateParams.Event.WITHDRAWAL_COMPLETED)
                    .url("https://example.com/webhooks")
                    .build()
            )

        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhook =
            webhookService.update(
                WebhookUpdateParams.builder()
                    .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .addEvent(WebhookUpdateParams.Event.PAYMENT_COMPLETED)
                    .addEvent(WebhookUpdateParams.Event.COLLECTION_COMPLETED)
                    .isActive(true)
                    .url("https://example.com/webhooks")
                    .build()
            )

        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhooks = webhookService.list()

        webhooks.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deactivate() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val response = webhookService.deactivate("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDeliveries() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val response =
            webhookService.getDeliveries(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEvents() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val response = webhookService.listEvents()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotateSecret() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val response = webhookService.rotateSecret("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        response.validate()
    }
}
