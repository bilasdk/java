// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.webhooks

import com.usebila.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookGetDeliveriesParamsTest {

    @Test
    fun create() {
        WebhookGetDeliveriesParams.builder()
            .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
            .endDate("2026-04-30T23:59:59.999Z")
            .eventType("payment.completed")
            .page(1.0)
            .perPage(20.0)
            .startDate("2026-04-01T00:00:00.000Z")
            .status("DELIVERED")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookGetDeliveriesParams.builder().id("68f11209-451f-4a15-bfcd-d916eb8b09f4").build()

        assertThat(params._pathParam(0)).isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f4")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            WebhookGetDeliveriesParams.builder()
                .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .endDate("2026-04-30T23:59:59.999Z")
                .eventType("payment.completed")
                .page(1.0)
                .perPage(20.0)
                .startDate("2026-04-01T00:00:00.000Z")
                .status("DELIVERED")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endDate", "2026-04-30T23:59:59.999Z")
                    .put("eventType", "payment.completed")
                    .put("page", "1.0")
                    .put("perPage", "20.0")
                    .put("startDate", "2026-04-01T00:00:00.000Z")
                    .put("status", "DELIVERED")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            WebhookGetDeliveriesParams.builder().id("68f11209-451f-4a15-bfcd-d916eb8b09f4").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
