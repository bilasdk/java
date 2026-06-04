// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transfers

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferInitiateBankTransferResponseTest {

    @Test
    fun create() {
        val transferInitiateBankTransferResponse =
            TransferInitiateBankTransferResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransferInitiateBankTransferResponse.Data.builder()
                        .id("txn-001")
                        .amount(1000.0)
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .currency("ZMW")
                        .recipient(
                            TransferInitiateBankTransferResponse.Data.Recipient.builder()
                                .accountName("JOHN DOE")
                                .accountNumber("1234567890")
                                .bankName("Zambia National Commercial Bank")
                                .operator("airtel")
                                .phone("0977123456")
                                .build()
                        )
                        .reference("payout-12345")
                        .status(TransferInitiateBankTransferResponse.Data.Status.SUCCESSFUL)
                        .type(TransferInitiateBankTransferResponse.Data.Type.BANK_ACCOUNT)
                        .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                        .narration("Salary payment")
                        .build()
                )
                .build()

        assertThat(transferInitiateBankTransferResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(transferInitiateBankTransferResponse.status()).isEqualTo(true)
        assertThat(transferInitiateBankTransferResponse.data())
            .contains(
                TransferInitiateBankTransferResponse.Data.builder()
                    .id("txn-001")
                    .amount(1000.0)
                    .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                    .currency("ZMW")
                    .recipient(
                        TransferInitiateBankTransferResponse.Data.Recipient.builder()
                            .accountName("JOHN DOE")
                            .accountNumber("1234567890")
                            .bankName("Zambia National Commercial Bank")
                            .operator("airtel")
                            .phone("0977123456")
                            .build()
                    )
                    .reference("payout-12345")
                    .status(TransferInitiateBankTransferResponse.Data.Status.SUCCESSFUL)
                    .type(TransferInitiateBankTransferResponse.Data.Type.BANK_ACCOUNT)
                    .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                    .narration("Salary payment")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferInitiateBankTransferResponse =
            TransferInitiateBankTransferResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransferInitiateBankTransferResponse.Data.builder()
                        .id("txn-001")
                        .amount(1000.0)
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .currency("ZMW")
                        .recipient(
                            TransferInitiateBankTransferResponse.Data.Recipient.builder()
                                .accountName("JOHN DOE")
                                .accountNumber("1234567890")
                                .bankName("Zambia National Commercial Bank")
                                .operator("airtel")
                                .phone("0977123456")
                                .build()
                        )
                        .reference("payout-12345")
                        .status(TransferInitiateBankTransferResponse.Data.Status.SUCCESSFUL)
                        .type(TransferInitiateBankTransferResponse.Data.Type.BANK_ACCOUNT)
                        .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                        .narration("Salary payment")
                        .build()
                )
                .build()

        val roundtrippedTransferInitiateBankTransferResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferInitiateBankTransferResponse),
                jacksonTypeRef<TransferInitiateBankTransferResponse>(),
            )

        assertThat(roundtrippedTransferInitiateBankTransferResponse)
            .isEqualTo(transferInitiateBankTransferResponse)
    }
}
