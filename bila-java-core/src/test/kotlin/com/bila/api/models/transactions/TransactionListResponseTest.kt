// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transactions

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionListResponseTest {

    @Test
    fun create() {
        val transactionListResponse =
            TransactionListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransactionListResponse.Data.builder()
                        .addData(
                            TransactionListResponse.Data.InnerData.builder()
                                .id("txn-001")
                                .accountId("acc-001")
                                .amount(1000.0)
                                .balanceAfter(6000.0)
                                .balanceBefore(5000.0)
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .currency("ZMW")
                                .status(TransactionListResponse.Data.InnerData.Status.SUCCESSFUL)
                                .type(TransactionListResponse.Data.InnerData.Type.CREDIT)
                                .description("Mobile money collection")
                                .reference("order-12345")
                                .build()
                        )
                        .meta(
                            TransactionListResponse.Data.Meta.builder()
                                .currentPage(1.0)
                                .pageCount(3.0)
                                .perPage(50.0)
                                .total(150.0)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(transactionListResponse.message()).isEqualTo("Operation completed successfully")
        assertThat(transactionListResponse.status()).isEqualTo(true)
        assertThat(transactionListResponse.data())
            .contains(
                TransactionListResponse.Data.builder()
                    .addData(
                        TransactionListResponse.Data.InnerData.builder()
                            .id("txn-001")
                            .accountId("acc-001")
                            .amount(1000.0)
                            .balanceAfter(6000.0)
                            .balanceBefore(5000.0)
                            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .currency("ZMW")
                            .status(TransactionListResponse.Data.InnerData.Status.SUCCESSFUL)
                            .type(TransactionListResponse.Data.InnerData.Type.CREDIT)
                            .description("Mobile money collection")
                            .reference("order-12345")
                            .build()
                    )
                    .meta(
                        TransactionListResponse.Data.Meta.builder()
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
        val transactionListResponse =
            TransactionListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransactionListResponse.Data.builder()
                        .addData(
                            TransactionListResponse.Data.InnerData.builder()
                                .id("txn-001")
                                .accountId("acc-001")
                                .amount(1000.0)
                                .balanceAfter(6000.0)
                                .balanceBefore(5000.0)
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .currency("ZMW")
                                .status(TransactionListResponse.Data.InnerData.Status.SUCCESSFUL)
                                .type(TransactionListResponse.Data.InnerData.Type.CREDIT)
                                .description("Mobile money collection")
                                .reference("order-12345")
                                .build()
                        )
                        .meta(
                            TransactionListResponse.Data.Meta.builder()
                                .currentPage(1.0)
                                .pageCount(3.0)
                                .perPage(50.0)
                                .total(150.0)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedTransactionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionListResponse),
                jacksonTypeRef<TransactionListResponse>(),
            )

        assertThat(roundtrippedTransactionListResponse).isEqualTo(transactionListResponse)
    }
}
