// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transactions

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
                    TransactionRetrieveResponse.Data.builder()
                        .id("txn-001")
                        .accountId("acc-001")
                        .amount(1000.0)
                        .balanceAfter(6000.0)
                        .balanceBefore(5000.0)
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .currency("ZMW")
                        .status(TransactionRetrieveResponse.Data.Status.SUCCESSFUL)
                        .type(TransactionRetrieveResponse.Data.Type.CREDIT)
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
                TransactionRetrieveResponse.Data.builder()
                    .id("txn-001")
                    .accountId("acc-001")
                    .amount(1000.0)
                    .balanceAfter(6000.0)
                    .balanceBefore(5000.0)
                    .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                    .currency("ZMW")
                    .status(TransactionRetrieveResponse.Data.Status.SUCCESSFUL)
                    .type(TransactionRetrieveResponse.Data.Type.CREDIT)
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
                    TransactionRetrieveResponse.Data.builder()
                        .id("txn-001")
                        .accountId("acc-001")
                        .amount(1000.0)
                        .balanceAfter(6000.0)
                        .balanceBefore(5000.0)
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .currency("ZMW")
                        .status(TransactionRetrieveResponse.Data.Status.SUCCESSFUL)
                        .type(TransactionRetrieveResponse.Data.Type.CREDIT)
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
