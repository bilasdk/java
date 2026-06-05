// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.accounts

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountResponseDtoTest {

    @Test
    fun create() {
        val accountResponseDto =
            AccountResponseDto.builder()
                .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .currency("ZMW")
                .details(
                    AccountDetailsDto.builder()
                        .accountName("John Doe")
                        .type("bank-account")
                        .tillNumber("123456")
                        .build()
                )
                .status(AccountResponseDto.Status.ACTIVE)
                .type(AccountResponseDto.Type.MAIN)
                .availableBalance("1500.00")
                .ledgerBalance("1500.00")
                .build()

        assertThat(accountResponseDto.id()).isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f4")
        assertThat(accountResponseDto.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
        assertThat(accountResponseDto.currency()).isEqualTo("ZMW")
        assertThat(accountResponseDto.details())
            .isEqualTo(
                AccountDetailsDto.builder()
                    .accountName("John Doe")
                    .type("bank-account")
                    .tillNumber("123456")
                    .build()
            )
        assertThat(accountResponseDto.status()).isEqualTo(AccountResponseDto.Status.ACTIVE)
        assertThat(accountResponseDto.type()).isEqualTo(AccountResponseDto.Type.MAIN)
        assertThat(accountResponseDto.availableBalance()).contains("1500.00")
        assertThat(accountResponseDto.ledgerBalance()).contains("1500.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountResponseDto =
            AccountResponseDto.builder()
                .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                .currency("ZMW")
                .details(
                    AccountDetailsDto.builder()
                        .accountName("John Doe")
                        .type("bank-account")
                        .tillNumber("123456")
                        .build()
                )
                .status(AccountResponseDto.Status.ACTIVE)
                .type(AccountResponseDto.Type.MAIN)
                .availableBalance("1500.00")
                .ledgerBalance("1500.00")
                .build()

        val roundtrippedAccountResponseDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountResponseDto),
                jacksonTypeRef<AccountResponseDto>(),
            )

        assertThat(roundtrippedAccountResponseDto).isEqualTo(accountResponseDto)
    }
}
