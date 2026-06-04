// File generated from our OpenAPI spec by Stainless.

package com.bila.api.services

import com.bila.api.client.BilaClient
import com.bila.api.client.okhttp.BilaOkHttpClient
import com.bila.api.models.accounts.AccountListParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: BilaClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            BilaOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val accountService = client.accounts()
        stubFor(get(anyUrl()).willReturn(ok("{}")))

        accountService.list(
            AccountListParams.builder()
                .page(1.0)
                .perPage(50.0)
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            getRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
