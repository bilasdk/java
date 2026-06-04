// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transferrecipients

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferRecipientCreateBankAccountParamsTest {

    @Test
    fun create() {
        TransferRecipientCreateBankAccountParams.builder()
            .accountNumber("1234567890")
            .bankId("bank-001")
            .accountName("John Doe")
            .country(TransferRecipientCreateBankAccountParams.Country.ZM)
            .build()
    }

    @Test
    fun body() {
        val params =
            TransferRecipientCreateBankAccountParams.builder()
                .accountNumber("1234567890")
                .bankId("bank-001")
                .accountName("John Doe")
                .country(TransferRecipientCreateBankAccountParams.Country.ZM)
                .build()

        val body = params._body()

        assertThat(body.accountNumber()).isEqualTo("1234567890")
        assertThat(body.bankId()).isEqualTo("bank-001")
        assertThat(body.accountName()).contains("John Doe")
        assertThat(body.country()).contains(TransferRecipientCreateBankAccountParams.Country.ZM)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransferRecipientCreateBankAccountParams.builder()
                .accountNumber("1234567890")
                .bankId("bank-001")
                .build()

        val body = params._body()

        assertThat(body.accountNumber()).isEqualTo("1234567890")
        assertThat(body.bankId()).isEqualTo("bank-001")
    }
}
