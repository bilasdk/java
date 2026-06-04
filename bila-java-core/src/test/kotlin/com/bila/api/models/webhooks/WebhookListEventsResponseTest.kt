// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.webhooks

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookListEventsResponseTest {

    @Test
    fun create() {
        val webhookListEventsResponse =
            WebhookListEventsResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    listOf(
                        "order.created",
                        "order.paid",
                        "order.cancelled",
                        "stock.low",
                        "payment.created",
                        "payment.completed",
                        "payment.failed",
                        "collection.pending",
                        "collection.completed",
                        "collection.failed",
                        "withdrawal.created",
                        "withdrawal.completed",
                        "withdrawal.failed",
                        "transaction.updated",
                        "transfer.pending",
                        "transfer.completed",
                        "transfer.failed",
                        "settlement.completed",
                    )
                )
                .build()

        assertThat(webhookListEventsResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(webhookListEventsResponse.status()).isEqualTo(true)
        assertThat(webhookListEventsResponse.data().getOrNull())
            .containsExactly(
                "order.created",
                "order.paid",
                "order.cancelled",
                "stock.low",
                "payment.created",
                "payment.completed",
                "payment.failed",
                "collection.pending",
                "collection.completed",
                "collection.failed",
                "withdrawal.created",
                "withdrawal.completed",
                "withdrawal.failed",
                "transaction.updated",
                "transfer.pending",
                "transfer.completed",
                "transfer.failed",
                "settlement.completed",
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookListEventsResponse =
            WebhookListEventsResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    listOf(
                        "order.created",
                        "order.paid",
                        "order.cancelled",
                        "stock.low",
                        "payment.created",
                        "payment.completed",
                        "payment.failed",
                        "collection.pending",
                        "collection.completed",
                        "collection.failed",
                        "withdrawal.created",
                        "withdrawal.completed",
                        "withdrawal.failed",
                        "transaction.updated",
                        "transfer.pending",
                        "transfer.completed",
                        "transfer.failed",
                        "settlement.completed",
                    )
                )
                .build()

        val roundtrippedWebhookListEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookListEventsResponse),
                jacksonTypeRef<WebhookListEventsResponse>(),
            )

        assertThat(roundtrippedWebhookListEventsResponse).isEqualTo(webhookListEventsResponse)
    }
}
