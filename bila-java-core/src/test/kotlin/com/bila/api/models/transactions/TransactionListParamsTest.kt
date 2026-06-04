// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transactions

import com.bila.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionListParamsTest {

    @Test
    fun create() {
        TransactionListParams.builder()
            .accountId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
            .endDate("2024-12-31T23:59:59Z")
            .page(1.0)
            .perPage(50.0)
            .startDate("2024-01-01T00:00:00Z")
            .type(TransactionListParams.Type.CREDIT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TransactionListParams.builder()
                .accountId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .endDate("2024-12-31T23:59:59Z")
                .page(1.0)
                .perPage(50.0)
                .startDate("2024-01-01T00:00:00Z")
                .type(TransactionListParams.Type.CREDIT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("accountId", "68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .put("endDate", "2024-12-31T23:59:59Z")
                    .put("page", "1.0")
                    .put("perPage", "50.0")
                    .put("startDate", "2024-01-01T00:00:00Z")
                    .put("type", "credit")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransactionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
