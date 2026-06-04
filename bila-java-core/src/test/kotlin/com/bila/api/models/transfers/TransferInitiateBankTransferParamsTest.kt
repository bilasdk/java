// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferInitiateBankTransferParamsTest {

    @Test
    fun create() {
        TransferInitiateBankTransferParams.builder()
            .accountId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
            .amount(1000.0)
            .reference("transfer-001")
            .accountNumber("1234567890")
            .bankId("bank-001")
            .country(TransferInitiateBankTransferParams.Country.ZM)
            .narration("Payment for services")
            .recipientName("Jane Doe")
            .transferRecipientId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
            .walletId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
            .build()
    }

    @Test
    fun body() {
        val params =
            TransferInitiateBankTransferParams.builder()
                .accountId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .amount(1000.0)
                .reference("transfer-001")
                .accountNumber("1234567890")
                .bankId("bank-001")
                .country(TransferInitiateBankTransferParams.Country.ZM)
                .narration("Payment for services")
                .recipientName("Jane Doe")
                .transferRecipientId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .walletId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f4")
        assertThat(body.amount()).isEqualTo(1000.0)
        assertThat(body.reference()).isEqualTo("transfer-001")
        assertThat(body.accountNumber()).contains("1234567890")
        assertThat(body.bankId()).contains("bank-001")
        assertThat(body.country()).contains(TransferInitiateBankTransferParams.Country.ZM)
        assertThat(body.narration()).contains("Payment for services")
        assertThat(body.recipientName()).contains("Jane Doe")
        assertThat(body.transferRecipientId()).contains("68f11209-451f-4a15-bfcd-d916eb8b09f4")
        assertThat(body.walletId()).contains("68f11209-451f-4a15-bfcd-d916eb8b09f4")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransferInitiateBankTransferParams.builder()
                .accountId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .amount(1000.0)
                .reference("transfer-001")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f4")
        assertThat(body.amount()).isEqualTo(1000.0)
        assertThat(body.reference()).isEqualTo("transfer-001")
    }
}
