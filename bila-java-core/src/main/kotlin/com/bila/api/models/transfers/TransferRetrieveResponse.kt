// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transfers

import com.bila.api.core.Enum
import com.bila.api.core.ExcludeMissing
import com.bila.api.core.JsonField
import com.bila.api.core.JsonMissing
import com.bila.api.core.JsonValue
import com.bila.api.core.checkRequired
import com.bila.api.errors.BilaInvalidDataException
import com.bila.api.models.accounts.BilaResponse
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TransferRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val message: JsonField<String>,
    private val status: JsonField<Boolean>,
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
    ) : this(message, status, data, mutableMapOf())

    fun toBilaResponse(): BilaResponse =
        BilaResponse.builder().message(message).status(status).build()

    /**
     * Response message
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * Request success status
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Boolean = status.getRequired("status")

    /**
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Boolean> = status

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [TransferRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .message()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransferRetrieveResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String>? = null
        private var status: JsonField<Boolean>? = null
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transferRetrieveResponse: TransferRetrieveResponse) = apply {
            message = transferRetrieveResponse.message
            status = transferRetrieveResponse.status
            data = transferRetrieveResponse.data
            additionalProperties = transferRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Response message */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Request success status */
        fun status(status: Boolean) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Boolean>) = apply { this.status = status }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [TransferRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .message()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransferRetrieveResponse =
            TransferRetrieveResponse(
                checkRequired("message", message),
                checkRequired("status", status),
                data,
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
    fun validate(): TransferRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        message()
        status()
        data().ifPresent { it.validate() }
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
        (if (message.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<String>,
        private val recipient: JsonField<Recipient>,
        private val reference: JsonField<String>,
        private val status: JsonField<Status>,
        private val type: JsonField<Type>,
        private val completedAt: JsonField<OffsetDateTime>,
        private val narration: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient")
            @ExcludeMissing
            recipient: JsonField<Recipient> = JsonMissing.of(),
            @JsonProperty("reference")
            @ExcludeMissing
            reference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("completedAt")
            @ExcludeMissing
            completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("narration")
            @ExcludeMissing
            narration: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            currency,
            recipient,
            reference,
            status,
            type,
            completedAt,
            narration,
            mutableMapOf(),
        )

        /**
         * Transfer ID
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Transfer amount
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * Creation timestamp (from Payment)
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

        /**
         * Currency code
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Recipient details
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipient(): Recipient = recipient.getRequired("recipient")

        /**
         * Client reference
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reference(): String = reference.getRequired("reference")

        /**
         * Transfer status
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Transfer type
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Completion timestamp (from Payment.processedAt)
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completedAt")

        /**
         * Transfer narration
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun narration(): Optional<String> = narration.getOptional("narration")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [recipient].
         *
         * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recipient")
        @ExcludeMissing
        fun _recipient(): JsonField<Recipient> = recipient

        /**
         * Returns the raw JSON value of [reference].
         *
         * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reference") @ExcludeMissing fun _reference(): JsonField<String> = reference

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [completedAt].
         *
         * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completedAt")
        @ExcludeMissing
        fun _completedAt(): JsonField<OffsetDateTime> = completedAt

        /**
         * Returns the raw JSON value of [narration].
         *
         * Unlike [narration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("narration") @ExcludeMissing fun _narration(): JsonField<String> = narration

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .createdAt()
             * .currency()
             * .recipient()
             * .reference()
             * .status()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<String>? = null
            private var recipient: JsonField<Recipient>? = null
            private var reference: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var type: JsonField<Type>? = null
            private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var narration: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                amount = data.amount
                createdAt = data.createdAt
                currency = data.currency
                recipient = data.recipient
                reference = data.reference
                status = data.status
                type = data.type
                completedAt = data.completedAt
                narration = data.narration
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Transfer ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Transfer amount */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** Creation timestamp (from Payment) */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Currency code */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Recipient details */
            fun recipient(recipient: Recipient) = recipient(JsonField.of(recipient))

            /**
             * Sets [Builder.recipient] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipient] with a well-typed [Recipient] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipient(recipient: JsonField<Recipient>) = apply { this.recipient = recipient }

            /** Client reference */
            fun reference(reference: String) = reference(JsonField.of(reference))

            /**
             * Sets [Builder.reference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reference] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reference(reference: JsonField<String>) = apply { this.reference = reference }

            /** Transfer status */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Transfer type */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Completion timestamp (from Payment.processedAt) */
            fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                this.completedAt = completedAt
            }

            /** Transfer narration */
            fun narration(narration: String) = narration(JsonField.of(narration))

            /**
             * Sets [Builder.narration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.narration] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun narration(narration: JsonField<String>) = apply { this.narration = narration }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .createdAt()
             * .currency()
             * .recipient()
             * .reference()
             * .status()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("currency", currency),
                    checkRequired("recipient", recipient),
                    checkRequired("reference", reference),
                    checkRequired("status", status),
                    checkRequired("type", type),
                    completedAt,
                    narration,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            currency()
            recipient().validate()
            reference()
            status().validate()
            type().validate()
            completedAt()
            narration()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (recipient.asKnown().getOrNull()?.validity() ?: 0) +
                (if (reference.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (completedAt.asKnown().isPresent) 1 else 0) +
                (if (narration.asKnown().isPresent) 1 else 0)

        /** Recipient details */
        class Recipient
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
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            ) : this(accountName, accountNumber, bankName, operator, phone, mutableMapOf())

            /**
             * Account holder / recipient name
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountName(): String = accountName.getRequired("accountName")

            /**
             * Bank account number (bank-account only)
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun accountNumber(): Optional<String> = accountNumber.getOptional("accountNumber")

            /**
             * Bank name (bank-account only)
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bankName(): Optional<String> = bankName.getOptional("bankName")

            /**
             * Mobile money operator (mobile-money only)
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun operator(): Optional<String> = operator.getOptional("operator")

            /**
             * Phone number (mobile-money only)
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phone(): Optional<String> = phone.getOptional("phone")

            /**
             * Returns the raw JSON value of [accountName].
             *
             * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountName")
            @ExcludeMissing
            fun _accountName(): JsonField<String> = accountName

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountNumber")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [Recipient].
                 *
                 * The following fields are required:
                 * ```java
                 * .accountName()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Recipient]. */
            class Builder internal constructor() {

                private var accountName: JsonField<String>? = null
                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var bankName: JsonField<String> = JsonMissing.of()
                private var operator: JsonField<String> = JsonMissing.of()
                private var phone: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(recipient: Recipient) = apply {
                    accountName = recipient.accountName
                    accountNumber = recipient.accountNumber
                    bankName = recipient.bankName
                    operator = recipient.operator
                    phone = recipient.phone
                    additionalProperties = recipient.additionalProperties.toMutableMap()
                }

                /** Account holder / recipient name */
                fun accountName(accountName: String) = accountName(JsonField.of(accountName))

                /**
                 * Sets [Builder.accountName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountName(accountName: JsonField<String>) = apply {
                    this.accountName = accountName
                }

                /** Bank account number (bank-account only) */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /** Bank name (bank-account only) */
                fun bankName(bankName: String) = bankName(JsonField.of(bankName))

                /**
                 * Sets [Builder.bankName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

                /** Mobile money operator (mobile-money only) */
                fun operator(operator: String) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<String>) = apply { this.operator = operator }

                /** Phone number (mobile-money only) */
                fun phone(phone: String) = phone(JsonField.of(phone))

                /**
                 * Sets [Builder.phone] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phone] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun phone(phone: JsonField<String>) = apply { this.phone = phone }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Recipient].
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
                fun build(): Recipient =
                    Recipient(
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
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws BilaInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Recipient = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
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

                return other is Recipient &&
                    accountName == other.accountName &&
                    accountNumber == other.accountNumber &&
                    bankName == other.bankName &&
                    operator == other.operator &&
                    phone == other.phone &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountName,
                    accountNumber,
                    bankName,
                    operator,
                    phone,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Recipient{accountName=$accountName, accountNumber=$accountNumber, bankName=$bankName, operator=$operator, phone=$phone, additionalProperties=$additionalProperties}"
        }

        /** Transfer status */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PENDING = of("pending")

                @JvmField val SUCCESSFUL = of("successful")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                SUCCESSFUL,
                FAILED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                SUCCESSFUL,
                FAILED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    SUCCESSFUL -> Value.SUCCESSFUL
                    FAILED -> Value.FAILED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BilaInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    SUCCESSFUL -> Known.SUCCESSFUL
                    FAILED -> Known.FAILED
                    else -> throw BilaInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BilaInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BilaInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws BilaInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Transfer type */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BANK_ACCOUNT,
                MOBILE_MONEY,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BilaInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BilaInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BilaInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
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

            return other is Data &&
                id == other.id &&
                amount == other.amount &&
                createdAt == other.createdAt &&
                currency == other.currency &&
                recipient == other.recipient &&
                reference == other.reference &&
                status == other.status &&
                type == other.type &&
                completedAt == other.completedAt &&
                narration == other.narration &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amount,
                createdAt,
                currency,
                recipient,
                reference,
                status,
                type,
                completedAt,
                narration,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, amount=$amount, createdAt=$createdAt, currency=$currency, recipient=$recipient, reference=$reference, status=$status, type=$type, completedAt=$completedAt, narration=$narration, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferRetrieveResponse &&
            message == other.message &&
            status == other.status &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(message, status, data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransferRetrieveResponse{message=$message, status=$status, data=$data, additionalProperties=$additionalProperties}"
}
