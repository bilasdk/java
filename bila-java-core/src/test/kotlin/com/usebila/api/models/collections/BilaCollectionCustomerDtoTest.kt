// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.collections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BilaCollectionCustomerDtoTest {

    @Test
    fun create() {
        val bilaCollectionCustomerDto =
            BilaCollectionCustomerDto.builder()
                .name("JOHN DOE")
                .operator("airtel")
                .phone("0977123456")
                .build()

        assertThat(bilaCollectionCustomerDto.name()).isEqualTo("JOHN DOE")
        assertThat(bilaCollectionCustomerDto.operator()).isEqualTo("airtel")
        assertThat(bilaCollectionCustomerDto.phone()).isEqualTo("0977123456")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bilaCollectionCustomerDto =
            BilaCollectionCustomerDto.builder()
                .name("JOHN DOE")
                .operator("airtel")
                .phone("0977123456")
                .build()

        val roundtrippedBilaCollectionCustomerDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bilaCollectionCustomerDto),
                jacksonTypeRef<BilaCollectionCustomerDto>(),
            )

        assertThat(roundtrippedBilaCollectionCustomerDto).isEqualTo(bilaCollectionCustomerDto)
    }
}
