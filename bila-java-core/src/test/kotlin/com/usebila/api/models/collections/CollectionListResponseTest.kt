// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.collections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import com.usebila.api.models.PaginationMetaDto
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionListResponseTest {

    @Test
    fun create() {
        val collectionListResponse =
            CollectionListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    CollectionListResponse.Data.builder()
                        .addData(
                            BilaCollectionResponseDto.builder()
                                .id("col-001")
                                .amount(100.0)
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .currency("ZMW")
                                .customer(
                                    BilaCollectionCustomerDto.builder()
                                        .name("JOHN DOE")
                                        .operator("airtel")
                                        .phone("0977123456")
                                        .build()
                                )
                                .reference("order-12345")
                                .status(BilaCollectionResponseDto.Status.PENDING)
                                .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                                .feeBearer(BilaCollectionResponseDto.FeeBearer.MERCHANT)
                                .narration("Payment for Order #12345")
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

        assertThat(collectionListResponse.message()).isEqualTo("Operation completed successfully")
        assertThat(collectionListResponse.status()).isEqualTo(true)
        assertThat(collectionListResponse.data())
            .contains(
                CollectionListResponse.Data.builder()
                    .addData(
                        BilaCollectionResponseDto.builder()
                            .id("col-001")
                            .amount(100.0)
                            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .currency("ZMW")
                            .customer(
                                BilaCollectionCustomerDto.builder()
                                    .name("JOHN DOE")
                                    .operator("airtel")
                                    .phone("0977123456")
                                    .build()
                            )
                            .reference("order-12345")
                            .status(BilaCollectionResponseDto.Status.PENDING)
                            .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                            .feeBearer(BilaCollectionResponseDto.FeeBearer.MERCHANT)
                            .narration("Payment for Order #12345")
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
        val collectionListResponse =
            CollectionListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    CollectionListResponse.Data.builder()
                        .addData(
                            BilaCollectionResponseDto.builder()
                                .id("col-001")
                                .amount(100.0)
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .currency("ZMW")
                                .customer(
                                    BilaCollectionCustomerDto.builder()
                                        .name("JOHN DOE")
                                        .operator("airtel")
                                        .phone("0977123456")
                                        .build()
                                )
                                .reference("order-12345")
                                .status(BilaCollectionResponseDto.Status.PENDING)
                                .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                                .feeBearer(BilaCollectionResponseDto.FeeBearer.MERCHANT)
                                .narration("Payment for Order #12345")
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

        val roundtrippedCollectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionListResponse),
                jacksonTypeRef<CollectionListResponse>(),
            )

        assertThat(roundtrippedCollectionListResponse).isEqualTo(collectionListResponse)
    }
}
