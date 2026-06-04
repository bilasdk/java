// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transferrecipients

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferRecipientRetrieveParamsTest {

    @Test
    fun create() {
        TransferRecipientRetrieveParams.builder().id("68f11209-451f-4a15-bfcd-d916eb8b09f4").build()
    }

    @Test
    fun pathParams() {
        val params =
            TransferRecipientRetrieveParams.builder()
                .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("68f11209-451f-4a15-bfcd-d916eb8b09f4")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
