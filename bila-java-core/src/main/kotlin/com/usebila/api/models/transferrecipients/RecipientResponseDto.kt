// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.transferrecipients

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.usebila.api.core.Enum
import com.usebila.api.core.ExcludeMissing
import com.usebila.api.core.JsonField
import com.usebila.api.core.JsonMissing
import com.usebila.api.core.JsonValue
import com.usebila.api.core.checkRequired
import com.usebila.api.errors.BilaInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RecipientResponseDto
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountName: JsonField<String>,
    private val country: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val accountNumber: JsonField<String>,
    private val bankId: JsonField<String>,
    private val bankName: JsonField<String>,
    private val operator: JsonField<String>,
    private val phone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountName")
        @ExcludeMissing
        accountName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("accountNumber")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bankId") @ExcludeMissing bankId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bankName") @ExcludeMissing bankName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountName,
        country,
        createdAt,
        type,
        accountNumber,
        bankId,
        bankName,
        operator,
        phone,
        mutableMapOf(),
    )

    /**
     * Recipient UUID
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Account holder name
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountName(): String = accountName.getRequired("accountName")

    /**
     * Country code
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * Creation timestamp
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Transfer recipient type
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Bank account number (bank-account only)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun accountNumber(): Optional<String> = accountNumber.getOptional("accountNumber")

    /**
     * Bank ID (bank-account only)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun bankId(): Optional<String> = bankId.getOptional("bankId")

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountName].
     *
     * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountName") @ExcludeMissing fun _accountName(): JsonField<String> = accountName

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountNumber")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [bankId].
     *
     * Unlike [bankId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bankId") @ExcludeMissing fun _bankId(): JsonField<String> = bankId

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
         * Returns a mutable builder for constructing an instance of [RecipientResponseDto].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountName()
         * .country()
         * .createdAt()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecipientResponseDto]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountName: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var bankId: JsonField<String> = JsonMissing.of()
        private var bankName: JsonField<String> = JsonMissing.of()
        private var operator: JsonField<String> = JsonMissing.of()
        private var phone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recipientResponseDto: RecipientResponseDto) = apply {
            id = recipientResponseDto.id
            accountName = recipientResponseDto.accountName
            country = recipientResponseDto.country
            createdAt = recipientResponseDto.createdAt
            type = recipientResponseDto.type
            accountNumber = recipientResponseDto.accountNumber
            bankId = recipientResponseDto.bankId
            bankName = recipientResponseDto.bankName
            operator = recipientResponseDto.operator
            phone = recipientResponseDto.phone
            additionalProperties = recipientResponseDto.additionalProperties.toMutableMap()
        }

        /** Recipient UUID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** Country code */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Creation timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Transfer recipient type */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        /** Bank ID (bank-account only) */
        fun bankId(bankId: String) = bankId(JsonField.of(bankId))

        /**
         * Sets [Builder.bankId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

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
         * Returns an immutable instance of [RecipientResponseDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountName()
         * .country()
         * .createdAt()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RecipientResponseDto =
            RecipientResponseDto(
                checkRequired("id", id),
                checkRequired("accountName", accountName),
                checkRequired("country", country),
                checkRequired("createdAt", createdAt),
                checkRequired("type", type),
                accountNumber,
                bankId,
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
    fun validate(): RecipientResponseDto = apply {
        if (validated) {
            return@apply
        }

        id()
        accountName()
        country()
        createdAt()
        type().validate()
        accountNumber()
        bankId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (accountName.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (accountNumber.asKnown().isPresent) 1 else 0) +
            (if (bankId.asKnown().isPresent) 1 else 0) +
            (if (bankName.asKnown().isPresent) 1 else 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (if (phone.asKnown().isPresent) 1 else 0)

    /** Transfer recipient type */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BANK_ACCOUNT = of("bank-account")

            @JvmField val MOBILE_MONEY = of("mobile-money")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BANK_ACCOUNT,
            MOBILE_MONEY,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BANK_ACCOUNT,
            MOBILE_MONEY,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BANK_ACCOUNT -> Value.BANK_ACCOUNT
                MOBILE_MONEY -> Value.MOBILE_MONEY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BilaInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                BANK_ACCOUNT -> Known.BANK_ACCOUNT
                MOBILE_MONEY -> Known.MOBILE_MONEY
                else -> throw BilaInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BilaInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { BilaInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws BilaInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecipientResponseDto &&
            id == other.id &&
            accountName == other.accountName &&
            country == other.country &&
            createdAt == other.createdAt &&
            type == other.type &&
            accountNumber == other.accountNumber &&
            bankId == other.bankId &&
            bankName == other.bankName &&
            operator == other.operator &&
            phone == other.phone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountName,
            country,
            createdAt,
            type,
            accountNumber,
            bankId,
            bankName,
            operator,
            phone,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecipientResponseDto{id=$id, accountName=$accountName, country=$country, createdAt=$createdAt, type=$type, accountNumber=$accountNumber, bankId=$bankId, bankName=$bankName, operator=$operator, phone=$phone, additionalProperties=$additionalProperties}"
}
