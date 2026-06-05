// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.transferrecipients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferRecipientRetrieveResponseTest {

    @Test
    fun create() {
        val transferRecipientRetrieveResponse =
            TransferRecipientRetrieveResponse.builder()
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

        assertThat(transferRecipientRetrieveResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(transferRecipientRetrieveResponse.status()).isEqualTo(true)
        assertThat(transferRecipientRetrieveResponse.data())
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
        val transferRecipientRetrieveResponse =
            TransferRecipientRetrieveResponse.builder()
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

        val roundtrippedTransferRecipientRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferRecipientRetrieveResponse),
                jacksonTypeRef<TransferRecipientRetrieveResponse>(),
            )

        assertThat(roundtrippedTransferRecipientRetrieveResponse)
            .isEqualTo(transferRecipientRetrieveResponse)
    }
}
