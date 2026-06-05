// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.async

import com.usebila.api.client.okhttp.BilaOkHttpClientAsync
import com.usebila.api.models.transferrecipients.TransferRecipientCreateBankAccountParams
import com.usebila.api.models.transferrecipients.TransferRecipientCreateMobileMoneyParams
import com.usebila.api.models.transferrecipients.TransferRecipientListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransferRecipientServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transferRecipientServiceAsync = client.transferRecipients()

        val transferRecipientFuture =
            transferRecipientServiceAsync.retrieve("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        val transferRecipient = transferRecipientFuture.get()
        transferRecipient.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transferRecipientServiceAsync = client.transferRecipients()

        val transferRecipientsFuture =
            transferRecipientServiceAsync.list(
                TransferRecipientListParams.builder()
                    .page(1.0)
                    .perPage(50.0)
                    .type(TransferRecipientListParams.Type.BANK_ACCOUNT)
                    .build()
            )

        val transferRecipients = transferRecipientsFuture.get()
        transferRecipients.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createBankAccount() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transferRecipientServiceAsync = client.transferRecipients()

        val responseFuture =
            transferRecipientServiceAsync.createBankAccount(
                TransferRecipientCreateBankAccountParams.builder()
                    .accountNumber("1234567890")
                    .bankId("bank-001")
                    .accountName("John Doe")
                    .country(TransferRecipientCreateBankAccountParams.Country.ZM)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMobileMoney() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transferRecipientServiceAsync = client.transferRecipients()

        val responseFuture =
            transferRecipientServiceAsync.createMobileMoney(
                TransferRecipientCreateMobileMoneyParams.builder()
                    .country(TransferRecipientCreateMobileMoneyParams.Country.ZM)
                    .operator(TransferRecipientCreateMobileMoneyParams.Operator.AIRTEL)
                    .phone("0977433571")
                    .accountName("John Doe")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
