// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.JsonValue
import com.usebila.api.core.jsonMapper
import com.usebila.api.models.PaginationMetaDto
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookGetDeliveriesResponseTest {

    @Test
    fun create() {
        val webhookGetDeliveriesResponse =
            WebhookGetDeliveriesResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    WebhookGetDeliveriesResponse.Data.builder()
                        .addData(
                            WebhookGetDeliveriesResponse.Data.InnerData.builder()
                                .id("68f11209-451f-4a15-bfcd-d916eb8b09f6")
                                .attempts(1.0)
                                .createdAt(OffsetDateTime.parse("2026-04-15T14:30:00.000Z"))
                                .deliveredAt(OffsetDateTime.parse("2026-04-15T14:30:05.000Z"))
                                .eventType("payment.completed")
                                .failedAt(null)
                                .maxAttempts(5.0)
                                .nextRetryAt(null)
                                .payload(
                                    WebhookGetDeliveriesResponse.Data.InnerData.Payload.builder()
                                        .putAdditionalProperty("id", JsonValue.from("bar"))
                                        .putAdditionalProperty(
                                            "transactionId",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty("amount", JsonValue.from("bar"))
                                        .putAdditionalProperty("status", JsonValue.from("bar"))
                                        .build()
                                )
                                .responseBody("{\"received\":true}")
                                .responseStatus(200.0)
                                .status(
                                    WebhookGetDeliveriesResponse.Data.InnerData.Status.DELIVERED
                                )
                                .webhookConfigId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                                .build()
                        )
                        .meta(
                            PaginationMetaDto.builder()
                                .currentPage(1.0)
                                .pageCount(3.0)
                                .perPage(50.0)
                                .total(150.0)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(webhookGetDeliveriesResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(webhookGetDeliveriesResponse.status()).isEqualTo(true)
        assertThat(webhookGetDeliveriesResponse.data())
            .contains(
                WebhookGetDeliveriesResponse.Data.builder()
                    .addData(
                        WebhookGetDeliveriesResponse.Data.InnerData.builder()
                            .id("68f11209-451f-4a15-bfcd-d916eb8b09f6")
                            .attempts(1.0)
                            .createdAt(OffsetDateTime.parse("2026-04-15T14:30:00.000Z"))
                            .deliveredAt(OffsetDateTime.parse("2026-04-15T14:30:05.000Z"))
                            .eventType("payment.completed")
                            .failedAt(null)
                            .maxAttempts(5.0)
                            .nextRetryAt(null)
                            .payload(
                                WebhookGetDeliveriesResponse.Data.InnerData.Payload.builder()
                                    .putAdditionalProperty("id", JsonValue.from("bar"))
                                    .putAdditionalProperty("transactionId", JsonValue.from("bar"))
                                    .putAdditionalProperty("amount", JsonValue.from("bar"))
                                    .putAdditionalProperty("status", JsonValue.from("bar"))
                                    .build()
                            )
                            .responseBody("{\"received\":true}")
                            .responseStatus(200.0)
                            .status(WebhookGetDeliveriesResponse.Data.InnerData.Status.DELIVERED)
                            .webhookConfigId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                            .build()
                    )
                    .meta(
                        PaginationMetaDto.builder()
                            .currentPage(1.0)
                            .pageCount(3.0)
                            .perPage(50.0)
                            .total(150.0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookGetDeliveriesResponse =
            WebhookGetDeliveriesResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    WebhookGetDeliveriesResponse.Data.builder()
                        .addData(
                            WebhookGetDeliveriesResponse.Data.InnerData.builder()
                                .id("68f11209-451f-4a15-bfcd-d916eb8b09f6")
                                .attempts(1.0)
                                .createdAt(OffsetDateTime.parse("2026-04-15T14:30:00.000Z"))
                                .deliveredAt(OffsetDateTime.parse("2026-04-15T14:30:05.000Z"))
                                .eventType("payment.completed")
                                .failedAt(null)
                                .maxAttempts(5.0)
                                .nextRetryAt(null)
                                .payload(
                                    WebhookGetDeliveriesResponse.Data.InnerData.Payload.builder()
                                        .putAdditionalProperty("id", JsonValue.from("bar"))
                                        .putAdditionalProperty(
                                            "transactionId",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty("amount", JsonValue.from("bar"))
                                        .putAdditionalProperty("status", JsonValue.from("bar"))
                                        .build()
                                )
                                .responseBody("{\"received\":true}")
                                .responseStatus(200.0)
                                .status(
                                    WebhookGetDeliveriesResponse.Data.InnerData.Status.DELIVERED
                                )
                                .webhookConfigId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                                .build()
                        )
                        .meta(
                            PaginationMetaDto.builder()
                                .currentPage(1.0)
                                .pageCount(3.0)
                                .perPage(50.0)
                                .total(150.0)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedWebhookGetDeliveriesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookGetDeliveriesResponse),
                jacksonTypeRef<WebhookGetDeliveriesResponse>(),
            )

        assertThat(roundtrippedWebhookGetDeliveriesResponse).isEqualTo(webhookGetDeliveriesResponse)
    }
}
