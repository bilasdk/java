// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.transfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import com.usebila.api.models.PaginationMetaDto
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferListResponseTest {

    @Test
    fun create() {
        val transferListResponse =
            TransferListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransferListResponse.Data.builder()
                        .addData(
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
                        .meta(
                            PaginationMetaDto.builder()
                                .currentPage(1.0)
                                .pageCount(3.0)
                                .perPage(50.0)
                                .total(150.0)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(transferListResponse.message()).isEqualTo("Operation completed successfully")
        assertThat(transferListResponse.status()).isEqualTo(true)
        assertThat(transferListResponse.data())
            .contains(
                TransferListResponse.Data.builder()
                    .addData(
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
                    .meta(
                        PaginationMetaDto.builder()
                            .currentPage(1.0)
                            .pageCount(3.0)
                            .perPage(50.0)
                            .total(150.0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferListResponse =
            TransferListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransferListResponse.Data.builder()
                        .addData(
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
                        .meta(
                            PaginationMetaDto.builder()
                                .currentPage(1.0)
                                .pageCount(3.0)
                                .perPage(50.0)
                                .total(150.0)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedTransferListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferListResponse),
                jacksonTypeRef<TransferListResponse>(),
            )

        assertThat(roundtrippedTransferListResponse).isEqualTo(transferListResponse)
    }
}
