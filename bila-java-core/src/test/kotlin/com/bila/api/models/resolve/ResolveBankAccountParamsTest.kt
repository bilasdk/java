// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.resolve

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResolveBankAccountParamsTest {

    @Test
    fun create() {
        ResolveBankAccountParams.builder()
            .accountNumber("1234567890")
            .bankId("bank-001")
            .country(ResolveBankAccountParams.Country.ZM)
            .build()
    }

    @Test
    fun body() {
        val params =
            ResolveBankAccountParams.builder()
                .accountNumber("1234567890")
                .bankId("bank-001")
                .country(ResolveBankAccountParams.Country.ZM)
                .build()

        val body = params._body()

        assertThat(body.accountNumber()).isEqualTo("1234567890")
        assertThat(body.bankId()).isEqualTo("bank-001")
        assertThat(body.country()).contains(ResolveBankAccountParams.Country.ZM)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ResolveBankAccountParams.builder()
                .accountNumber("1234567890")
                .bankId("bank-001")
                .build()

        val body = params._body()

        assertThat(body.accountNumber()).isEqualTo("1234567890")
        assertThat(body.bankId()).isEqualTo("bank-001")
    }
}
