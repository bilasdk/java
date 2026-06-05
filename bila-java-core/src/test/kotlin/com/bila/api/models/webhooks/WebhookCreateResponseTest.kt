// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.webhooks

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateResponseTest {

    @Test
    fun create() {
        val webhookCreateResponse =
            WebhookCreateResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    WebhookConfigResponseDto.builder()
                        .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                        .createdAt(OffsetDateTime.parse("2026-04-01T10:00:00.000Z"))
                        .addEvent("payment.completed")
                        .addEvent("collection.completed")
                        .isActive(true)
                        .merchantId("68f11209-451f-4a15-bfcd-d916eb8b09f5")
                        .secret("a1b2****c3d4")
                        .updatedAt(OffsetDateTime.parse("2026-04-15T14:30:00.000Z"))
                        .url("https://example.com/webhooks/bila")
                        .build()
                )
                .build()

        assertThat(webhookCreateResponse.message()).isEqualTo("Operation completed successfully")
        assertThat(webhookCreateResponse.status()).isEqualTo(true)
        assertThat(webhookCreateResponse.data())
            .contains(
                WebhookConfigResponseDto.builder()
                    .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .createdAt(OffsetDateTime.parse("2026-04-01T10:00:00.000Z"))
                    .addEvent("payment.completed")
                    .addEvent("collection.completed")
                    .isActive(true)
                    .merchantId("68f11209-451f-4a15-bfcd-d916eb8b09f5")
                    .secret("a1b2****c3d4")
                    .updatedAt(OffsetDateTime.parse("2026-04-15T14:30:00.000Z"))
                    .url("https://example.com/webhooks/bila")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookCreateResponse =
            WebhookCreateResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    WebhookConfigResponseDto.builder()
                        .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                        .createdAt(OffsetDateTime.parse("2026-04-01T10:00:00.000Z"))
                        .addEvent("payment.completed")
                        .addEvent("collection.completed")
                        .isActive(true)
                        .merchantId("68f11209-451f-4a15-bfcd-d916eb8b09f5")
                        .secret("a1b2****c3d4")
                        .updatedAt(OffsetDateTime.parse("2026-04-15T14:30:00.000Z"))
                        .url("https://example.com/webhooks/bila")
                        .build()
                )
                .build()

        val roundtrippedWebhookCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookCreateResponse),
                jacksonTypeRef<WebhookCreateResponse>(),
            )

        assertThat(roundtrippedWebhookCreateResponse).isEqualTo(webhookCreateResponse)
    }
}
