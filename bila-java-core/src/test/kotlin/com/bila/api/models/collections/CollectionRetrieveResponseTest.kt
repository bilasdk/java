// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.collections

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionRetrieveResponseTest {

    @Test
    fun create() {
        val collectionRetrieveResponse =
            CollectionRetrieveResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    CollectionRetrieveResponse.Data.builder()
                        .id("col-001")
                        .amount(100.0)
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .currency("ZMW")
                        .customer(
                            CollectionRetrieveResponse.Data.Customer.builder()
                                .name("JOHN DOE")
                                .operator("airtel")
                                .phone("0977123456")
                                .build()
                        )
                        .reference("order-12345")
                        .status(CollectionRetrieveResponse.Data.Status.SUCCESSFUL)
                        .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                        .feeBearer(CollectionRetrieveResponse.Data.FeeBearer.MERCHANT)
                        .narration("Payment for Order #12345")
                        .build()
                )
                .build()

        assertThat(collectionRetrieveResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(collectionRetrieveResponse.status()).isEqualTo(true)
        assertThat(collectionRetrieveResponse.data())
            .contains(
                CollectionRetrieveResponse.Data.builder()
                    .id("col-001")
                    .amount(100.0)
                    .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                    .currency("ZMW")
                    .customer(
                        CollectionRetrieveResponse.Data.Customer.builder()
                            .name("JOHN DOE")
                            .operator("airtel")
                            .phone("0977123456")
                            .build()
                    )
                    .reference("order-12345")
                    .status(CollectionRetrieveResponse.Data.Status.SUCCESSFUL)
                    .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                    .feeBearer(CollectionRetrieveResponse.Data.FeeBearer.MERCHANT)
                    .narration("Payment for Order #12345")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionRetrieveResponse =
            CollectionRetrieveResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    CollectionRetrieveResponse.Data.builder()
                        .id("col-001")
                        .amount(100.0)
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .currency("ZMW")
                        .customer(
                            CollectionRetrieveResponse.Data.Customer.builder()
                                .name("JOHN DOE")
                                .operator("airtel")
                                .phone("0977123456")
                                .build()
                        )
                        .reference("order-12345")
                        .status(CollectionRetrieveResponse.Data.Status.SUCCESSFUL)
                        .completedAt(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
                        .feeBearer(CollectionRetrieveResponse.Data.FeeBearer.MERCHANT)
                        .narration("Payment for Order #12345")
                        .build()
                )
                .build()

        val roundtrippedCollectionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionRetrieveResponse),
                jacksonTypeRef<CollectionRetrieveResponse>(),
            )

        assertThat(roundtrippedCollectionRetrieveResponse).isEqualTo(collectionRetrieveResponse)
    }
}
