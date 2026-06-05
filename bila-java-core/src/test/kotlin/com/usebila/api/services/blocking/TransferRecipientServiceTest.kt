// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.usebila.api.client.okhttp.BilaOkHttpClient
import com.usebila.api.models.transferrecipients.TransferRecipientCreateBankAccountParams
import com.usebila.api.models.transferrecipients.TransferRecipientCreateMobileMoneyParams
import com.usebila.api.models.transferrecipients.TransferRecipientListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransferRecipientServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transferRecipientService = client.transferRecipients()

        val transferRecipient =
            transferRecipientService.retrieve("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        transferRecipient.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transferRecipientService = client.transferRecipients()

        val transferRecipients =
            transferRecipientService.list(
                TransferRecipientListParams.builder()
                    .page(1.0)
                    .perPage(50.0)
                    .type(TransferRecipientListParams.Type.BANK_ACCOUNT)
                    .build()
            )

        transferRecipients.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createBankAccount() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transferRecipientService = client.transferRecipients()

        val response =
            transferRecipientService.createBankAccount(
                TransferRecipientCreateBankAccountParams.builder()
                    .accountNumber("1234567890")
                    .bankId("bank-001")
                    .accountName("John Doe")
                    .country(TransferRecipientCreateBankAccountParams.Country.ZM)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMobileMoney() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transferRecipientService = client.transferRecipients()

        val response =
            transferRecipientService.createMobileMoney(
                TransferRecipientCreateMobileMoneyParams.builder()
                    .country(TransferRecipientCreateMobileMoneyParams.Country.ZM)
                    .operator(TransferRecipientCreateMobileMoneyParams.Operator.AIRTEL)
                    .phone("0977433571")
                    .accountName("John Doe")
                    .build()
            )

        response.validate()
    }
}
