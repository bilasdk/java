// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.usebila.api.client.okhttp.BilaOkHttpClient
import com.usebila.api.models.transfers.TransferInitiateBankTransferParams
import com.usebila.api.models.transfers.TransferInitiateMobileMoneyTransferParams
import com.usebila.api.models.transfers.TransferListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransferServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transferService = client.transfers()

        val transfer = transferService.retrieve("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        transfer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transferService = client.transfers()

        val transfers =
            transferService.list(
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

        transfers.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatusByReference() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transferService = client.transfers()

        val response = transferService.getStatusByReference("transfer-001")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun initiateBankTransfer() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transferService = client.transfers()

        val response =
            transferService.initiateBankTransfer(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun initiateMobileMoneyTransfer() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transferService = client.transfers()

        val response =
            transferService.initiateMobileMoneyTransfer(
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

        response.validate()
    }
}
