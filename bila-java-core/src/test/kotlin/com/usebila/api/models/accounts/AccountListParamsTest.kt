// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.accounts

import com.usebila.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountListParamsTest {

    @Test
    fun create() {
        AccountListParams.builder().page(1.0).perPage(50.0).build()
    }

    @Test
    fun queryParams() {
        val params = AccountListParams.builder().page(1.0).perPage(50.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page", "1.0").put("perPage", "50.0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
