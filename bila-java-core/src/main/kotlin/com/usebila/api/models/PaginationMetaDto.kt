// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.usebila.api.core.ExcludeMissing
import com.usebila.api.core.JsonField
import com.usebila.api.core.JsonMissing
import com.usebila.api.core.JsonValue
import com.usebila.api.core.checkRequired
import com.usebila.api.errors.BilaInvalidDataException
import java.util.Collections
import java.util.Objects

class PaginationMetaDto
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currentPage: JsonField<Double>,
    private val pageCount: JsonField<Double>,
    private val perPage: JsonField<Double>,
    private val total: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currentPage")
        @ExcludeMissing
        currentPage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pageCount") @ExcludeMissing pageCount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("perPage") @ExcludeMissing perPage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
    ) : this(currentPage, pageCount, perPage, total, mutableMapOf())

    /**
     * Current page number
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currentPage(): Double = currentPage.getRequired("currentPage")

    /**
     * Total number of pages
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pageCount(): Double = pageCount.getRequired("pageCount")

    /**
     * Items per page
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun perPage(): Double = perPage.getRequired("perPage")

    /**
     * Total number of records
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): Double = total.getRequired("total")

    /**
     * Returns the raw JSON value of [currentPage].
     *
     * Unlike [currentPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currentPage") @ExcludeMissing fun _currentPage(): JsonField<Double> = currentPage

    /**
     * Returns the raw JSON value of [pageCount].
     *
     * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pageCount") @ExcludeMissing fun _pageCount(): JsonField<Double> = pageCount

    /**
     * Returns the raw JSON value of [perPage].
     *
     * Unlike [perPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("perPage") @ExcludeMissing fun _perPage(): JsonField<Double> = perPage

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaginationMetaDto].
         *
         * The following fields are required:
         * ```java
         * .currentPage()
         * .pageCount()
         * .perPage()
         * .total()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaginationMetaDto]. */
    class Builder internal constructor() {

        private var currentPage: JsonField<Double>? = null
        private var pageCount: JsonField<Double>? = null
        private var perPage: JsonField<Double>? = null
        private var total: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paginationMetaDto: PaginationMetaDto) = apply {
            currentPage = paginationMetaDto.currentPage
            pageCount = paginationMetaDto.pageCount
            perPage = paginationMetaDto.perPage
            total = paginationMetaDto.total
            additionalProperties = paginationMetaDto.additionalProperties.toMutableMap()
        }

        /** Current page number */
        fun currentPage(currentPage: Double) = currentPage(JsonField.of(currentPage))

        /**
         * Sets [Builder.currentPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentPage] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentPage(currentPage: JsonField<Double>) = apply { this.currentPage = currentPage }

        /** Total number of pages */
        fun pageCount(pageCount: Double) = pageCount(JsonField.of(pageCount))

        /**
         * Sets [Builder.pageCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageCount] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pageCount(pageCount: JsonField<Double>) = apply { this.pageCount = pageCount }

        /** Items per page */
        fun perPage(perPage: Double) = perPage(JsonField.of(perPage))

        /**
         * Sets [Builder.perPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perPage] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun perPage(perPage: JsonField<Double>) = apply { this.perPage = perPage }

        /** Total number of records */
        fun total(total: Double) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Double>) = apply { this.total = total }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [PaginationMetaDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .currentPage()
         * .pageCount()
         * .perPage()
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaginationMetaDto =
            PaginationMetaDto(
                checkRequired("currentPage", currentPage),
                checkRequired("pageCount", pageCount),
                checkRequired("perPage", perPage),
                checkRequired("total", total),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws BilaInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): PaginationMetaDto = apply {
        if (validated) {
            return@apply
        }

        currentPage()
        pageCount()
        perPage()
        total()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: BilaInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (currentPage.asKnown().isPresent) 1 else 0) +
            (if (pageCount.asKnown().isPresent) 1 else 0) +
            (if (perPage.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaginationMetaDto &&
            currentPage == other.currentPage &&
            pageCount == other.pageCount &&
            perPage == other.perPage &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(currentPage, pageCount, perPage, total, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaginationMetaDto{currentPage=$currentPage, pageCount=$pageCount, perPage=$perPage, total=$total, additionalProperties=$additionalProperties}"
}
