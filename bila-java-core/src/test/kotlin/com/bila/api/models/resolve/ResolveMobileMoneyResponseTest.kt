// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.resolve

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResolveMobileMoneyResponseTest {

    @Test
    fun create() {
        val resolveMobileMoneyResponse =
            ResolveMobileMoneyResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    ResolvedAccountResponseDto.builder()
                        .accountName("John Doe")
                        .country("zm")
                        .accountNumber("1234567890")
                        .bankId("bank-001")
                        .bankName("First National Bank")
                        .operator("airtel")
                        .phone("0977433571")
                        .build()
                )
                .build()

        assertThat(resolveMobileMoneyResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(resolveMobileMoneyResponse.status()).isEqualTo(true)
        assertThat(resolveMobileMoneyResponse.data())
            .contains(
                ResolvedAccountResponseDto.builder()
                    .accountName("John Doe")
                    .country("zm")
                    .accountNumber("1234567890")
                    .bankId("bank-001")
                    .bankName("First National Bank")
                    .operator("airtel")
                    .phone("0977433571")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resolveMobileMoneyResponse =
            ResolveMobileMoneyResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    ResolvedAccountResponseDto.builder()
                        .accountName("John Doe")
                        .country("zm")
                        .accountNumber("1234567890")
                        .bankId("bank-001")
                        .bankName("First National Bank")
                        .operator("airtel")
                        .phone("0977433571")
                        .build()
                )
                .build()

        val roundtrippedResolveMobileMoneyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resolveMobileMoneyResponse),
                jacksonTypeRef<ResolveMobileMoneyResponse>(),
            )

        assertThat(roundtrippedResolveMobileMoneyResponse).isEqualTo(resolveMobileMoneyResponse)
    }
}
