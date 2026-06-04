// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.async

import com.bila.api.client.okhttp.BilaOkHttpClientAsync
import com.bila.api.models.accounts.AccountListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture = accountServiceAsync.retrieve("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountsFuture =
            accountServiceAsync.list(AccountListParams.builder().page(1.0).perPage(50.0).build())

        val accounts = accountsFuture.get()
        accounts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getBalance() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val responseFuture = accountServiceAsync.getBalance("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        val response = responseFuture.get()
        response.validate()
    }
}
