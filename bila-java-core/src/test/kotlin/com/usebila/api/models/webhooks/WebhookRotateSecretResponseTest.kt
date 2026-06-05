// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookRotateSecretResponseTest {

    @Test
    fun create() {
        val webhookRotateSecretResponse =
            WebhookRotateSecretResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    WebhookRotateSecretResponse.Data.builder()
                        .secret("7f3a9c2e8b1d4f6a0e5c8b2d9f1a4e6c0b3d8f2a1e5c9b6d0f4a8e2c7b1d5f9a3")
                        .build()
                )
                .build()

        assertThat(webhookRotateSecretResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(webhookRotateSecretResponse.status()).isEqualTo(true)
        assertThat(webhookRotateSecretResponse.data())
            .contains(
                WebhookRotateSecretResponse.Data.builder()
                    .secret("7f3a9c2e8b1d4f6a0e5c8b2d9f1a4e6c0b3d8f2a1e5c9b6d0f4a8e2c7b1d5f9a3")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookRotateSecretResponse =
            WebhookRotateSecretResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    WebhookRotateSecretResponse.Data.builder()
                        .secret("7f3a9c2e8b1d4f6a0e5c8b2d9f1a4e6c0b3d8f2a1e5c9b6d0f4a8e2c7b1d5f9a3")
                        .build()
                )
                .build()

        val roundtrippedWebhookRotateSecretResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookRotateSecretResponse),
                jacksonTypeRef<WebhookRotateSecretResponse>(),
            )

        assertThat(roundtrippedWebhookRotateSecretResponse).isEqualTo(webhookRotateSecretResponse)
    }
}
