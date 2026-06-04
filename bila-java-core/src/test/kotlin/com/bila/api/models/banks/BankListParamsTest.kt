// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.banks

import com.bila.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BankListParamsTest {

    @Test
    fun create() {
        BankListParams.builder().country("zm").build()
    }

    @Test
    fun queryParams() {
        val params = BankListParams.builder().country("zm").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("country", "zm").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BankListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
