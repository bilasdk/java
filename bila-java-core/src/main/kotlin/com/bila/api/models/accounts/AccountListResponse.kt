// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.accounts

import com.bila.api.core.Enum
import com.bila.api.core.ExcludeMissing
import com.bila.api.core.JsonField
import com.bila.api.core.JsonMissing
import com.bila.api.core.JsonValue
import com.bila.api.core.checkKnown
import com.bila.api.core.checkRequired
import com.bila.api.core.toImmutable
import com.bila.api.errors.BilaInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AccountListResponse
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
         * Returns a mutable builder for constructing an instance of [AccountListResponse].
         *
         * The following fields are required:
         * ```java
         * .message()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountListResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String>? = null
        private var status: JsonField<Boolean>? = null
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountListResponse: AccountListResponse) = apply {
            message = accountListResponse.message
            status = accountListResponse.status
            data = accountListResponse.data
            additionalProperties = accountListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [AccountListResponse].
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
        fun build(): AccountListResponse =
            AccountListResponse(
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
    fun validate(): AccountListResponse = apply {
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
        private val data: JsonField<List<InnerData>>,
        private val meta: JsonField<Meta>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<InnerData>> = JsonMissing.of(),
            @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        ) : this(data, meta, mutableMapOf())

        /**
         * List of accounts
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): List<InnerData> = data.getRequired("data")

        /**
         * Pagination metadata
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meta(): Meta = meta.getRequired("meta")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<InnerData>> = data

        /**
         * Returns the raw JSON value of [meta].
         *
         * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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
             * .data()
             * .meta()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<InnerData>>? = null
            private var meta: JsonField<Meta>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.data = data.data.map { it.toMutableList() }
                meta = data.meta
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** List of accounts */
            fun data(data: List<InnerData>) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<InnerData>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<List<InnerData>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [InnerData] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: InnerData) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Pagination metadata */
            fun meta(meta: Meta) = meta(JsonField.of(meta))

            /**
             * Sets [Builder.meta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
             * .data()
             * .meta()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("data", data).map { it.toImmutable() },
                    checkRequired("meta", meta),
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

            data().forEach { it.validate() }
            meta().validate()
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
            (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (meta.asKnown().getOrNull()?.validity() ?: 0)

        class InnerData
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val currency: JsonField<String>,
            private val details: JsonField<Details>,
            private val status: JsonField<Status>,
            private val type: JsonField<Type>,
            private val availableBalance: JsonField<String>,
            private val ledgerBalance: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("createdAt")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("details")
                @ExcludeMissing
                details: JsonField<Details> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("availableBalance")
                @ExcludeMissing
                availableBalance: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ledgerBalance")
                @ExcludeMissing
                ledgerBalance: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                createdAt,
                currency,
                details,
                status,
                type,
                availableBalance,
                ledgerBalance,
                mutableMapOf(),
            )

            /**
             * Account UUID
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Account creation timestamp
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

            /**
             * Currency code
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Account details
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun details(): Details = details.getRequired("details")

            /**
             * Account status
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * Account type
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Available balance
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun availableBalance(): Optional<String> =
                availableBalance.getOptional("availableBalance")

            /**
             * Ledger balance
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ledgerBalance(): Optional<String> = ledgerBalance.getOptional("ledgerBalance")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("createdAt")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [details].
             *
             * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<Details> = details

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
             * Returns the raw JSON value of [availableBalance].
             *
             * Unlike [availableBalance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("availableBalance")
            @ExcludeMissing
            fun _availableBalance(): JsonField<String> = availableBalance

            /**
             * Returns the raw JSON value of [ledgerBalance].
             *
             * Unlike [ledgerBalance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ledgerBalance")
            @ExcludeMissing
            fun _ledgerBalance(): JsonField<String> = ledgerBalance

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
                 * Returns a mutable builder for constructing an instance of [InnerData].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .createdAt()
                 * .currency()
                 * .details()
                 * .status()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InnerData]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var currency: JsonField<String>? = null
                private var details: JsonField<Details>? = null
                private var status: JsonField<Status>? = null
                private var type: JsonField<Type>? = null
                private var availableBalance: JsonField<String> = JsonMissing.of()
                private var ledgerBalance: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(innerData: InnerData) = apply {
                    id = innerData.id
                    createdAt = innerData.createdAt
                    currency = innerData.currency
                    details = innerData.details
                    status = innerData.status
                    type = innerData.type
                    availableBalance = innerData.availableBalance
                    ledgerBalance = innerData.ledgerBalance
                    additionalProperties = innerData.additionalProperties.toMutableMap()
                }

                /** Account UUID */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Account creation timestamp */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Currency code */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** Account details */
                fun details(details: Details) = details(JsonField.of(details))

                /**
                 * Sets [Builder.details] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.details] with a well-typed [Details] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun details(details: JsonField<Details>) = apply { this.details = details }

                /** Account status */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Account type */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Available balance */
                fun availableBalance(availableBalance: String) =
                    availableBalance(JsonField.of(availableBalance))

                /**
                 * Sets [Builder.availableBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.availableBalance] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun availableBalance(availableBalance: JsonField<String>) = apply {
                    this.availableBalance = availableBalance
                }

                /** Ledger balance */
                fun ledgerBalance(ledgerBalance: String) =
                    ledgerBalance(JsonField.of(ledgerBalance))

                /**
                 * Sets [Builder.ledgerBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ledgerBalance] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ledgerBalance(ledgerBalance: JsonField<String>) = apply {
                    this.ledgerBalance = ledgerBalance
                }

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
                 * Returns an immutable instance of [InnerData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .createdAt()
                 * .currency()
                 * .details()
                 * .status()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InnerData =
                    InnerData(
                        checkRequired("id", id),
                        checkRequired("createdAt", createdAt),
                        checkRequired("currency", currency),
                        checkRequired("details", details),
                        checkRequired("status", status),
                        checkRequired("type", type),
                        availableBalance,
                        ledgerBalance,
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
            fun validate(): InnerData = apply {
                if (validated) {
                    return@apply
                }

                id()
                createdAt()
                currency()
                details().validate()
                status().validate()
                type().validate()
                availableBalance()
                ledgerBalance()
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
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (details.asKnown().getOrNull()?.validity() ?: 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (availableBalance.asKnown().isPresent) 1 else 0) +
                    (if (ledgerBalance.asKnown().isPresent) 1 else 0)

            /** Account details */
            class Details
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
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tillNumber")
                    @ExcludeMissing
                    tillNumber: JsonField<String> = JsonMissing.of(),
                ) : this(accountName, type, tillNumber, mutableMapOf())

                /**
                 * Account holder name
                 *
                 * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun accountName(): String = accountName.getRequired("accountName")

                /**
                 * Account detail type
                 *
                 * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): String = type.getRequired("type")

                /**
                 * Till number (for mobile money)
                 *
                 * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun tillNumber(): Optional<String> = tillNumber.getOptional("tillNumber")

                /**
                 * Returns the raw JSON value of [accountName].
                 *
                 * Unlike [accountName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("accountName")
                @ExcludeMissing
                fun _accountName(): JsonField<String> = accountName

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                /**
                 * Returns the raw JSON value of [tillNumber].
                 *
                 * Unlike [tillNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tillNumber")
                @ExcludeMissing
                fun _tillNumber(): JsonField<String> = tillNumber

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
                     * Returns a mutable builder for constructing an instance of [Details].
                     *
                     * The following fields are required:
                     * ```java
                     * .accountName()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Details]. */
                class Builder internal constructor() {

                    private var accountName: JsonField<String>? = null
                    private var type: JsonField<String>? = null
                    private var tillNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(details: Details) = apply {
                        accountName = details.accountName
                        type = details.type
                        tillNumber = details.tillNumber
                        additionalProperties = details.additionalProperties.toMutableMap()
                    }

                    /** Account holder name */
                    fun accountName(accountName: String) = accountName(JsonField.of(accountName))

                    /**
                     * Sets [Builder.accountName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accountName(accountName: JsonField<String>) = apply {
                        this.accountName = accountName
                    }

                    /** Account detail type */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

                    /** Till number (for mobile money) */
                    fun tillNumber(tillNumber: String) = tillNumber(JsonField.of(tillNumber))

                    /**
                     * Sets [Builder.tillNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tillNumber] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tillNumber(tillNumber: JsonField<String>) = apply {
                        this.tillNumber = tillNumber
                    }

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
                     * Returns an immutable instance of [Details].
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
                    fun build(): Details =
                        Details(
                            checkRequired("accountName", accountName),
                            checkRequired("type", type),
                            tillNumber,
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
                 * @throws BilaInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Details = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
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

                    return other is Details &&
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
                    "Details{accountName=$accountName, type=$type, tillNumber=$tillNumber, additionalProperties=$additionalProperties}"
            }

            /** Account status */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACTIVE = of("active")

                    @JvmField val INACTIVE = of("inactive")

                    @JvmField val SUSPENDED = of("suspended")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    ACTIVE,
                    INACTIVE,
                    SUSPENDED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACTIVE,
                    INACTIVE,
                    SUSPENDED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACTIVE -> Value.ACTIVE
                        INACTIVE -> Value.INACTIVE
                        SUSPENDED -> Value.SUSPENDED
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
                        ACTIVE -> Known.ACTIVE
                        INACTIVE -> Known.INACTIVE
                        SUSPENDED -> Known.SUSPENDED
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
                 * @throws BilaInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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

            /** Account type */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MAIN = of("main")

                    @JvmField val SUB = of("sub")

                    @JvmField val VIRTUAL = of("virtual")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    MAIN,
                    SUB,
                    VIRTUAL,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MAIN,
                    SUB,
                    VIRTUAL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MAIN -> Value.MAIN
                        SUB -> Value.SUB
                        VIRTUAL -> Value.VIRTUAL
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
                        MAIN -> Known.MAIN
                        SUB -> Known.SUB
                        VIRTUAL -> Known.VIRTUAL
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
                 * @throws BilaInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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

                return other is InnerData &&
                    id == other.id &&
                    createdAt == other.createdAt &&
                    currency == other.currency &&
                    details == other.details &&
                    status == other.status &&
                    type == other.type &&
                    availableBalance == other.availableBalance &&
                    ledgerBalance == other.ledgerBalance &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    createdAt,
                    currency,
                    details,
                    status,
                    type,
                    availableBalance,
                    ledgerBalance,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InnerData{id=$id, createdAt=$createdAt, currency=$currency, details=$details, status=$status, type=$type, availableBalance=$availableBalance, ledgerBalance=$ledgerBalance, additionalProperties=$additionalProperties}"
        }

        /** Pagination metadata */
        class Meta
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
                @JsonProperty("pageCount")
                @ExcludeMissing
                pageCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("perPage")
                @ExcludeMissing
                perPage: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
            ) : this(currentPage, pageCount, perPage, total, mutableMapOf())

            /**
             * Current page number
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currentPage(): Double = currentPage.getRequired("currentPage")

            /**
             * Total number of pages
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pageCount(): Double = pageCount.getRequired("pageCount")

            /**
             * Items per page
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun perPage(): Double = perPage.getRequired("perPage")

            /**
             * Total number of records
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun total(): Double = total.getRequired("total")

            /**
             * Returns the raw JSON value of [currentPage].
             *
             * Unlike [currentPage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currentPage")
            @ExcludeMissing
            fun _currentPage(): JsonField<Double> = currentPage

            /**
             * Returns the raw JSON value of [pageCount].
             *
             * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pageCount")
            @ExcludeMissing
            fun _pageCount(): JsonField<Double> = pageCount

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
                 * Returns a mutable builder for constructing an instance of [Meta].
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

            /** A builder for [Meta]. */
            class Builder internal constructor() {

                private var currentPage: JsonField<Double>? = null
                private var pageCount: JsonField<Double>? = null
                private var perPage: JsonField<Double>? = null
                private var total: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(meta: Meta) = apply {
                    currentPage = meta.currentPage
                    pageCount = meta.pageCount
                    perPage = meta.perPage
                    total = meta.total
                    additionalProperties = meta.additionalProperties.toMutableMap()
                }

                /** Current page number */
                fun currentPage(currentPage: Double) = currentPage(JsonField.of(currentPage))

                /**
                 * Sets [Builder.currentPage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currentPage] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currentPage(currentPage: JsonField<Double>) = apply {
                    this.currentPage = currentPage
                }

                /** Total number of pages */
                fun pageCount(pageCount: Double) = pageCount(JsonField.of(pageCount))

                /**
                 * Sets [Builder.pageCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pageCount(pageCount: JsonField<Double>) = apply { this.pageCount = pageCount }

                /** Items per page */
                fun perPage(perPage: Double) = perPage(JsonField.of(perPage))

                /**
                 * Sets [Builder.perPage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perPage] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun perPage(perPage: JsonField<Double>) = apply { this.perPage = perPage }

                /** Total number of records */
                fun total(total: Double) = total(JsonField.of(total))

                /**
                 * Sets [Builder.total] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.total] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun total(total: JsonField<Double>) = apply { this.total = total }

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
                 * Returns an immutable instance of [Meta].
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
                fun build(): Meta =
                    Meta(
                        checkRequired("currentPage", currentPage),
                        checkRequired("pageCount", pageCount),
                        checkRequired("perPage", perPage),
                        checkRequired("total", total),
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
            fun validate(): Meta = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
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

                return other is Meta &&
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
                "Meta{currentPage=$currentPage, pageCount=$pageCount, perPage=$perPage, total=$total, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                data == other.data &&
                meta == other.meta &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountListResponse &&
            message == other.message &&
            status == other.status &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(message, status, data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountListResponse{message=$message, status=$status, data=$data, additionalProperties=$additionalProperties}"
}
