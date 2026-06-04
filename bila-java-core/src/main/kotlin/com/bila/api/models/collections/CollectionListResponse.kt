// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.collections

import com.bila.api.core.Enum
import com.bila.api.core.ExcludeMissing
import com.bila.api.core.JsonField
import com.bila.api.core.JsonMissing
import com.bila.api.core.JsonValue
import com.bila.api.core.checkKnown
import com.bila.api.core.checkRequired
import com.bila.api.core.toImmutable
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

class CollectionListResponse
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
         * Returns a mutable builder for constructing an instance of [CollectionListResponse].
         *
         * The following fields are required:
         * ```java
         * .message()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CollectionListResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String>? = null
        private var status: JsonField<Boolean>? = null
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(collectionListResponse: CollectionListResponse) = apply {
            message = collectionListResponse.message
            status = collectionListResponse.status
            data = collectionListResponse.data
            additionalProperties = collectionListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CollectionListResponse].
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
        fun build(): CollectionListResponse =
            CollectionListResponse(
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
    fun validate(): CollectionListResponse = apply {
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
         * List of collections
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

            /** List of collections */
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
            private val amount: JsonField<Double>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val currency: JsonField<String>,
            private val customer: JsonField<Customer>,
            private val reference: JsonField<String>,
            private val status: JsonField<Status>,
            private val completedAt: JsonField<OffsetDateTime>,
            private val feeBearer: JsonField<FeeBearer>,
            private val narration: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("createdAt")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer")
                @ExcludeMissing
                customer: JsonField<Customer> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("completedAt")
                @ExcludeMissing
                completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("feeBearer")
                @ExcludeMissing
                feeBearer: JsonField<FeeBearer> = JsonMissing.of(),
                @JsonProperty("narration")
                @ExcludeMissing
                narration: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                amount,
                createdAt,
                currency,
                customer,
                reference,
                status,
                completedAt,
                feeBearer,
                narration,
                mutableMapOf(),
            )

            /**
             * Collection ID
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Collection amount
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Double = amount.getRequired("amount")

            /**
             * Collection creation timestamp
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
             * Customer details
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customer(): Customer = customer.getRequired("customer")

            /**
             * Client reference
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * Collection status
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * Collection completion timestamp
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completedAt")

            /**
             * Who bears the collection platform fee
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun feeBearer(): Optional<FeeBearer> = feeBearer.getOptional("feeBearer")

            /**
             * Collection narration
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Returns the raw JSON value of [customer].
             *
             * Unlike [customer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer")
            @ExcludeMissing
            fun _customer(): JsonField<Customer> = customer

            /**
             * Returns the raw JSON value of [reference].
             *
             * Unlike [reference], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reference")
            @ExcludeMissing
            fun _reference(): JsonField<String> = reference

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [completedAt].
             *
             * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("completedAt")
            @ExcludeMissing
            fun _completedAt(): JsonField<OffsetDateTime> = completedAt

            /**
             * Returns the raw JSON value of [feeBearer].
             *
             * Unlike [feeBearer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("feeBearer")
            @ExcludeMissing
            fun _feeBearer(): JsonField<FeeBearer> = feeBearer

            /**
             * Returns the raw JSON value of [narration].
             *
             * Unlike [narration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("narration")
            @ExcludeMissing
            fun _narration(): JsonField<String> = narration

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
                 * .amount()
                 * .createdAt()
                 * .currency()
                 * .customer()
                 * .reference()
                 * .status()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InnerData]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var amount: JsonField<Double>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var currency: JsonField<String>? = null
                private var customer: JsonField<Customer>? = null
                private var reference: JsonField<String>? = null
                private var status: JsonField<Status>? = null
                private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var feeBearer: JsonField<FeeBearer> = JsonMissing.of()
                private var narration: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(innerData: InnerData) = apply {
                    id = innerData.id
                    amount = innerData.amount
                    createdAt = innerData.createdAt
                    currency = innerData.currency
                    customer = innerData.customer
                    reference = innerData.reference
                    status = innerData.status
                    completedAt = innerData.completedAt
                    feeBearer = innerData.feeBearer
                    narration = innerData.narration
                    additionalProperties = innerData.additionalProperties.toMutableMap()
                }

                /** Collection ID */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Collection amount */
                fun amount(amount: Double) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                /** Collection creation timestamp */
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

                /** Customer details */
                fun customer(customer: Customer) = customer(JsonField.of(customer))

                /**
                 * Sets [Builder.customer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customer] with a well-typed [Customer] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

                /** Client reference */
                fun reference(reference: String) = reference(JsonField.of(reference))

                /**
                 * Sets [Builder.reference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reference] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reference(reference: JsonField<String>) = apply { this.reference = reference }

                /** Collection status */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Collection completion timestamp */
                fun completedAt(completedAt: OffsetDateTime) =
                    completedAt(JsonField.of(completedAt))

                /**
                 * Sets [Builder.completedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                    this.completedAt = completedAt
                }

                /** Who bears the collection platform fee */
                fun feeBearer(feeBearer: FeeBearer) = feeBearer(JsonField.of(feeBearer))

                /**
                 * Sets [Builder.feeBearer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.feeBearer] with a well-typed [FeeBearer] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun feeBearer(feeBearer: JsonField<FeeBearer>) = apply {
                    this.feeBearer = feeBearer
                }

                /** Collection narration */
                fun narration(narration: String) = narration(JsonField.of(narration))

                /**
                 * Sets [Builder.narration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.narration] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun narration(narration: JsonField<String>) = apply { this.narration = narration }

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
                 * .amount()
                 * .createdAt()
                 * .currency()
                 * .customer()
                 * .reference()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InnerData =
                    InnerData(
                        checkRequired("id", id),
                        checkRequired("amount", amount),
                        checkRequired("createdAt", createdAt),
                        checkRequired("currency", currency),
                        checkRequired("customer", customer),
                        checkRequired("reference", reference),
                        checkRequired("status", status),
                        completedAt,
                        feeBearer,
                        narration,
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
                amount()
                createdAt()
                currency()
                customer().validate()
                reference()
                status().validate()
                completedAt()
                feeBearer().ifPresent { it.validate() }
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
                    (customer.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (reference.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (completedAt.asKnown().isPresent) 1 else 0) +
                    (feeBearer.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (narration.asKnown().isPresent) 1 else 0)

            /** Customer details */
            class Customer
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val operator: JsonField<String>,
                private val phone: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phone")
                    @ExcludeMissing
                    phone: JsonField<String> = JsonMissing.of(),
                ) : this(name, operator, phone, mutableMapOf())

                /**
                 * Customer name
                 *
                 * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Mobile money operator
                 *
                 * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operator(): String = operator.getRequired("operator")

                /**
                 * Customer phone number
                 *
                 * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun phone(): String = phone.getRequired("phone")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<String> = operator

                /**
                 * Returns the raw JSON value of [phone].
                 *
                 * Unlike [phone], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [Customer].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .operator()
                     * .phone()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Customer]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var operator: JsonField<String>? = null
                    private var phone: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customer: Customer) = apply {
                        name = customer.name
                        operator = customer.operator
                        phone = customer.phone
                        additionalProperties = customer.additionalProperties.toMutableMap()
                    }

                    /** Customer name */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** Mobile money operator */
                    fun operator(operator: String) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<String>) = apply { this.operator = operator }

                    /** Customer phone number */
                    fun phone(phone: String) = phone(JsonField.of(phone))

                    /**
                     * Sets [Builder.phone] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phone] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [Customer].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .operator()
                     * .phone()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Customer =
                        Customer(
                            checkRequired("name", name),
                            checkRequired("operator", operator),
                            checkRequired("phone", phone),
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
                fun validate(): Customer = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (if (operator.asKnown().isPresent) 1 else 0) +
                        (if (phone.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Customer &&
                        name == other.name &&
                        operator == other.operator &&
                        phone == other.phone &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, operator, phone, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Customer{name=$name, operator=$operator, phone=$phone, additionalProperties=$additionalProperties}"
            }

            /** Collection status */
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

                    @JvmField val PENDING = of("pending")

                    @JvmField val SUCCESSFUL = of("successful")

                    @JvmField val FAILED = of("failed")

                    @JvmField val OTP_REQUIRED = of("otp-required")

                    @JvmField val PAY_OFFLINE = of("pay-offline")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    PENDING,
                    SUCCESSFUL,
                    FAILED,
                    OTP_REQUIRED,
                    PAY_OFFLINE,
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
                    PENDING,
                    SUCCESSFUL,
                    FAILED,
                    OTP_REQUIRED,
                    PAY_OFFLINE,
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
                        PENDING -> Value.PENDING
                        SUCCESSFUL -> Value.SUCCESSFUL
                        FAILED -> Value.FAILED
                        OTP_REQUIRED -> Value.OTP_REQUIRED
                        PAY_OFFLINE -> Value.PAY_OFFLINE
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
                        OTP_REQUIRED -> Known.OTP_REQUIRED
                        PAY_OFFLINE -> Known.PAY_OFFLINE
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

            /** Who bears the collection platform fee */
            class FeeBearer @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val MERCHANT = of("merchant")

                    @JvmField val CUSTOMER = of("customer")

                    @JvmStatic fun of(value: String) = FeeBearer(JsonField.of(value))
                }

                /** An enum containing [FeeBearer]'s known values. */
                enum class Known {
                    MERCHANT,
                    CUSTOMER,
                }

                /**
                 * An enum containing [FeeBearer]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [FeeBearer] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MERCHANT,
                    CUSTOMER,
                    /**
                     * An enum member indicating that [FeeBearer] was instantiated with an unknown
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
                        MERCHANT -> Value.MERCHANT
                        CUSTOMER -> Value.CUSTOMER
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
                        MERCHANT -> Known.MERCHANT
                        CUSTOMER -> Known.CUSTOMER
                        else -> throw BilaInvalidDataException("Unknown FeeBearer: $value")
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
                fun validate(): FeeBearer = apply {
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

                    return other is FeeBearer && value == other.value
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
                    amount == other.amount &&
                    createdAt == other.createdAt &&
                    currency == other.currency &&
                    customer == other.customer &&
                    reference == other.reference &&
                    status == other.status &&
                    completedAt == other.completedAt &&
                    feeBearer == other.feeBearer &&
                    narration == other.narration &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    amount,
                    createdAt,
                    currency,
                    customer,
                    reference,
                    status,
                    completedAt,
                    feeBearer,
                    narration,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InnerData{id=$id, amount=$amount, createdAt=$createdAt, currency=$currency, customer=$customer, reference=$reference, status=$status, completedAt=$completedAt, feeBearer=$feeBearer, narration=$narration, additionalProperties=$additionalProperties}"
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

        return other is CollectionListResponse &&
            message == other.message &&
            status == other.status &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(message, status, data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CollectionListResponse{message=$message, status=$status, data=$data, additionalProperties=$additionalProperties}"
}
