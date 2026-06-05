// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.usebila.api.client.okhttp.BilaOkHttpClient
import com.usebila.api.models.resolve.ResolveBankAccountParams
import com.usebila.api.models.resolve.ResolveMobileMoneyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResolveServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun bankAccount() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val resolveService = client.resolve()

        val response =
            resolveService.bankAccount(
                ResolveBankAccountParams.builder()
                    .accountNumber("1234567890")
                    .bankId("bank-001")
                    .country(ResolveBankAccountParams.Country.ZM)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun mobileMoney() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val resolveService = client.resolve()

        val response =
            resolveService.mobileMoney(
                ResolveMobileMoneyParams.builder()
                    .country(ResolveMobileMoneyParams.Country.ZM)
                    .operator(ResolveMobileMoneyParams.Operator.AIRTEL)
                    .phone("0977433571")
                    .build()
            )

        response.validate()
    }
}
