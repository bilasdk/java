// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferInitiateMobileMoneyTransferParamsTest {

    @Test
    fun create() {
        TransferInitiateMobileMoneyTransferParams.builder()
            .amount(250.0)
            .country(TransferInitiateMobileMoneyTransferParams.Country.ZM)
            .operator(TransferInitiateMobileMoneyTransferParams.Operator.AIRTEL)
            .phone("0977433571")
            .reference("mobile-transfer-001")
            .narration("Mobile money payout")
            .recipientName("Jane Doe")
            .walletId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
            .build()
    }

    @Test
    fun body() {
        val params =
            TransferInitiateMobileMoneyTransferParams.builder()
                .amount(250.0)
                .country(TransferInitiateMobileMoneyTransferParams.Country.ZM)
                .operator(TransferInitiateMobileMoneyTransferParams.Operator.AIRTEL)
                .phone("0977433571")
                .reference("mobile-transfer-001")
                .narration("Mobile money payout")
                .recipientName("Jane Doe")
                .walletId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(250.0)
        assertThat(body.country()).isEqualTo(TransferInitiateMobileMoneyTransferParams.Country.ZM)
        assertThat(body.operator())
            .isEqualTo(TransferInitiateMobileMoneyTransferParams.Operator.AIRTEL)
        assertThat(body.phone()).isEqualTo("0977433571")
        assertThat(body.reference()).isEqualTo("mobile-transfer-001")
        assertThat(body.narration()).contains("Mobile money payout")
        assertThat(body.recipientName()).contains("Jane Doe")
        assertThat(body.walletId()).contains("68f11209-451f-4a15-bfcd-d916eb8b09f4")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransferInitiateMobileMoneyTransferParams.builder()
                .amount(250.0)
                .country(TransferInitiateMobileMoneyTransferParams.Country.ZM)
                .operator(TransferInitiateMobileMoneyTransferParams.Operator.AIRTEL)
                .phone("0977433571")
                .reference("mobile-transfer-001")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(250.0)
        assertThat(body.country()).isEqualTo(TransferInitiateMobileMoneyTransferParams.Country.ZM)
        assertThat(body.operator())
            .isEqualTo(TransferInitiateMobileMoneyTransferParams.Operator.AIRTEL)
        assertThat(body.phone()).isEqualTo("0977433571")
        assertThat(body.reference()).isEqualTo("mobile-transfer-001")
    }
}
