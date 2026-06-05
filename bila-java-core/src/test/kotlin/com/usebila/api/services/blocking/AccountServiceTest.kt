// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.usebila.api.client.okhttp.BilaOkHttpClient
import com.usebila.api.models.accounts.AccountListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.accounts()

        val account = accountService.retrieve("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.accounts()

        val accounts =
            accountService.list(AccountListParams.builder().page(1.0).perPage(50.0).build())

        accounts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getBalance() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.accounts()

        val response = accountService.getBalance("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        response.validate()
    }
}
