// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.webhooks

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookConfigResponseDtoTest {

    @Test
    fun create() {
        val webhookConfigResponseDto =
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

        assertThat(webhookConfigResponseDto.id()).isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f4")
        assertThat(webhookConfigResponseDto.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-01T10:00:00.000Z"))
        assertThat(webhookConfigResponseDto.events())
            .containsExactly("payment.completed", "collection.completed")
        assertThat(webhookConfigResponseDto.isActive()).isEqualTo(true)
        assertThat(webhookConfigResponseDto.merchantId())
            .isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f5")
        assertThat(webhookConfigResponseDto.secret()).isEqualTo("a1b2****c3d4")
        assertThat(webhookConfigResponseDto.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-15T14:30:00.000Z"))
        assertThat(webhookConfigResponseDto.url()).isEqualTo("https://example.com/webhooks/bila")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookConfigResponseDto =
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

        val roundtrippedWebhookConfigResponseDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookConfigResponseDto),
                jacksonTypeRef<WebhookConfigResponseDto>(),
            )

        assertThat(roundtrippedWebhookConfigResponseDto).isEqualTo(webhookConfigResponseDto)
    }
}
