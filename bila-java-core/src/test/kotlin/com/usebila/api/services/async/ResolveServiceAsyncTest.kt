// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.async

import com.usebila.api.client.okhttp.BilaOkHttpClientAsync
import com.usebila.api.models.resolve.ResolveBankAccountParams
import com.usebila.api.models.resolve.ResolveMobileMoneyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResolveServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun bankAccount() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val resolveServiceAsync = client.resolve()

        val responseFuture =
            resolveServiceAsync.bankAccount(
                ResolveBankAccountParams.builder()
                    .accountNumber("1234567890")
                    .bankId("bank-001")
                    .country(ResolveBankAccountParams.Country.ZM)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun mobileMoney() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val resolveServiceAsync = client.resolve()

        val responseFuture =
            resolveServiceAsync.mobileMoney(
                ResolveMobileMoneyParams.builder()
                    .country(ResolveMobileMoneyParams.Country.ZM)
                    .operator(ResolveMobileMoneyParams.Operator.AIRTEL)
                    .phone("0977433571")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
