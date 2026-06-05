// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.usebila.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGetBalanceResponseTest {

    @Test
    fun create() {
        val accountGetBalanceResponse =
            AccountGetBalanceResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    AccountGetBalanceResponse.Data.builder()
                        .availableBalance("1500.00")
                        .currency("ZMW")
                        .ledgerBalance("1500.00")
                        .build()
                )
                .build()

        assertThat(accountGetBalanceResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(accountGetBalanceResponse.status()).isEqualTo(true)
        assertThat(accountGetBalanceResponse.data())
            .contains(
                AccountGetBalanceResponse.Data.builder()
                    .availableBalance("1500.00")
                    .currency("ZMW")
                    .ledgerBalance("1500.00")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountGetBalanceResponse =
            AccountGetBalanceResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    AccountGetBalanceResponse.Data.builder()
                        .availableBalance("1500.00")
                        .currency("ZMW")
                        .ledgerBalance("1500.00")
                        .build()
                )
                .build()

        val roundtrippedAccountGetBalanceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountGetBalanceResponse),
                jacksonTypeRef<AccountGetBalanceResponse>(),
            )

        assertThat(roundtrippedAccountGetBalanceResponse).isEqualTo(accountGetBalanceResponse)
    }
}
