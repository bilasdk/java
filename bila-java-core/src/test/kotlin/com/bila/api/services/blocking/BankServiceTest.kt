// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.blocking

import com.bila.api.client.okhttp.BilaOkHttpClient
import com.bila.api.models.banks.BankListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val bankService = client.banks()

        val banks = bankService.list(BankListParams.builder().country("zm").build())

        banks.validate()
    }
}
