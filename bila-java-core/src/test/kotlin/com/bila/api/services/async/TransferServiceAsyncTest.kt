// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.async

import com.bila.api.client.okhttp.BilaOkHttpClientAsync
import com.bila.api.models.transfers.TransferInitiateBankTransferParams
import com.bila.api.models.transfers.TransferInitiateMobileMoneyTransferParams
import com.bila.api.models.transfers.TransferListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransferServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transferServiceAsync = client.transfers()

        val transferFuture = transferServiceAsync.retrieve("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        val transfer = transferFuture.get()
        transfer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transferServiceAsync = client.transfers()

        val transfersFuture =
            transferServiceAsync.list(
                TransferListParams.builder()
                    .accountId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .endDate("2024-12-31T23:59:59Z")
                    .page(1.0)
                    .perPage(50.0)
                    .startDate("2024-01-01T00:00:00Z")
                    .status(TransferListParams.Status.PENDING)
                    .type(TransferListParams.Type.BANK_ACCOUNT)
                    .build()
            )

        val transfers = transfersFuture.get()
        transfers.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatusByReference() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transferServiceAsync = client.transfers()

        val responseFuture = transferServiceAsync.getStatusByReference("transfer-001")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun initiateBankTransfer() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transferServiceAsync = client.transfers()

        val responseFuture =
            transferServiceAsync.initiateBankTransfer(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun initiateMobileMoneyTransfer() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transferServiceAsync = client.transfers()

        val responseFuture =
            transferServiceAsync.initiateMobileMoneyTransfer(
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
