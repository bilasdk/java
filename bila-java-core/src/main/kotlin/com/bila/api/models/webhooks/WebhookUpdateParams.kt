// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.webhooks

import com.bila.api.core.Enum
import com.bila.api.core.ExcludeMissing
import com.bila.api.core.JsonField
import com.bila.api.core.JsonMissing
import com.bila.api.core.JsonValue
import com.bila.api.core.Params
import com.bila.api.core.checkKnown
import com.bila.api.core.http.Headers
import com.bila.api.core.http.QueryParams
import com.bila.api.core.toImmutable
import com.bila.api.errors.BilaInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a webhook config */
class WebhookUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Event types to subscribe to
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun events(): Optional<List<Event>> = body.events()

    /**
     * Whether the webhook is active
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = body.isActive()

    /**
     * Webhook endpoint URL
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun url(): Optional<String> = body.url()

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _events(): JsonField<List<Event>> = body._events()

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isActive(): JsonField<Boolean> = body._isActive()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WebhookUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [WebhookUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(webhookUpdateParams: WebhookUpdateParams) = apply {
            id = webhookUpdateParams.id
            body = webhookUpdateParams.body.toBuilder()
            additionalHeaders = webhookUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = webhookUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [events]
         * - [isActive]
         * - [url]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Event types to subscribe to */
        fun events(events: List<Event>) = apply { body.events(events) }

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<Event>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun events(events: JsonField<List<Event>>) = apply { body.events(events) }

        /**
         * Adds a single [Event] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: Event) = apply { body.addEvent(event) }

        /** Whether the webhook is active */
        fun isActive(isActive: Boolean) = apply { body.isActive(isActive) }

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { body.isActive(isActive) }

        /** Webhook endpoint URL */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

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
         * Returns an immutable instance of [WebhookUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WebhookUpdateParams =
            WebhookUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val events: JsonField<List<Event>>,
        private val isActive: JsonField<Boolean>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<Event>> = JsonMissing.of(),
            @JsonProperty("isActive")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(events, isActive, url, mutableMapOf())

        /**
         * Event types to subscribe to
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun events(): Optional<List<Event>> = events.getOptional("events")

        /**
         * Whether the webhook is active
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("isActive")

        /**
         * Webhook endpoint URL
         *
         * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [events].
         *
         * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var events: JsonField<MutableList<Event>>? = null
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                events = body.events.map { it.toMutableList() }
                isActive = body.isActive
                url = body.url
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Event types to subscribe to */
            fun events(events: List<Event>) = events(JsonField.of(events))

            /**
             * Sets [Builder.events] to an arbitrary JSON value.
             *
             * You should usually call [Builder.events] with a well-typed `List<Event>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun events(events: JsonField<List<Event>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Adds a single [Event] to [events].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvent(event: Event) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).also {
                        checkKnown("events", it).add(event)
                    }
            }

            /** Whether the webhook is active */
            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** Webhook endpoint URL */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             */
            fun build(): Body =
                Body(
                    (events ?: JsonMissing.of()).map { it.toImmutable() },
                    isActive,
                    url,
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

            events().ifPresent { it.forEach { it.validate() } }
            isActive()
            url()
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
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (isActive.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                events == other.events &&
                isActive == other.isActive &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(events, isActive, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{events=$events, isActive=$isActive, url=$url, additionalProperties=$additionalProperties}"
    }

    class Event @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ORDER_CREATED = of("order.created")

            @JvmField val ORDER_PAID = of("order.paid")

            @JvmField val ORDER_CANCELLED = of("order.cancelled")

            @JvmField val STOCK_LOW = of("stock.low")

            @JvmField val PAYMENT_CREATED = of("payment.created")

            @JvmField val PAYMENT_COMPLETED = of("payment.completed")

            @JvmField val PAYMENT_FAILED = of("payment.failed")

            @JvmField val COLLECTION_PENDING = of("collection.pending")

            @JvmField val COLLECTION_COMPLETED = of("collection.completed")

            @JvmField val COLLECTION_FAILED = of("collection.failed")

            @JvmField val WITHDRAWAL_CREATED = of("withdrawal.created")

            @JvmField val WITHDRAWAL_COMPLETED = of("withdrawal.completed")

            @JvmField val WITHDRAWAL_FAILED = of("withdrawal.failed")

            @JvmField val TRANSACTION_UPDATED = of("transaction.updated")

            @JvmField val TRANSFER_PENDING = of("transfer.pending")

            @JvmField val TRANSFER_COMPLETED = of("transfer.completed")

            @JvmField val TRANSFER_FAILED = of("transfer.failed")

            @JvmField val SETTLEMENT_COMPLETED = of("settlement.completed")

            @JvmStatic fun of(value: String) = Event(JsonField.of(value))
        }

        /** An enum containing [Event]'s known values. */
        enum class Known {
            ORDER_CREATED,
            ORDER_PAID,
            ORDER_CANCELLED,
            STOCK_LOW,
            PAYMENT_CREATED,
            PAYMENT_COMPLETED,
            PAYMENT_FAILED,
            COLLECTION_PENDING,
            COLLECTION_COMPLETED,
            COLLECTION_FAILED,
            WITHDRAWAL_CREATED,
            WITHDRAWAL_COMPLETED,
            WITHDRAWAL_FAILED,
            TRANSACTION_UPDATED,
            TRANSFER_PENDING,
            TRANSFER_COMPLETED,
            TRANSFER_FAILED,
            SETTLEMENT_COMPLETED,
        }

        /**
         * An enum containing [Event]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Event] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ORDER_CREATED,
            ORDER_PAID,
            ORDER_CANCELLED,
            STOCK_LOW,
            PAYMENT_CREATED,
            PAYMENT_COMPLETED,
            PAYMENT_FAILED,
            COLLECTION_PENDING,
            COLLECTION_COMPLETED,
            COLLECTION_FAILED,
            WITHDRAWAL_CREATED,
            WITHDRAWAL_COMPLETED,
            WITHDRAWAL_FAILED,
            TRANSACTION_UPDATED,
            TRANSFER_PENDING,
            TRANSFER_COMPLETED,
            TRANSFER_FAILED,
            SETTLEMENT_COMPLETED,
            /** An enum member indicating that [Event] was instantiated with an unknown value. */
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
                ORDER_CREATED -> Value.ORDER_CREATED
                ORDER_PAID -> Value.ORDER_PAID
                ORDER_CANCELLED -> Value.ORDER_CANCELLED
                STOCK_LOW -> Value.STOCK_LOW
                PAYMENT_CREATED -> Value.PAYMENT_CREATED
                PAYMENT_COMPLETED -> Value.PAYMENT_COMPLETED
                PAYMENT_FAILED -> Value.PAYMENT_FAILED
                COLLECTION_PENDING -> Value.COLLECTION_PENDING
                COLLECTION_COMPLETED -> Value.COLLECTION_COMPLETED
                COLLECTION_FAILED -> Value.COLLECTION_FAILED
                WITHDRAWAL_CREATED -> Value.WITHDRAWAL_CREATED
                WITHDRAWAL_COMPLETED -> Value.WITHDRAWAL_COMPLETED
                WITHDRAWAL_FAILED -> Value.WITHDRAWAL_FAILED
                TRANSACTION_UPDATED -> Value.TRANSACTION_UPDATED
                TRANSFER_PENDING -> Value.TRANSFER_PENDING
                TRANSFER_COMPLETED -> Value.TRANSFER_COMPLETED
                TRANSFER_FAILED -> Value.TRANSFER_FAILED
                SETTLEMENT_COMPLETED -> Value.SETTLEMENT_COMPLETED
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
                ORDER_CREATED -> Known.ORDER_CREATED
                ORDER_PAID -> Known.ORDER_PAID
                ORDER_CANCELLED -> Known.ORDER_CANCELLED
                STOCK_LOW -> Known.STOCK_LOW
                PAYMENT_CREATED -> Known.PAYMENT_CREATED
                PAYMENT_COMPLETED -> Known.PAYMENT_COMPLETED
                PAYMENT_FAILED -> Known.PAYMENT_FAILED
                COLLECTION_PENDING -> Known.COLLECTION_PENDING
                COLLECTION_COMPLETED -> Known.COLLECTION_COMPLETED
                COLLECTION_FAILED -> Known.COLLECTION_FAILED
                WITHDRAWAL_CREATED -> Known.WITHDRAWAL_CREATED
                WITHDRAWAL_COMPLETED -> Known.WITHDRAWAL_COMPLETED
                WITHDRAWAL_FAILED -> Known.WITHDRAWAL_FAILED
                TRANSACTION_UPDATED -> Known.TRANSACTION_UPDATED
                TRANSFER_PENDING -> Known.TRANSFER_PENDING
                TRANSFER_COMPLETED -> Known.TRANSFER_COMPLETED
                TRANSFER_FAILED -> Known.TRANSFER_FAILED
                SETTLEMENT_COMPLETED -> Known.SETTLEMENT_COMPLETED
                else -> throw BilaInvalidDataException("Unknown Event: $value")
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
        fun validate(): Event = apply {
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

            return other is Event && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WebhookUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
