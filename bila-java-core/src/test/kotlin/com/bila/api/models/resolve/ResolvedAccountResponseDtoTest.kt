// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.resolve

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResolvedAccountResponseDtoTest {

    @Test
    fun create() {
        val resolvedAccountResponseDto =
            ResolvedAccountResponseDto.builder()
                .accountName("John Doe")
                .country("zm")
                .accountNumber("1234567890")
                .bankId("bank-001")
                .bankName("First National Bank")
                .operator("airtel")
                .phone("0977433571")
                .build()

        assertThat(resolvedAccountResponseDto.accountName()).isEqualTo("John Doe")
        assertThat(resolvedAccountResponseDto.country()).isEqualTo("zm")
        assertThat(resolvedAccountResponseDto.accountNumber()).contains("1234567890")
        assertThat(resolvedAccountResponseDto.bankId()).contains("bank-001")
        assertThat(resolvedAccountResponseDto.bankName()).contains("First National Bank")
        assertThat(resolvedAccountResponseDto.operator()).contains("airtel")
        assertThat(resolvedAccountResponseDto.phone()).contains("0977433571")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resolvedAccountResponseDto =
            ResolvedAccountResponseDto.builder()
                .accountName("John Doe")
                .country("zm")
                .accountNumber("1234567890")
                .bankId("bank-001")
                .bankName("First National Bank")
                .operator("airtel")
                .phone("0977433571")
                .build()

        val roundtrippedResolvedAccountResponseDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resolvedAccountResponseDto),
                jacksonTypeRef<ResolvedAccountResponseDto>(),
            )

        assertThat(roundtrippedResolvedAccountResponseDto).isEqualTo(resolvedAccountResponseDto)
    }
}
