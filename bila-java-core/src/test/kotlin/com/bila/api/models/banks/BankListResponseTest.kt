// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.banks

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BankListResponseTest {

    @Test
    fun create() {
        val bankListResponse =
            BankListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .addData(
                    BankListResponse.Data.builder()
                        .id("bank-001")
                        .code("FNB")
                        .country("zm")
                        .name("First National Bank")
                        .type("commercial")
                        .build()
                )
                .build()

        assertThat(bankListResponse.message()).isEqualTo("Operation completed successfully")
        assertThat(bankListResponse.status()).isEqualTo(true)
        assertThat(bankListResponse.data().getOrNull())
            .containsExactly(
                BankListResponse.Data.builder()
                    .id("bank-001")
                    .code("FNB")
                    .country("zm")
                    .name("First National Bank")
                    .type("commercial")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bankListResponse =
            BankListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .addData(
                    BankListResponse.Data.builder()
                        .id("bank-001")
                        .code("FNB")
                        .country("zm")
                        .name("First National Bank")
                        .type("commercial")
                        .build()
                )
                .build()

        val roundtrippedBankListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bankListResponse),
                jacksonTypeRef<BankListResponse>(),
            )

        assertThat(roundtrippedBankListResponse).isEqualTo(bankListResponse)
    }
}
