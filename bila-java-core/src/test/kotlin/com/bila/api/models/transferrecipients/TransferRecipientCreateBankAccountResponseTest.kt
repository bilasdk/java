// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transferrecipients

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferRecipientCreateBankAccountResponseTest {

    @Test
    fun create() {
        val transferRecipientCreateBankAccountResponse =
            TransferRecipientCreateBankAccountResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransferRecipientCreateBankAccountResponse.Data.builder()
                        .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                        .accountName("John Doe")
                        .country("zm")
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .type(TransferRecipientCreateBankAccountResponse.Data.Type.BANK_ACCOUNT)
                        .accountNumber("1234567890")
                        .bankId("bank-001")
                        .bankName("Zambia National Commercial Bank")
                        .operator("airtel")
                        .phone("0977123456")
                        .build()
                )
                .build()

        assertThat(transferRecipientCreateBankAccountResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(transferRecipientCreateBankAccountResponse.status()).isEqualTo(true)
        assertThat(transferRecipientCreateBankAccountResponse.data())
            .contains(
                TransferRecipientCreateBankAccountResponse.Data.builder()
                    .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .accountName("John Doe")
                    .country("zm")
                    .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                    .type(TransferRecipientCreateBankAccountResponse.Data.Type.BANK_ACCOUNT)
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
        val transferRecipientCreateBankAccountResponse =
            TransferRecipientCreateBankAccountResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransferRecipientCreateBankAccountResponse.Data.builder()
                        .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                        .accountName("John Doe")
                        .country("zm")
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .type(TransferRecipientCreateBankAccountResponse.Data.Type.BANK_ACCOUNT)
                        .accountNumber("1234567890")
                        .bankId("bank-001")
                        .bankName("Zambia National Commercial Bank")
                        .operator("airtel")
                        .phone("0977123456")
                        .build()
                )
                .build()

        val roundtrippedTransferRecipientCreateBankAccountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferRecipientCreateBankAccountResponse),
                jacksonTypeRef<TransferRecipientCreateBankAccountResponse>(),
            )

        assertThat(roundtrippedTransferRecipientCreateBankAccountResponse)
            .isEqualTo(transferRecipientCreateBankAccountResponse)
    }
}
