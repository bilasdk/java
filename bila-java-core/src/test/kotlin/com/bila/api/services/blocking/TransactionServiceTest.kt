// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services.blocking

import com.bila.api.client.okhttp.BilaOkHttpClient
import com.bila.api.models.transactions.TransactionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        val transaction = transactionService.retrieve("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        transaction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val transactionService = client.transactions()

        val transactions =
            transactionService.list(
                TransactionListParams.builder()
                    .accountId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .endDate("2024-12-31T23:59:59Z")
                    .page(1.0)
                    .perPage(50.0)
                    .startDate("2024-01-01T00:00:00Z")
                    .type(TransactionListParams.Type.CREDIT)
                    .build()
            )

        transactions.validate()
    }
}
