// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transfers

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

class TransferRecipientDto
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountName: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val bankName: JsonField<String>,
    private val operator: JsonField<String>,
    private val phone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountName")
        @ExcludeMissing
        accountName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountNumber")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bankName") @ExcludeMissing bankName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
    ) : this(accountName, accountNumber, bankName, operator, phone, mutableMapOf())

    /**
     * Account holder / recipient name
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountName(): String = accountName.getRequired("accountName")

    /**
     * Bank account number (bank-account only)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun accountNumber(): Optional<String> = accountNumber.getOptional("accountNumber")

    /**
     * Bank name (bank-account only)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun bankName(): Optional<String> = bankName.getOptional("bankName")

    /**
     * Mobile money operator (mobile-money only)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun operator(): Optional<String> = operator.getOptional("operator")

    /**
     * Phone number (mobile-money only)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun phone(): Optional<String> = phone.getOptional("phone")

    /**
     * Returns the raw JSON value of [accountName].
     *
     * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountName") @ExcludeMissing fun _accountName(): JsonField<String> = accountName

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountNumber")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [bankName].
     *
     * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

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
         * Returns a mutable builder for constructing an instance of [TransferRecipientDto].
         *
         * The following fields are required:
         * ```java
         * .accountName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransferRecipientDto]. */
    class Builder internal constructor() {

        private var accountName: JsonField<String>? = null
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var bankName: JsonField<String> = JsonMissing.of()
        private var operator: JsonField<String> = JsonMissing.of()
        private var phone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transferRecipientDto: TransferRecipientDto) = apply {
            accountName = transferRecipientDto.accountName
            accountNumber = transferRecipientDto.accountNumber
            bankName = transferRecipientDto.bankName
            operator = transferRecipientDto.operator
            phone = transferRecipientDto.phone
            additionalProperties = transferRecipientDto.additionalProperties.toMutableMap()
        }

        /** Account holder / recipient name */
        fun accountName(accountName: String) = accountName(JsonField.of(accountName))

        /**
         * Sets [Builder.accountName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountName(accountName: JsonField<String>) = apply { this.accountName = accountName }

        /** Bank account number (bank-account only) */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** Bank name (bank-account only) */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /**
         * Sets [Builder.bankName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        /** Mobile money operator (mobile-money only) */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /** Phone number (mobile-money only) */
        fun phone(phone: String) = phone(JsonField.of(phone))

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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
         * Returns an immutable instance of [TransferRecipientDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransferRecipientDto =
            TransferRecipientDto(
                checkRequired("accountName", accountName),
                accountNumber,
                bankName,
                operator,
                phone,
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
    fun validate(): TransferRecipientDto = apply {
        if (validated) {
            return@apply
        }

        accountName()
        accountNumber()
        bankName()
        operator()
        phone()
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
            (if (accountNumber.asKnown().isPresent) 1 else 0) +
            (if (bankName.asKnown().isPresent) 1 else 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (if (phone.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferRecipientDto &&
            accountName == other.accountName &&
            accountNumber == other.accountNumber &&
            bankName == other.bankName &&
            operator == other.operator &&
            phone == other.phone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountName, accountNumber, bankName, operator, phone, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransferRecipientDto{accountName=$accountName, accountNumber=$accountNumber, bankName=$bankName, operator=$operator, phone=$phone, additionalProperties=$additionalProperties}"
}
