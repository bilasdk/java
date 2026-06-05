// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.collections

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BilaCollectionResponseDtoTest {

    @Test
    fun create() {
        val bilaCollectionResponseDto =
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

        assertThat(bilaCollectionResponseDto.id()).isEqualTo("col-001")
        assertThat(bilaCollectionResponseDto.amount()).isEqualTo(100.0)
        assertThat(bilaCollectionResponseDto.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
        assertThat(bilaCollectionResponseDto.currency()).isEqualTo("ZMW")
        assertThat(bilaCollectionResponseDto.customer())
            .isEqualTo(
                BilaCollectionCustomerDto.builder()
                    .name("JOHN DOE")
                    .operator("airtel")
                    .phone("0977123456")
                    .build()
            )
        assertThat(bilaCollectionResponseDto.reference()).isEqualTo("order-12345")
        assertThat(bilaCollectionResponseDto.status())
            .isEqualTo(BilaCollectionResponseDto.Status.PENDING)
        assertThat(bilaCollectionResponseDto.completedAt())
            .contains(OffsetDateTime.parse("2024-01-15T10:31:00Z"))
        assertThat(bilaCollectionResponseDto.feeBearer())
            .contains(BilaCollectionResponseDto.FeeBearer.MERCHANT)
        assertThat(bilaCollectionResponseDto.narration()).contains("Payment for Order #12345")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bilaCollectionResponseDto =
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

        val roundtrippedBilaCollectionResponseDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bilaCollectionResponseDto),
                jacksonTypeRef<BilaCollectionResponseDto>(),
            )

        assertThat(roundtrippedBilaCollectionResponseDto).isEqualTo(bilaCollectionResponseDto)
    }
}
