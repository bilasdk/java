// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models

import com.bila.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginationMetaDtoTest {

    @Test
    fun create() {
        val paginationMetaDto =
            PaginationMetaDto.builder()
                .currentPage(1.0)
                .pageCount(3.0)
                .perPage(50.0)
                .total(150.0)
                .build()

        assertThat(paginationMetaDto.currentPage()).isEqualTo(1.0)
        assertThat(paginationMetaDto.pageCount()).isEqualTo(3.0)
        assertThat(paginationMetaDto.perPage()).isEqualTo(50.0)
        assertThat(paginationMetaDto.total()).isEqualTo(150.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginationMetaDto =
            PaginationMetaDto.builder()
                .currentPage(1.0)
                .pageCount(3.0)
                .perPage(50.0)
                .total(150.0)
                .build()

        val roundtrippedPaginationMetaDto =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginationMetaDto),
                jacksonTypeRef<PaginationMetaDto>(),
            )

        assertThat(roundtrippedPaginationMetaDto).isEqualTo(paginationMetaDto)
    }
}
