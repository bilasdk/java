// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.async

import com.usebila.api.client.okhttp.BilaOkHttpClientAsync
import com.usebila.api.models.banks.BankListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BankServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bankServiceAsync = client.banks()

        val banksFuture = bankServiceAsync.list(BankListParams.builder().country("zm").build())

        val banks = banksFuture.get()
        banks.validate()
    }
}
