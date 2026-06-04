// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.resolve

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResolveBankAccountResponseTest {

    @Test
    fun create() {
        val resolveBankAccountResponse =
            ResolveBankAccountResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    ResolveBankAccountResponse.Data.builder()
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

        assertThat(resolveBankAccountResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(resolveBankAccountResponse.status()).isEqualTo(true)
        assertThat(resolveBankAccountResponse.data())
            .contains(
                ResolveBankAccountResponse.Data.builder()
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
        val resolveBankAccountResponse =
            ResolveBankAccountResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    ResolveBankAccountResponse.Data.builder()
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

        val roundtrippedResolveBankAccountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resolveBankAccountResponse),
                jacksonTypeRef<ResolveBankAccountResponse>(),
            )

        assertThat(roundtrippedResolveBankAccountResponse).isEqualTo(resolveBankAccountResponse)
    }
}
