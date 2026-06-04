// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.accounts

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BilaResponseTest {

    @Test
    fun create() {
        val bilaResponse =
            BilaResponse.builder().message("Operation completed successfully").status(true).build()

        assertThat(bilaResponse.message()).isEqualTo("Operation completed successfully")
        assertThat(bilaResponse.status()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bilaResponse =
            BilaResponse.builder().message("Operation completed successfully").status(true).build()

        val roundtrippedBilaResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bilaResponse),
                jacksonTypeRef<BilaResponse>(),
            )

        assertThat(roundtrippedBilaResponse).isEqualTo(bilaResponse)
    }
}
