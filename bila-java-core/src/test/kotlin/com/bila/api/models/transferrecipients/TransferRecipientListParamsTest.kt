// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transferrecipients

import com.bila.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferRecipientListParamsTest {

    @Test
    fun create() {
        TransferRecipientListParams.builder()
            .page(1.0)
            .perPage(50.0)
            .type(TransferRecipientListParams.Type.BANK_ACCOUNT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TransferRecipientListParams.builder()
                .page(1.0)
                .perPage(50.0)
                .type(TransferRecipientListParams.Type.BANK_ACCOUNT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "1.0")
                    .put("perPage", "50.0")
                    .put("type", "bank-account")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransferRecipientListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
