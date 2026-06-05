// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.collections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionGetStatusByReferenceParamsTest {

    @Test
    fun create() {
        CollectionGetStatusByReferenceParams.builder().reference("collection-001").build()
    }

    @Test
    fun pathParams() {
        val params =
            CollectionGetStatusByReferenceParams.builder().reference("collection-001").build()

        assertThat(params._pathParam(0)).isEqualTo("collection-001")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
