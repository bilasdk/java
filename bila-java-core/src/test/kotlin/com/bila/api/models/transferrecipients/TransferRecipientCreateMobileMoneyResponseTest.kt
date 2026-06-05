// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transferrecipients

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferRecipientCreateMobileMoneyResponseTest {

    @Test
    fun create() {
        val transferRecipientCreateMobileMoneyResponse =
            TransferRecipientCreateMobileMoneyResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    RecipientResponseDto.builder()
                        .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                        .accountName("John Doe")
                        .country("zm")
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .type(RecipientResponseDto.Type.BANK_ACCOUNT)
                        .accountNumber("1234567890")
                        .bankId("bank-001")
                        .bankName("Zambia National Commercial Bank")
                        .operator("airtel")
                        .phone("0977123456")
                        .build()
                )
                .build()

        assertThat(transferRecipientCreateMobileMoneyResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(transferRecipientCreateMobileMoneyResponse.status()).isEqualTo(true)
        assertThat(transferRecipientCreateMobileMoneyResponse.data())
            .contains(
                RecipientResponseDto.builder()
                    .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .accountName("John Doe")
                    .country("zm")
                    .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                    .type(RecipientResponseDto.Type.BANK_ACCOUNT)
                    .accountNumber("1234567890")
                    .bankId("bank-001")
                    .bankName("Zambia National Commercial Bank")
                    .operator("airtel")
                    .phone("0977123456")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferRecipientCreateMobileMoneyResponse =
            TransferRecipientCreateMobileMoneyResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    RecipientResponseDto.builder()
                        .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                        .accountName("John Doe")
                        .country("zm")
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .type(RecipientResponseDto.Type.BANK_ACCOUNT)
                        .accountNumber("1234567890")
                        .bankId("bank-001")
                        .bankName("Zambia National Commercial Bank")
                        .operator("airtel")
                        .phone("0977123456")
                        .build()
                )
                .build()

        val roundtrippedTransferRecipientCreateMobileMoneyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferRecipientCreateMobileMoneyResponse),
                jacksonTypeRef<TransferRecipientCreateMobileMoneyResponse>(),
            )

        assertThat(roundtrippedTransferRecipientCreateMobileMoneyResponse)
            .isEqualTo(transferRecipientCreateMobileMoneyResponse)
    }
}
