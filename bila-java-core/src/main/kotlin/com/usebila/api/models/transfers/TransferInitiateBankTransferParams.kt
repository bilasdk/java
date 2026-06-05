// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.transfers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.usebila.api.core.Enum
import com.usebila.api.core.ExcludeMissing
import com.usebila.api.core.JsonField
import com.usebila.api.core.JsonMissing
import com.usebila.api.core.JsonValue
import com.usebila.api.core.Params
import com.usebila.api.core.checkRequired
import com.usebila.api.core.http.Headers
import com.usebila.api.core.http.QueryParams
import com.usebila.api.errors.BilaInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Initiate a transfer to a bank account. Creates a transaction record in your dashboard. */
class TransferInitiateBankTransferParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Source account UUID
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * Transfer amount
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = body.amount()

    /**
     * Unique client reference (alphanumeric, dots, underscores, hyphens)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reference(): String = body.reference()

    /**
     * Bank account number (required if no transferRecipientId)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun accountNumber(): Optional<String> = body.accountNumber()

    /**
     * Bank ID (required if no transferRecipientId)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun bankId(): Optional<String> = body.bankId()

    /**
     * Country code
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun country(): Optional<Country> = body.country()

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
     * Transfer recipient UUID (use this OR accountNumber+bankId)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun transferRecipientId(): Optional<String> = body.transferRecipientId()

    /**
     * Source wallet ID to debit (optional, uses main wallet if not specified)
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun walletId(): Optional<String> = body.walletId()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Double> = body._amount()

    /**
     * Returns the raw JSON value of [reference].
     *
     * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reference(): JsonField<String> = body._reference()

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountNumber(): JsonField<String> = body._accountNumber()

    /**
     * Returns the raw JSON value of [bankId].
     *
     * Unlike [bankId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bankId(): JsonField<String> = body._bankId()

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _country(): JsonField<Country> = body._country()

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
     * Returns the raw JSON value of [transferRecipientId].
     *
     * Unlike [transferRecipientId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _transferRecipientId(): JsonField<String> = body._transferRecipientId()

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
         * [TransferInitiateBankTransferParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .reference()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransferInitiateBankTransferParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(transferInitiateBankTransferParams: TransferInitiateBankTransferParams) =
            apply {
                body = transferInitiateBankTransferParams.body.toBuilder()
                additionalHeaders = transferInitiateBankTransferParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    transferInitiateBankTransferParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [amount]
         * - [reference]
         * - [accountNumber]
         * - [bankId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Source account UUID */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** Transfer amount */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** Unique client reference (alphanumeric, dots, underscores, hyphens) */
        fun reference(reference: String) = apply { body.reference(reference) }

        /**
         * Sets [Builder.reference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reference] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reference(reference: JsonField<String>) = apply { body.reference(reference) }

        /** Bank account number (required if no transferRecipientId) */
        fun accountNumber(accountNumber: String) = apply { body.accountNumber(accountNumber) }

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            body.accountNumber(accountNumber)
        }

        /** Bank ID (required if no transferRecipientId) */
        fun bankId(bankId: String) = apply { body.bankId(bankId) }

        /**
         * Sets [Builder.bankId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bankId(bankId: JsonField<String>) = apply { body.bankId(bankId) }

        /** Country code */
        fun country(country: Country) = apply { body.country(country) }

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [Country] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<Country>) = apply { body.country(country) }

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

        /** Transfer recipient UUID (use this OR accountNumber+bankId) */
        fun transferRecipientId(transferRecipientId: String) = apply {
            body.transferRecipientId(transferRecipientId)
        }

        /**
         * Sets [Builder.transferRecipientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transferRecipientId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transferRecipientId(transferRecipientId: JsonField<String>) = apply {
            body.transferRecipientId(transferRecipientId)
        }

        /** Source wallet ID to debit (optional, uses main wallet if not specified) */
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
         * Returns an immutable instance of [TransferInitiateBankTransferParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .reference()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransferInitiateBankTransferParams =
            TransferInitiateBankTransferParams(
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
        private val accountId: JsonField<String>,
        private val amount: JsonField<Double>,
        private val reference: JsonField<String>,
        private val accountNumber: JsonField<String>,
        private val bankId: JsonField<String>,
        private val country: JsonField<Country>,
        private val narration: JsonField<String>,
        private val recipientName: JsonField<String>,
        private val transferRecipientId: JsonField<String>,
        private val walletId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("reference")
            @ExcludeMissing
            reference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountNumber")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bankId") @ExcludeMissing bankId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<Country> = JsonMissing.of(),
            @JsonProperty("narration")
            @ExcludeMissing
            narration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipientName")
            @ExcludeMissing
            recipientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transferRecipientId")
            @ExcludeMissing
            transferRecipientId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("walletId") @ExcludeMissing walletId: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountId,
            amount,
            reference,
            accountNumber,
            bankId,
            country,
            narration,
            recipientName,
            transferRecipientId,
            walletId,
            mutableMapOf(),
        )

        /**
         * Source account UUID
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * Transfer amount
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * Unique client reference (alphanumeric, dots, underscores, hyphens)
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reference(): String = reference.getRequired("reference")

        /**
         * Bank account number (required if no transferRecipientId)
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountNumber(): Optional<String> = accountNumber.getOptional("accountNumber")

        /**
         * Bank ID (required if no transferRecipientId)
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bankId(): Optional<String> = bankId.getOptional("bankId")

        /**
         * Country code
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): Optional<Country> = country.getOptional("country")

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
         * Transfer recipient UUID (use this OR accountNumber+bankId)
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transferRecipientId(): Optional<String> =
            transferRecipientId.getOptional("transferRecipientId")

        /**
         * Source wallet ID to debit (optional, uses main wallet if not specified)
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun walletId(): Optional<String> = walletId.getOptional("walletId")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [reference].
         *
         * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reference") @ExcludeMissing fun _reference(): JsonField<String> = reference

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
         * Returns the raw JSON value of [bankId].
         *
         * Unlike [bankId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bankId") @ExcludeMissing fun _bankId(): JsonField<String> = bankId

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<Country> = country

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
         * Returns the raw JSON value of [transferRecipientId].
         *
         * Unlike [transferRecipientId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transferRecipientId")
        @ExcludeMissing
        fun _transferRecipientId(): JsonField<String> = transferRecipientId

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
             * .accountId()
             * .amount()
             * .reference()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Double>? = null
            private var reference: JsonField<String>? = null
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var bankId: JsonField<String> = JsonMissing.of()
            private var country: JsonField<Country> = JsonMissing.of()
            private var narration: JsonField<String> = JsonMissing.of()
            private var recipientName: JsonField<String> = JsonMissing.of()
            private var transferRecipientId: JsonField<String> = JsonMissing.of()
            private var walletId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                amount = body.amount
                reference = body.reference
                accountNumber = body.accountNumber
                bankId = body.bankId
                country = body.country
                narration = body.narration
                recipientName = body.recipientName
                transferRecipientId = body.transferRecipientId
                walletId = body.walletId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Source account UUID */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

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

            /** Unique client reference (alphanumeric, dots, underscores, hyphens) */
            fun reference(reference: String) = reference(JsonField.of(reference))

            /**
             * Sets [Builder.reference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reference] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reference(reference: JsonField<String>) = apply { this.reference = reference }

            /** Bank account number (required if no transferRecipientId) */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** Bank ID (required if no transferRecipientId) */
            fun bankId(bankId: String) = bankId(JsonField.of(bankId))

            /**
             * Sets [Builder.bankId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

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

            /** Transfer recipient UUID (use this OR accountNumber+bankId) */
            fun transferRecipientId(transferRecipientId: String) =
                transferRecipientId(JsonField.of(transferRecipientId))

            /**
             * Sets [Builder.transferRecipientId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferRecipientId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transferRecipientId(transferRecipientId: JsonField<String>) = apply {
                this.transferRecipientId = transferRecipientId
            }

            /** Source wallet ID to debit (optional, uses main wallet if not specified) */
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
             * .accountId()
             * .amount()
             * .reference()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("reference", reference),
                    accountNumber,
                    bankId,
                    country,
                    narration,
                    recipientName,
                    transferRecipientId,
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

            accountId()
            amount()
            reference()
            accountNumber()
            bankId()
            country().ifPresent { it.validate() }
            narration()
            recipientName()
            transferRecipientId()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (reference.asKnown().isPresent) 1 else 0) +
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (if (bankId.asKnown().isPresent) 1 else 0) +
                (country.asKnown().getOrNull()?.validity() ?: 0) +
                (if (narration.asKnown().isPresent) 1 else 0) +
                (if (recipientName.asKnown().isPresent) 1 else 0) +
                (if (transferRecipientId.asKnown().isPresent) 1 else 0) +
                (if (walletId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                amount == other.amount &&
                reference == other.reference &&
                accountNumber == other.accountNumber &&
                bankId == other.bankId &&
                country == other.country &&
                narration == other.narration &&
                recipientName == other.recipientName &&
                transferRecipientId == other.transferRecipientId &&
                walletId == other.walletId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                amount,
                reference,
                accountNumber,
                bankId,
                country,
                narration,
                recipientName,
                transferRecipientId,
                walletId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, amount=$amount, reference=$reference, accountNumber=$accountNumber, bankId=$bankId, country=$country, narration=$narration, recipientName=$recipientName, transferRecipientId=$transferRecipientId, walletId=$walletId, additionalProperties=$additionalProperties}"
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

            @JvmStatic fun of(value: String) = Country(JsonField.of(value))
        }

        /** An enum containing [Country]'s known values. */
        enum class Known {
            ZM
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferInitiateBankTransferParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransferInitiateBankTransferParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
