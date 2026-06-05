// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transferrecipients

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecipientResponseDtoTest {

    @Test
    fun create() {
        val recipientResponseDto =
            RecipientResponseDto.builder()
                .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .accountName("John Doe")
                .country("zm")
                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .type(RecipientResponseDto.Type.BANK_ACCOUNT)
                .accountNumber("1234567890")
                .bankId("bank-001")
                .bankName("Zambia National Commercial Bank")
                .operator("airtel")
                .phone("0977123456")
                .build()

        assertThat(recipientResponseDto.id()).isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f4")
        assertThat(recipientResponseDto.accountName()).isEqualTo("John Doe")
        assertThat(recipientResponseDto.country()).isEqualTo("zm")
        assertThat(recipientResponseDto.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
        assertThat(recipientResponseDto.type()).isEqualTo(RecipientResponseDto.Type.BANK_ACCOUNT)
        assertThat(recipientResponseDto.accountNumber()).contains("1234567890")
        assertThat(recipientResponseDto.bankId()).contains("bank-001")
        assertThat(recipientResponseDto.bankName()).contains("Zambia National Commercial Bank")
        assertThat(recipientResponseDto.operator()).contains("airtel")
        assertThat(recipientResponseDto.phone()).contains("0977123456")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recipientResponseDto =
            RecipientResponseDto.builder()
                .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .accountName("John Doe")
                .country("zm")
                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .type(RecipientResponseDto.Type.BANK_ACCOUNT)
                .accountNumber("1234567890")
                .bankId("bank-001")
                .bankName("Zambia National Commercial Bank")
                .operator("airtel")
                .phone("0977123456")
                .build()

        val roundtrippedRecipientResponseDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recipientResponseDto),
                jacksonTypeRef<RecipientResponseDto>(),
            )

        assertThat(roundtrippedRecipientResponseDto).isEqualTo(recipientResponseDto)
    }
}
