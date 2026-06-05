// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.transfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferRetrieveResponseTest {

    @Test
    fun create() {
        val transferRetrieveResponse =
            TransferRetrieveResponse.builder()
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

        assertThat(transferRetrieveResponse.message()).isEqualTo("Operation completed successfully")
        assertThat(transferRetrieveResponse.status()).isEqualTo(true)
        assertThat(transferRetrieveResponse.data())
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
        val transferRetrieveResponse =
            TransferRetrieveResponse.builder()
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

        val roundtrippedTransferRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferRetrieveResponse),
                jacksonTypeRef<TransferRetrieveResponse>(),
            )

        assertThat(roundtrippedTransferRetrieveResponse).isEqualTo(transferRetrieveResponse)
    }
}
