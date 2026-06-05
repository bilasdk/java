// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transfers

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferRecipientDtoTest {

    @Test
    fun create() {
        val transferRecipientDto =
            TransferRecipientDto.builder()
                .accountName("JOHN DOE")
                .accountNumber("1234567890")
                .bankName("Zambia National Commercial Bank")
                .operator("airtel")
                .phone("0977123456")
                .build()

        assertThat(transferRecipientDto.accountName()).isEqualTo("JOHN DOE")
        assertThat(transferRecipientDto.accountNumber()).contains("1234567890")
        assertThat(transferRecipientDto.bankName()).contains("Zambia National Commercial Bank")
        assertThat(transferRecipientDto.operator()).contains("airtel")
        assertThat(transferRecipientDto.phone()).contains("0977123456")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferRecipientDto =
            TransferRecipientDto.builder()
                .accountName("JOHN DOE")
                .accountNumber("1234567890")
                .bankName("Zambia National Commercial Bank")
                .operator("airtel")
                .phone("0977123456")
                .build()

        val roundtrippedTransferRecipientDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferRecipientDto),
                jacksonTypeRef<TransferRecipientDto>(),
            )

        assertThat(roundtrippedTransferRecipientDto).isEqualTo(transferRecipientDto)
    }
}
