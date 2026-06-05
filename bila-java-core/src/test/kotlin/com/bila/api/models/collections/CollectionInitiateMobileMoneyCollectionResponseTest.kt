// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.collections

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionInitiateMobileMoneyCollectionResponseTest {

    @Test
    fun create() {
        val collectionInitiateMobileMoneyCollectionResponse =
            CollectionInitiateMobileMoneyCollectionResponse.builder()
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

        assertThat(collectionInitiateMobileMoneyCollectionResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(collectionInitiateMobileMoneyCollectionResponse.status()).isEqualTo(true)
        assertThat(collectionInitiateMobileMoneyCollectionResponse.data())
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
        val collectionInitiateMobileMoneyCollectionResponse =
            CollectionInitiateMobileMoneyCollectionResponse.builder()
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

        val roundtrippedCollectionInitiateMobileMoneyCollectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionInitiateMobileMoneyCollectionResponse),
                jacksonTypeRef<CollectionInitiateMobileMoneyCollectionResponse>(),
            )

        assertThat(roundtrippedCollectionInitiateMobileMoneyCollectionResponse)
            .isEqualTo(collectionInitiateMobileMoneyCollectionResponse)
    }
}
