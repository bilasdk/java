// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateParamsTest {

    @Test
    fun create() {
        WebhookCreateParams.builder()
            .addEvent(WebhookCreateParams.Event.PAYMENT_COMPLETED)
            .addEvent(WebhookCreateParams.Event.WITHDRAWAL_COMPLETED)
            .url("https://example.com/webhooks")
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookCreateParams.builder()
                .addEvent(WebhookCreateParams.Event.PAYMENT_COMPLETED)
                .addEvent(WebhookCreateParams.Event.WITHDRAWAL_COMPLETED)
                .url("https://example.com/webhooks")
                .build()

        val body = params._body()

        assertThat(body.events())
            .containsExactly(
                WebhookCreateParams.Event.PAYMENT_COMPLETED,
                WebhookCreateParams.Event.WITHDRAWAL_COMPLETED,
            )
        assertThat(body.url()).isEqualTo("https://example.com/webhooks")
    }
}
