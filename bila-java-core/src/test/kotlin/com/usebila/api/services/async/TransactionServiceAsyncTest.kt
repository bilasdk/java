// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.async

import com.usebila.api.client.okhttp.BilaOkHttpClientAsync
import com.usebila.api.models.transactions.TransactionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val transactionFuture =
            transactionServiceAsync.retrieve("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        val transaction = transactionFuture.get()
        transaction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val transactionsFuture =
            transactionServiceAsync.list(
                TransactionListParams.builder()
                    .accountId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .endDate("2024-12-31T23:59:59Z")
                    .page(1.0)
                    .perPage(50.0)
                    .startDate("2024-01-01T00:00:00Z")
                    .type(TransactionListParams.Type.CREDIT)
                    .build()
            )

        val transactions = transactionsFuture.get()
        transactions.validate()
    }
}
