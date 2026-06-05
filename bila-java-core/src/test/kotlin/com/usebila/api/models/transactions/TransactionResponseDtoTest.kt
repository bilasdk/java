// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionResponseDtoTest {

    @Test
    fun create() {
        val transactionResponseDto =
            TransactionResponseDto.builder()
                .id("txn-001")
                .accountId("acc-001")
                .amount(1000.0)
                .balanceAfter(6000.0)
                .balanceBefore(5000.0)
                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .currency("ZMW")
                .status(TransactionResponseDto.Status.SUCCESSFUL)
                .type(TransactionResponseDto.Type.CREDIT)
                .description("Mobile money collection")
                .reference("order-12345")
                .build()

        assertThat(transactionResponseDto.id()).isEqualTo("txn-001")
        assertThat(transactionResponseDto.accountId()).isEqualTo("acc-001")
        assertThat(transactionResponseDto.amount()).isEqualTo(1000.0)
        assertThat(transactionResponseDto.balanceAfter()).isEqualTo(6000.0)
        assertThat(transactionResponseDto.balanceBefore()).isEqualTo(5000.0)
        assertThat(transactionResponseDto.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
        assertThat(transactionResponseDto.currency()).isEqualTo("ZMW")
        assertThat(transactionResponseDto.status())
            .isEqualTo(TransactionResponseDto.Status.SUCCESSFUL)
        assertThat(transactionResponseDto.type()).isEqualTo(TransactionResponseDto.Type.CREDIT)
        assertThat(transactionResponseDto.description()).contains("Mobile money collection")
        assertThat(transactionResponseDto.reference()).contains("order-12345")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionResponseDto =
            TransactionResponseDto.builder()
                .id("txn-001")
                .accountId("acc-001")
                .amount(1000.0)
                .balanceAfter(6000.0)
                .balanceBefore(5000.0)
                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .currency("ZMW")
                .status(TransactionResponseDto.Status.SUCCESSFUL)
                .type(TransactionResponseDto.Type.CREDIT)
                .description("Mobile money collection")
                .reference("order-12345")
                .build()

        val roundtrippedTransactionResponseDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionResponseDto),
                jacksonTypeRef<TransactionResponseDto>(),
            )

        assertThat(roundtrippedTransactionResponseDto).isEqualTo(transactionResponseDto)
    }
}
