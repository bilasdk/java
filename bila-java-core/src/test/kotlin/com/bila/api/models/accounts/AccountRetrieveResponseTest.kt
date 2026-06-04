// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.accounts

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountRetrieveResponseTest {

    @Test
    fun create() {
        val accountRetrieveResponse =
            AccountRetrieveResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    AccountRetrieveResponse.Data.builder()
                        .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .currency("ZMW")
                        .details(
                            AccountRetrieveResponse.Data.Details.builder()
                                .accountName("John Doe")
                                .type("bank-account")
                                .tillNumber("123456")
                                .build()
                        )
                        .status(AccountRetrieveResponse.Data.Status.ACTIVE)
                        .type(AccountRetrieveResponse.Data.Type.MAIN)
                        .availableBalance("1500.00")
                        .ledgerBalance("1500.00")
                        .build()
                )
                .build()

        assertThat(accountRetrieveResponse.message()).isEqualTo("Operation completed successfully")
        assertThat(accountRetrieveResponse.status()).isEqualTo(true)
        assertThat(accountRetrieveResponse.data())
            .contains(
                AccountRetrieveResponse.Data.builder()
                    .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                    .currency("ZMW")
                    .details(
                        AccountRetrieveResponse.Data.Details.builder()
                            .accountName("John Doe")
                            .type("bank-account")
                            .tillNumber("123456")
                            .build()
                    )
                    .status(AccountRetrieveResponse.Data.Status.ACTIVE)
                    .type(AccountRetrieveResponse.Data.Type.MAIN)
                    .availableBalance("1500.00")
                    .ledgerBalance("1500.00")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountRetrieveResponse =
            AccountRetrieveResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    AccountRetrieveResponse.Data.builder()
                        .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                        .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                        .currency("ZMW")
                        .details(
                            AccountRetrieveResponse.Data.Details.builder()
                                .accountName("John Doe")
                                .type("bank-account")
                                .tillNumber("123456")
                                .build()
                        )
                        .status(AccountRetrieveResponse.Data.Status.ACTIVE)
                        .type(AccountRetrieveResponse.Data.Type.MAIN)
                        .availableBalance("1500.00")
                        .ledgerBalance("1500.00")
                        .build()
                )
                .build()

        val roundtrippedAccountRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountRetrieveResponse),
                jacksonTypeRef<AccountRetrieveResponse>(),
            )

        assertThat(roundtrippedAccountRetrieveResponse).isEqualTo(accountRetrieveResponse)
    }
}
