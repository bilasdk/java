// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transferrecipients

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferRecipientCreateMobileMoneyParamsTest {

    @Test
    fun create() {
        TransferRecipientCreateMobileMoneyParams.builder()
            .country(TransferRecipientCreateMobileMoneyParams.Country.ZM)
            .operator(TransferRecipientCreateMobileMoneyParams.Operator.AIRTEL)
            .phone("0977433571")
            .accountName("John Doe")
            .build()
    }

    @Test
    fun body() {
        val params =
            TransferRecipientCreateMobileMoneyParams.builder()
                .country(TransferRecipientCreateMobileMoneyParams.Country.ZM)
                .operator(TransferRecipientCreateMobileMoneyParams.Operator.AIRTEL)
                .phone("0977433571")
                .accountName("John Doe")
                .build()

        val body = params._body()

        assertThat(body.country()).isEqualTo(TransferRecipientCreateMobileMoneyParams.Country.ZM)
        assertThat(body.operator())
            .isEqualTo(TransferRecipientCreateMobileMoneyParams.Operator.AIRTEL)
        assertThat(body.phone()).isEqualTo("0977433571")
        assertThat(body.accountName()).contains("John Doe")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransferRecipientCreateMobileMoneyParams.builder()
                .country(TransferRecipientCreateMobileMoneyParams.Country.ZM)
                .operator(TransferRecipientCreateMobileMoneyParams.Operator.AIRTEL)
                .phone("0977433571")
                .build()

        val body = params._body()

        assertThat(body.country()).isEqualTo(TransferRecipientCreateMobileMoneyParams.Country.ZM)
        assertThat(body.operator())
            .isEqualTo(TransferRecipientCreateMobileMoneyParams.Operator.AIRTEL)
        assertThat(body.phone()).isEqualTo("0977433571")
    }
}
