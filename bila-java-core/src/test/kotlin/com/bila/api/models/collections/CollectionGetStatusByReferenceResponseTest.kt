// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.collections

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionGetStatusByReferenceResponseTest {

    @Test
    fun create() {
        val collectionGetStatusByReferenceResponse =
            CollectionGetStatusByReferenceResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
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
                .build()

        assertThat(collectionGetStatusByReferenceResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(collectionGetStatusByReferenceResponse.status()).isEqualTo(true)
        assertThat(collectionGetStatusByReferenceResponse.data())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionGetStatusByReferenceResponse =
            CollectionGetStatusByReferenceResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
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
                .build()

        val roundtrippedCollectionGetStatusByReferenceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionGetStatusByReferenceResponse),
                jacksonTypeRef<CollectionGetStatusByReferenceResponse>(),
            )

        assertThat(roundtrippedCollectionGetStatusByReferenceResponse)
            .isEqualTo(collectionGetStatusByReferenceResponse)
    }
}
