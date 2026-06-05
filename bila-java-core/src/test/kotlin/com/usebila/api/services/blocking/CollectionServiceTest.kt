// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.services.blocking

import com.usebila.api.client.okhttp.BilaOkHttpClient
import com.usebila.api.models.collections.CollectionInitiateMobileMoneyCollectionParams
import com.usebila.api.models.collections.CollectionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CollectionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.collections()

        val collection = collectionService.retrieve("68f11209-451f-4a15-bfcd-d916eb8b09f4")

        collection.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.collections()

        val collections =
            collectionService.list(
                CollectionListParams.builder()
                    .accountId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .endDate("2024-12-31T23:59:59Z")
                    .page(1.0)
                    .perPage(50.0)
                    .startDate("2024-01-01T00:00:00Z")
                    .status(CollectionListParams.Status.PENDING)
                    .build()
            )

        collections.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatusByReference() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.collections()

        val response = collectionService.getStatusByReference("collection-001")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun initiateMobileMoneyCollection() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.collections()

        val response =
            collectionService.initiateMobileMoneyCollection(
                CollectionInitiateMobileMoneyCollectionParams.builder()
                    .amount(100.5)
                    .country(CollectionInitiateMobileMoneyCollectionParams.Country.ZM)
                    .operator(CollectionInitiateMobileMoneyCollectionParams.Operator.AIRTEL)
                    .phone("0977433571")
                    .reference("collection-001")
                    .walletId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                    .bearer(CollectionInitiateMobileMoneyCollectionParams.Bearer.MERCHANT)
                    .customerName("John Doe")
                    .narration("Payment for subscription")
                    .build()
            )

        response.validate()
    }
}
