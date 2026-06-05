// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.collections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionInitiateMobileMoneyCollectionParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.amount()).isEqualTo(100.5)
        assertThat(body.country())
            .isEqualTo(CollectionInitiateMobileMoneyCollectionParams.Country.ZM)
        assertThat(body.operator())
            .isEqualTo(CollectionInitiateMobileMoneyCollectionParams.Operator.AIRTEL)
        assertThat(body.phone()).isEqualTo("0977433571")
        assertThat(body.reference()).isEqualTo("collection-001")
        assertThat(body.walletId()).isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f4")
        assertThat(body.bearer())
            .contains(CollectionInitiateMobileMoneyCollectionParams.Bearer.MERCHANT)
        assertThat(body.customerName()).contains("John Doe")
        assertThat(body.narration()).contains("Payment for subscription")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CollectionInitiateMobileMoneyCollectionParams.builder()
                .amount(100.5)
                .country(CollectionInitiateMobileMoneyCollectionParams.Country.ZM)
                .operator(CollectionInitiateMobileMoneyCollectionParams.Operator.AIRTEL)
                .phone("0977433571")
                .reference("collection-001")
                .walletId("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(100.5)
        assertThat(body.country())
            .isEqualTo(CollectionInitiateMobileMoneyCollectionParams.Country.ZM)
        assertThat(body.operator())
            .isEqualTo(CollectionInitiateMobileMoneyCollectionParams.Operator.AIRTEL)
        assertThat(body.phone()).isEqualTo("0977433571")
        assertThat(body.reference()).isEqualTo("collection-001")
        assertThat(body.walletId()).isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f4")
    }
}
