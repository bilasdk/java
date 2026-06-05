// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transfers

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferResponseDtoTest {

    @Test
    fun create() {
        val transferResponseDto =
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

        assertThat(transferResponseDto.id()).isEqualTo("txn-001")
        assertThat(transferResponseDto.amount()).isEqualTo(1000.0)
        assertThat(transferResponseDto.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
        assertThat(transferResponseDto.currency()).isEqualTo("ZMW")
        assertThat(transferResponseDto.recipient())
            .isEqualTo(
                TransferRecipientDto.builder()
                    .accountName("JOHN DOE")
                    .accountNumber("1234567890")
                    .bankName("Zambia National Commercial Bank")
                    .operator("airtel")
                    .phone("0977123456")
                    .build()
            )
        assertThat(transferResponseDto.reference()).isEqualTo("payout-12345")
        assertThat(transferResponseDto.status()).isEqualTo(TransferResponseDto.Status.SUCCESSFUL)
        assertThat(transferResponseDto.type()).isEqualTo(TransferResponseDto.Type.BANK_ACCOUNT)
        assertThat(transferResponseDto.completedAt())
            .contains(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
        assertThat(transferResponseDto.narration()).contains("Salary payment")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferResponseDto =
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

        val roundtrippedTransferResponseDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferResponseDto),
                jacksonTypeRef<TransferResponseDto>(),
            )

        assertThat(roundtrippedTransferResponseDto).isEqualTo(transferResponseDto)
    }
}
