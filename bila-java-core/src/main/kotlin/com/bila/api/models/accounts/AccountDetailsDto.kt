// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.accounts

import com.bila.api.core.ExcludeMissing
import com.bila.api.core.JsonField
import com.bila.api.core.JsonMissing
import com.bila.api.core.JsonValue
import com.bila.api.core.checkRequired
import com.bila.api.errors.BilaInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

class AccountDetailsDto
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountName: JsonField<String>,
    private val type: JsonField<String>,
    private val tillNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountName")
        @ExcludeMissing
        accountName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tillNumber") @ExcludeMissing tillNumber: JsonField<String> = JsonMissing.of(),
    ) : this(accountName, type, tillNumber, mutableMapOf())

    /**
     * Account holder name
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountName(): String = accountName.getRequired("accountName")

    /**
     * Account detail type
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Till number (for mobile money)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun tillNumber(): Optional<String> = tillNumber.getOptional("tillNumber")

    /**
     * Returns the raw JSON value of [accountName].
     *
     * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountName") @ExcludeMissing fun _accountName(): JsonField<String> = accountName

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [tillNumber].
     *
     * Unlike [tillNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tillNumber") @ExcludeMissing fun _tillNumber(): JsonField<String> = tillNumber

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
         * Returns a mutable builder for constructing an instance of [AccountDetailsDto].
         *
         * The following fields are required:
         * ```java
         * .accountName()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountDetailsDto]. */
    class Builder internal constructor() {

        private var accountName: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var tillNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountDetailsDto: AccountDetailsDto) = apply {
            accountName = accountDetailsDto.accountName
            type = accountDetailsDto.type
            tillNumber = accountDetailsDto.tillNumber
            additionalProperties = accountDetailsDto.additionalProperties.toMutableMap()
        }

        /** Account holder name */
        fun accountName(accountName: String) = accountName(JsonField.of(accountName))

        /**
         * Sets [Builder.accountName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountName(accountName: JsonField<String>) = apply { this.accountName = accountName }

        /** Account detail type */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Till number (for mobile money) */
        fun tillNumber(tillNumber: String) = tillNumber(JsonField.of(tillNumber))

        /**
         * Sets [Builder.tillNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tillNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tillNumber(tillNumber: JsonField<String>) = apply { this.tillNumber = tillNumber }

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
         * Returns an immutable instance of [AccountDetailsDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountName()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountDetailsDto =
            AccountDetailsDto(
                checkRequired("accountName", accountName),
                checkRequired("type", type),
                tillNumber,
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
    fun validate(): AccountDetailsDto = apply {
        if (validated) {
            return@apply
        }

        accountName()
        type()
        tillNumber()
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
        (if (accountName.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (tillNumber.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountDetailsDto &&
            accountName == other.accountName &&
            type == other.type &&
            tillNumber == other.tillNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountName, type, tillNumber, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountDetailsDto{accountName=$accountName, type=$type, tillNumber=$tillNumber, additionalProperties=$additionalProperties}"
}
