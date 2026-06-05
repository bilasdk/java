// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionRetrieveResponseTest {

    @Test
    fun create() {
        val transactionRetrieveResponse =
            TransactionRetrieveResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
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
                )
                .build()

        assertThat(transactionRetrieveResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(transactionRetrieveResponse.status()).isEqualTo(true)
        assertThat(transactionRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionRetrieveResponse =
            TransactionRetrieveResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
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
                )
                .build()

        val roundtrippedTransactionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionRetrieveResponse),
                jacksonTypeRef<TransactionRetrieveResponse>(),
            )

        assertThat(roundtrippedTransactionRetrieveResponse).isEqualTo(transactionRetrieveResponse)
    }
}
