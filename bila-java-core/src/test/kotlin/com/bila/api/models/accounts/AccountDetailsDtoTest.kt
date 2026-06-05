// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.accounts

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountDetailsDtoTest {

    @Test
    fun create() {
        val accountDetailsDto =
            AccountDetailsDto.builder()
                .accountName("John Doe")
                .type("bank-account")
                .tillNumber("123456")
                .build()

        assertThat(accountDetailsDto.accountName()).isEqualTo("John Doe")
        assertThat(accountDetailsDto.type()).isEqualTo("bank-account")
        assertThat(accountDetailsDto.tillNumber()).contains("123456")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountDetailsDto =
            AccountDetailsDto.builder()
                .accountName("John Doe")
                .type("bank-account")
                .tillNumber("123456")
                .build()

        val roundtrippedAccountDetailsDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountDetailsDto),
                jacksonTypeRef<AccountDetailsDto>(),
            )

        assertThat(roundtrippedAccountDetailsDto).isEqualTo(accountDetailsDto)
    }
}
