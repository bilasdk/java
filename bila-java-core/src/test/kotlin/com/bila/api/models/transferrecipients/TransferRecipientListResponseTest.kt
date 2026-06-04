// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transferrecipients

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferRecipientListResponseTest {

    @Test
    fun create() {
        val transferRecipientListResponse =
            TransferRecipientListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransferRecipientListResponse.Data.builder()
                        .addData(
                            TransferRecipientListResponse.Data.InnerData.builder()
                                .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                                .accountName("John Doe")
                                .country("zm")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .type(
                                    TransferRecipientListResponse.Data.InnerData.Type.BANK_ACCOUNT
                                )
                                .accountNumber("1234567890")
                                .bankId("bank-001")
                                .bankName("Zambia National Commercial Bank")
                                .operator("airtel")
                                .phone("0977123456")
                                .build()
                        )
                        .meta(
                            TransferRecipientListResponse.Data.Meta.builder()
                                .currentPage(1.0)
                                .pageCount(3.0)
                                .perPage(50.0)
                                .total(150.0)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(transferRecipientListResponse.message())
            .isEqualTo("Operation completed successfully")
        assertThat(transferRecipientListResponse.status()).isEqualTo(true)
        assertThat(transferRecipientListResponse.data())
            .contains(
                TransferRecipientListResponse.Data.builder()
                    .addData(
                        TransferRecipientListResponse.Data.InnerData.builder()
                            .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                            .accountName("John Doe")
                            .country("zm")
                            .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                            .type(TransferRecipientListResponse.Data.InnerData.Type.BANK_ACCOUNT)
                            .accountNumber("1234567890")
                            .bankId("bank-001")
                            .bankName("Zambia National Commercial Bank")
                            .operator("airtel")
                            .phone("0977123456")
                            .build()
                    )
                    .meta(
                        TransferRecipientListResponse.Data.Meta.builder()
                            .currentPage(1.0)
                            .pageCount(3.0)
                            .perPage(50.0)
                            .total(150.0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferRecipientListResponse =
            TransferRecipientListResponse.builder()
                .message("Operation completed successfully")
                .status(true)
                .data(
                    TransferRecipientListResponse.Data.builder()
                        .addData(
                            TransferRecipientListResponse.Data.InnerData.builder()
                                .id("68f11209-451f-4a15-bfcd-d916eb8b09f4")
                                .accountName("John Doe")
                                .country("zm")
                                .createdAt(OffsetDateTime.parse("2024-01-15T10:30:00Z"))
                                .type(
                                    TransferRecipientListResponse.Data.InnerData.Type.BANK_ACCOUNT
                                )
                                .accountNumber("1234567890")
                                .bankId("bank-001")
                                .bankName("Zambia National Commercial Bank")
                                .operator("airtel")
                                .phone("0977123456")
                                .build()
                        )
                        .meta(
                            TransferRecipientListResponse.Data.Meta.builder()
                                .currentPage(1.0)
                                .pageCount(3.0)
                                .perPage(50.0)
                                .total(150.0)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedTransferRecipientListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferRecipientListResponse),
                jacksonTypeRef<TransferRecipientListResponse>(),
            )

        assertThat(roundtrippedTransferRecipientListResponse)
            .isEqualTo(transferRecipientListResponse)
    }
}
