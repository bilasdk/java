// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.resolve

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResolveMobileMoneyParamsTest {

    @Test
    fun create() {
        ResolveMobileMoneyParams.builder()
            .country(ResolveMobileMoneyParams.Country.ZM)
            .operator(ResolveMobileMoneyParams.Operator.AIRTEL)
            .phone("0977433571")
            .build()
    }

    @Test
    fun body() {
        val params =
            ResolveMobileMoneyParams.builder()
                .country(ResolveMobileMoneyParams.Country.ZM)
                .operator(ResolveMobileMoneyParams.Operator.AIRTEL)
                .phone("0977433571")
                .build()

        val body = params._body()

        assertThat(body.country()).isEqualTo(ResolveMobileMoneyParams.Country.ZM)
        assertThat(body.operator()).isEqualTo(ResolveMobileMoneyParams.Operator.AIRTEL)
        assertThat(body.phone()).isEqualTo("0977433571")
    }
}
