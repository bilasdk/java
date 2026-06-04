// File generated from our OpenAPI spec by Stainless.

package com.bila.api.proguard

import com.bila.api.client.okhttp.BilaOkHttpClient
import com.bila.api.core.jsonMapper
import com.bila.api.models.accounts.BilaResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/bila-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = BilaOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.accounts()).isNotNull()
        assertThat(client.transferRecipients()).isNotNull()
        assertThat(client.transfers()).isNotNull()
        assertThat(client.collections()).isNotNull()
        assertThat(client.transactions()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
        assertThat(client.banks()).isNotNull()
        assertThat(client.resolve()).isNotNull()
    }

    @Test
    fun bilaResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val bilaResponse =
            BilaResponse.builder().message("Operation completed successfully").status(true).build()

        val roundtrippedBilaResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bilaResponse),
                jacksonTypeRef<BilaResponse>(),
            )

        assertThat(roundtrippedBilaResponse).isEqualTo(bilaResponse)
    }
}
