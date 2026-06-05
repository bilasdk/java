// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.accounts

import com.bila.api.core.jsonMapper
import com.bila.api.models.PaginationMetaDto
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountListResponseTest {

    @Test
    fun create() {
        val accountListResponse =
            AccountListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    AccountListResponse.Data.builder()
                        .addData(
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

        assertThat(accountListResponse.message()).isEqualTo("Operation completed successfully")
        assertThat(accountListResponse.status()).isEqualTo(true)
        assertThat(accountListResponse.data())
            .contains(
                AccountListResponse.Data.builder()
                    .addData(
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
        val accountListResponse =
            AccountListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    AccountListResponse.Data.builder()
                        .addData(
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

        val roundtrippedAccountListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountListResponse),
                jacksonTypeRef<AccountListResponse>(),
            )

        assertThat(roundtrippedAccountListResponse).isEqualTo(accountListResponse)
    }
}
