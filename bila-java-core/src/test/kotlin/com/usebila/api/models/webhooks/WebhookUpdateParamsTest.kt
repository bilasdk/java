// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.webhooks

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateParamsTest {

    @Test
    fun create() {
        WebhookUpdateParams.builder()
            .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
            .addEvent(WebhookUpdateParams.Event.PAYMENT_COMPLETED)
            .addEvent(WebhookUpdateParams.Event.COLLECTION_COMPLETED)
            .isActive(true)
            .url("https://example.com/webhooks")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookUpdateParams.builder().id("68f11209-451f-4a15-bfcd-d916eb8b09f4").build()

        assertThat(params._pathParam(0)).isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f4")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WebhookUpdateParams.builder()
                .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .addEvent(WebhookUpdateParams.Event.PAYMENT_COMPLETED)
                .addEvent(WebhookUpdateParams.Event.COLLECTION_COMPLETED)
                .isActive(true)
                .url("https://example.com/webhooks")
                .build()

        val body = params._body()

        assertThat(body.events().getOrNull())
            .containsExactly(
                WebhookUpdateParams.Event.PAYMENT_COMPLETED,
                WebhookUpdateParams.Event.COLLECTION_COMPLETED,
            )
        assertThat(body.isActive()).contains(true)
        assertThat(body.url()).contains("https://example.com/webhooks")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookUpdateParams.builder().id("68f11209-451f-4a15-bfcd-d916eb8b09f4").build()

        val body = params._body()
    }
}
