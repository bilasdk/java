// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeactivateResponseTest {

    @Test
    fun create() {
        val webhookDeactivateResponse =
            WebhookDeactivateResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .build()

        assertThat(webhookDeactivateResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(webhookDeactivateResponse.status()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookDeactivateResponse =
            WebhookDeactivateResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .build()

        val roundtrippedWebhookDeactivateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookDeactivateResponse),
                jacksonTypeRef<WebhookDeactivateResponse>(),
            )

        assertThat(roundtrippedWebhookDeactivateResponse).isEqualTo(webhookDeactivateResponse)
    }
}
