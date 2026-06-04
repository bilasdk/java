// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.transfers

import com.bila.api.core.Enum
import com.bila.api.core.ExcludeMissing
import com.bila.api.core.JsonField
import com.bila.api.core.JsonMissing
import com.bila.api.core.JsonValue
import com.bila.api.core.Params
import com.bila.api.core.checkRequired
import com.bila.api.core.http.Headers
import com.bila.api.core.http.QueryParams
import com.bila.api.errors.BilaInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Initiate a transfer to a mobile money account. Creates a transaction record in your dashboard.
 */
class TransferInitiateMobileMoneyTransferParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Transfer amount
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = body.amount()

    /**
     * Country code
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): Country = body.country()

    /**
     * Mobile money operator
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = body.operator()

    /**
     * Recipient phone number
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phone(): String = body.phone()

    /**
     * Unique client reference
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reference(): String = body.reference()

    /**
     * Transfer narration
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun narration(): Optional<String> = body.narration()

    /**
     * Recipient name for the transaction record
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun recipientName(): Optional<String> = body.recipientName()

    /**
     * Source wallet ID to debit (defaults to main wallet if omitted)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun walletId(): Optional<String> = body.walletId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Double> = body._amount()

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _country(): JsonField<Country> = body._country()

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _operator(): JsonField<Operator> = body._operator()

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phone(): JsonField<String> = body._phone()

    /**
     * Returns the raw JSON value of [reference].
     *
     * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reference(): JsonField<String> = body._reference()

    /**
     * Returns the raw JSON value of [narration].
     *
     * Unlike [narration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _narration(): JsonField<String> = body._narration()

    /**
     * Returns the raw JSON value of [recipientName].
     *
     * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recipientName(): JsonField<String> = body._recipientName()

    /**
     * Returns the raw JSON value of [walletId].
     *
     * Unlike [walletId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _walletId(): JsonField<String> = body._walletId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransferInitiateMobileMoneyTransferParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .country()
         * .operator()
         * .phone()
         * .reference()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransferInitiateMobileMoneyTransferParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            transferInitiateMobileMoneyTransferParams: TransferInitiateMobileMoneyTransferParams
        ) = apply {
            body = transferInitiateMobileMoneyTransferParams.body.toBuilder()
            additionalHeaders =
                transferInitiateMobileMoneyTransferParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                transferInitiateMobileMoneyTransferParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [country]
         * - [operator]
         * - [phone]
         * - [reference]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Transfer amount */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** Country code */
        fun country(country: Country) = apply { body.country(country) }

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [Country] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<Country>) = apply { body.country(country) }

        /** Mobile money operator */
        fun operator(operator: Operator) = apply { body.operator(operator) }

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { body.operator(operator) }

        /** Recipient phone number */
        fun phone(phone: String) = apply { body.phone(phone) }

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { body.phone(phone) }

        /** Unique client reference */
        fun reference(reference: String) = apply { body.reference(reference) }

        /**
         * Sets [Builder.reference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reference] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reference(reference: JsonField<String>) = apply { body.reference(reference) }

        /** Transfer narration */
        fun narration(narration: String) = apply { body.narration(narration) }

        /**
         * Sets [Builder.narration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.narration] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun narration(narration: JsonField<String>) = apply { body.narration(narration) }

        /** Recipient name for the transaction record */
        fun recipientName(recipientName: String) = apply { body.recipientName(recipientName) }

        /**
         * Sets [Builder.recipientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipientName(recipientName: JsonField<String>) = apply {
            body.recipientName(recipientName)
        }

        /** Source wallet ID to debit (defaults to main wallet if omitted) */
        fun walletId(walletId: String) = apply { body.walletId(walletId) }

        /**
         * Sets [Builder.walletId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.walletId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun walletId(walletId: JsonField<String>) = apply { body.walletId(walletId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [TransferInitiateMobileMoneyTransferParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .country()
         * .operator()
         * .phone()
         * .reference()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransferInitiateMobileMoneyTransferParams =
            TransferInitiateMobileMoneyTransferParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val country: JsonField<Country>,
        private val operator: JsonField<Operator>,
        private val phone: JsonField<String>,
        private val reference: JsonField<String>,
        private val narration: JsonField<String>,
        private val recipientName: JsonField<String>,
        private val walletId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<Country> = JsonMissing.of(),
            @JsonProperty("operator")
            @ExcludeMissing
            operator: JsonField<Operator> = JsonMissing.of(),
            @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reference")
            @ExcludeMissing
            reference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("narration")
            @ExcludeMissing
            narration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipientName")
            @ExcludeMissing
            recipientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("walletId") @ExcludeMissing walletId: JsonField<String> = JsonMissing.of(),
        ) : this(
            amount,
            country,
            operator,
            phone,
            reference,
            narration,
            recipientName,
            walletId,
            mutableMapOf(),
        )

        /**
         * Transfer amount
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * Country code
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): Country = country.getRequired("country")

        /**
         * Mobile money operator
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operator(): Operator = operator.getRequired("operator")

        /**
         * Recipient phone number
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phone(): String = phone.getRequired("phone")

        /**
         * Unique client reference
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reference(): String = reference.getRequired("reference")

        /**
         * Transfer narration
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun narration(): Optional<String> = narration.getOptional("narration")

        /**
         * Recipient name for the transaction record
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recipientName(): Optional<String> = recipientName.getOptional("recipientName")

        /**
         * Source wallet ID to debit (defaults to main wallet if omitted)
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun walletId(): Optional<String> = walletId.getOptional("walletId")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<Country> = country

        /**
         * Returns the raw JSON value of [operator].
         *
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

        /**
         * Returns the raw JSON value of [phone].
         *
         * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        /**
         * Returns the raw JSON value of [reference].
         *
         * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reference") @ExcludeMissing fun _reference(): JsonField<String> = reference

        /**
         * Returns the raw JSON value of [narration].
         *
         * Unlike [narration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("narration") @ExcludeMissing fun _narration(): JsonField<String> = narration

        /**
         * Returns the raw JSON value of [recipientName].
         *
         * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recipientName")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

        /**
         * Returns the raw JSON value of [walletId].
         *
         * Unlike [walletId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("walletId") @ExcludeMissing fun _walletId(): JsonField<String> = walletId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .country()
             * .operator()
             * .phone()
             * .reference()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var country: JsonField<Country>? = null
            private var operator: JsonField<Operator>? = null
            private var phone: JsonField<String>? = null
            private var reference: JsonField<String>? = null
            private var narration: JsonField<String> = JsonMissing.of()
            private var recipientName: JsonField<String> = JsonMissing.of()
            private var walletId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                country = body.country
                operator = body.operator
                phone = body.phone
                reference = body.reference
                narration = body.narration
                recipientName = body.recipientName
                walletId = body.walletId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            /** Country code */
            fun country(country: Country) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [Country] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<Country>) = apply { this.country = country }

            /** Mobile money operator */
            fun operator(operator: Operator) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [Operator] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

            /** Recipient phone number */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * Sets [Builder.phone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** Unique client reference */
            fun reference(reference: String) = reference(JsonField.of(reference))

            /**
             * Sets [Builder.reference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reference] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reference(reference: JsonField<String>) = apply { this.reference = reference }

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

            /** Recipient name for the transaction record */
            fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

            /**
             * Sets [Builder.recipientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /** Source wallet ID to debit (defaults to main wallet if omitted) */
            fun walletId(walletId: String) = walletId(JsonField.of(walletId))

            /**
             * Sets [Builder.walletId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.walletId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun walletId(walletId: JsonField<String>) = apply { this.walletId = walletId }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .country()
             * .operator()
             * .phone()
             * .reference()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    checkRequired("country", country),
                    checkRequired("operator", operator),
                    checkRequired("phone", phone),
                    checkRequired("reference", reference),
                    narration,
                    recipientName,
                    walletId,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            country().validate()
            operator().validate()
            phone()
            reference()
            narration()
            recipientName()
            walletId()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (country.asKnown().getOrNull()?.validity() ?: 0) +
                (operator.asKnown().getOrNull()?.validity() ?: 0) +
                (if (phone.asKnown().isPresent) 1 else 0) +
                (if (reference.asKnown().isPresent) 1 else 0) +
                (if (narration.asKnown().isPresent) 1 else 0) +
                (if (recipientName.asKnown().isPresent) 1 else 0) +
                (if (walletId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amount == other.amount &&
                country == other.country &&
                operator == other.operator &&
                phone == other.phone &&
                reference == other.reference &&
                narration == other.narration &&
                recipientName == other.recipientName &&
                walletId == other.walletId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                country,
                operator,
                phone,
                reference,
                narration,
                recipientName,
                walletId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, country=$country, operator=$operator, phone=$phone, reference=$reference, narration=$narration, recipientName=$recipientName, walletId=$walletId, additionalProperties=$additionalProperties}"
    }

    /** Country code */
    class Country @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ZM = of("zm")

            @JvmField val NG = of("ng")

            @JvmStatic fun of(value: String) = Country(JsonField.of(value))
        }

        /** An enum containing [Country]'s known values. */
        enum class Known {
            ZM,
            NG,
        }

        /**
         * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Country] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ZM,
            NG,
            /** An enum member indicating that [Country] was instantiated with an unknown value. */
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
                ZM -> Value.ZM
                NG -> Value.NG
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
                ZM -> Known.ZM
                NG -> Known.NG
                else -> throw BilaInvalidDataException("Unknown Country: $value")
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
        fun validate(): Country = apply {
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

            return other is Country && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Mobile money operator */
    class Operator @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AIRTEL = of("airtel")

            @JvmField val MTN = of("mtn")

            @JvmField val ZAMTEL = of("zamtel")

            @JvmField val VODACOM = of("vodacom")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            AIRTEL,
            MTN,
            ZAMTEL,
            VODACOM,
        }

        /**
         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AIRTEL,
            MTN,
            ZAMTEL,
            VODACOM,
            /** An enum member indicating that [Operator] was instantiated with an unknown value. */
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
                AIRTEL -> Value.AIRTEL
                MTN -> Value.MTN
                ZAMTEL -> Value.ZAMTEL
                VODACOM -> Value.VODACOM
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
                AIRTEL -> Known.AIRTEL
                MTN -> Known.MTN
                ZAMTEL -> Known.ZAMTEL
                VODACOM -> Known.VODACOM
                else -> throw BilaInvalidDataException("Unknown Operator: $value")
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
        fun validate(): Operator = apply {
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

            return other is Operator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferInitiateMobileMoneyTransferParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransferInitiateMobileMoneyTransferParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
