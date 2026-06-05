// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.transfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferInitiateMobileMoneyTransferResponseTest {

    @Test
    fun create() {
        val transferInitiateMobileMoneyTransferResponse =
            TransferInitiateMobileMoneyTransferResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransferResponseDto.builder()
                        .id("txn-001")
                        .amount(1000.0)
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .currency("ZMW")
                        .recipient(
                            TransferRecipientDto.builder()
                                .accountName("JOHN DOE")
                                .accountNumber("1234567890")
                                .bankName("Zambia National Commercial Bank")
                                .operator("airtel")
                                .phone("0977123456")
                                .build()
                        )
                        .reference("payout-12345")
                        .status(TransferResponseDto.Status.SUCCESSFUL)
                        .type(TransferResponseDto.Type.BANK_ACCOUNT)
                        .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                        .narration("Salary payment")
                        .build()
                )
                .build()

        assertThat(transferInitiateMobileMoneyTransferResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(transferInitiateMobileMoneyTransferResponse.status()).isEqualTo(true)
        assertThat(transferInitiateMobileMoneyTransferResponse.data())
            .contains(
                TransferResponseDto.builder()
                    .id("txn-001")
                    .amount(1000.0)
                    .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                    .currency("ZMW")
                    .recipient(
                        TransferRecipientDto.builder()
                            .accountName("JOHN DOE")
                            .accountNumber("1234567890")
                            .bankName("Zambia National Commercial Bank")
                            .operator("airtel")
                            .phone("0977123456")
                            .build()
                    )
                    .reference("payout-12345")
                    .status(TransferResponseDto.Status.SUCCESSFUL)
                    .type(TransferResponseDto.Type.BANK_ACCOUNT)
                    .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                    .narration("Salary payment")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferInitiateMobileMoneyTransferResponse =
            TransferInitiateMobileMoneyTransferResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransferResponseDto.builder()
                        .id("txn-001")
                        .amount(1000.0)
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .currency("ZMW")
                        .recipient(
                            TransferRecipientDto.builder()
                                .accountName("JOHN DOE")
                                .accountNumber("1234567890")
                                .bankName("Zambia National Commercial Bank")
                                .operator("airtel")
                                .phone("0977123456")
                                .build()
                        )
                        .reference("payout-12345")
                        .status(TransferResponseDto.Status.SUCCESSFUL)
                        .type(TransferResponseDto.Type.BANK_ACCOUNT)
                        .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                        .narration("Salary payment")
                        .build()
                )
                .build()

        val roundtrippedTransferInitiateMobileMoneyTransferResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferInitiateMobileMoneyTransferResponse),
                jacksonTypeRef<TransferInitiateMobileMoneyTransferResponse>(),
            )

        assertThat(roundtrippedTransferInitiateMobileMoneyTransferResponse)
            .isEqualTo(transferInitiateMobileMoneyTransferResponse)
    }
}
