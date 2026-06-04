// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferGetStatusByReferenceParamsTest {

    @Test
    fun create() {
        TransferGetStatusByReferenceParams.builder().reference("transfer-001").build()
    }

    @Test
    fun pathParams() {
        val params = TransferGetStatusByReferenceParams.builder().reference("transfer-001").build()

        assertThat(params._pathParam(0)).isEqualTo("transfer-001")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
