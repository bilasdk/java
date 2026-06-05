// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.webhooks

import com.bila.api.core.Enum
import com.bila.api.core.ExcludeMissing
import com.bila.api.core.JsonField
import com.bila.api.core.JsonMissing
import com.bila.api.core.JsonValue
import com.bila.api.core.checkKnown
import com.bila.api.core.checkRequired
import com.bila.api.core.toImmutable
import com.bila.api.errors.BilaInvalidDataException
import com.bila.api.models.PaginationMetaDto
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WebhookGetDeliveriesResponse
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
         * Returns a mutable builder for constructing an instance of [WebhookGetDeliveriesResponse].
         *
         * The following fields are required:
         * ```java
         * .message()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookGetDeliveriesResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String>? = null
        private var status: JsonField<Boolean>? = null
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookGetDeliveriesResponse: WebhookGetDeliveriesResponse) = apply {
            message = webhookGetDeliveriesResponse.message
            status = webhookGetDeliveriesResponse.status
            data = webhookGetDeliveriesResponse.data
            additionalProperties = webhookGetDeliveriesResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [WebhookGetDeliveriesResponse].
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
        fun build(): WebhookGetDeliveriesResponse =
            WebhookGetDeliveriesResponse(
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
    fun validate(): WebhookGetDeliveriesResponse = apply {
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
        private val meta: JsonField<PaginationMetaDto>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            data: JsonField<List<InnerData>> = JsonMissing.of(),
            @JsonProperty("meta")
            @ExcludeMissing
            meta: JsonField<PaginationMetaDto> = JsonMissing.of(),
        ) : this(data, meta, mutableMapOf())

        /**
         * List of webhook deliveries
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
        fun meta(): PaginationMetaDto = meta.getRequired("meta")

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
        @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<PaginationMetaDto> = meta

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
            private var meta: JsonField<PaginationMetaDto>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.data = data.data.map { it.toMutableList() }
                meta = data.meta
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** List of webhook deliveries */
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
            fun meta(meta: PaginationMetaDto) = meta(JsonField.of(meta))

            /**
             * Sets [Builder.meta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meta] with a well-typed [PaginationMetaDto] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meta(meta: JsonField<PaginationMetaDto>) = apply { this.meta = meta }

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
            private val attempts: JsonField<Double>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val deliveredAt: JsonField<OffsetDateTime>,
            private val eventType: JsonField<String>,
            private val failedAt: JsonField<OffsetDateTime>,
            private val maxAttempts: JsonField<Double>,
            private val nextRetryAt: JsonField<OffsetDateTime>,
            private val payload: JsonField<Payload>,
            private val responseBody: JsonField<String>,
            private val responseStatus: JsonField<Double>,
            private val status: JsonField<Status>,
            private val webhookConfigId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("attempts")
                @ExcludeMissing
                attempts: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("createdAt")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("deliveredAt")
                @ExcludeMissing
                deliveredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("eventType")
                @ExcludeMissing
                eventType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("failedAt")
                @ExcludeMissing
                failedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("maxAttempts")
                @ExcludeMissing
                maxAttempts: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("nextRetryAt")
                @ExcludeMissing
                nextRetryAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("payload")
                @ExcludeMissing
                payload: JsonField<Payload> = JsonMissing.of(),
                @JsonProperty("responseBody")
                @ExcludeMissing
                responseBody: JsonField<String> = JsonMissing.of(),
                @JsonProperty("responseStatus")
                @ExcludeMissing
                responseStatus: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("webhookConfigId")
                @ExcludeMissing
                webhookConfigId: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                attempts,
                createdAt,
                deliveredAt,
                eventType,
                failedAt,
                maxAttempts,
                nextRetryAt,
                payload,
                responseBody,
                responseStatus,
                status,
                webhookConfigId,
                mutableMapOf(),
            )

            /**
             * Delivery UUID
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Number of delivery attempts
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun attempts(): Double = attempts.getRequired("attempts")

            /**
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

            /**
             * When the delivery succeeded
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deliveredAt(): Optional<OffsetDateTime> = deliveredAt.getOptional("deliveredAt")

            /**
             * Webhook event type
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun eventType(): String = eventType.getRequired("eventType")

            /**
             * When the delivery permanently failed
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun failedAt(): Optional<OffsetDateTime> = failedAt.getOptional("failedAt")

            /**
             * Maximum delivery attempts
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxAttempts(): Double = maxAttempts.getRequired("maxAttempts")

            /**
             * When the next retry is scheduled
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun nextRetryAt(): Optional<OffsetDateTime> = nextRetryAt.getOptional("nextRetryAt")

            /**
             * Event payload JSON as stored for delivery
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun payload(): Payload = payload.getRequired("payload")

            /**
             * Response body from the merchant endpoint (truncated)
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseBody(): Optional<String> = responseBody.getOptional("responseBody")

            /**
             * HTTP status code from the merchant endpoint
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responseStatus(): Optional<Double> = responseStatus.getOptional("responseStatus")

            /**
             * Delivery status
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * Webhook config UUID
             *
             * @throws BilaInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun webhookConfigId(): String = webhookConfigId.getRequired("webhookConfigId")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [attempts].
             *
             * Unlike [attempts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attempts") @ExcludeMissing fun _attempts(): JsonField<Double> = attempts

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
             * Returns the raw JSON value of [deliveredAt].
             *
             * Unlike [deliveredAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deliveredAt")
            @ExcludeMissing
            fun _deliveredAt(): JsonField<OffsetDateTime> = deliveredAt

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("eventType")
            @ExcludeMissing
            fun _eventType(): JsonField<String> = eventType

            /**
             * Returns the raw JSON value of [failedAt].
             *
             * Unlike [failedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("failedAt")
            @ExcludeMissing
            fun _failedAt(): JsonField<OffsetDateTime> = failedAt

            /**
             * Returns the raw JSON value of [maxAttempts].
             *
             * Unlike [maxAttempts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("maxAttempts")
            @ExcludeMissing
            fun _maxAttempts(): JsonField<Double> = maxAttempts

            /**
             * Returns the raw JSON value of [nextRetryAt].
             *
             * Unlike [nextRetryAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("nextRetryAt")
            @ExcludeMissing
            fun _nextRetryAt(): JsonField<OffsetDateTime> = nextRetryAt

            /**
             * Returns the raw JSON value of [payload].
             *
             * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

            /**
             * Returns the raw JSON value of [responseBody].
             *
             * Unlike [responseBody], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("responseBody")
            @ExcludeMissing
            fun _responseBody(): JsonField<String> = responseBody

            /**
             * Returns the raw JSON value of [responseStatus].
             *
             * Unlike [responseStatus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("responseStatus")
            @ExcludeMissing
            fun _responseStatus(): JsonField<Double> = responseStatus

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [webhookConfigId].
             *
             * Unlike [webhookConfigId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("webhookConfigId")
            @ExcludeMissing
            fun _webhookConfigId(): JsonField<String> = webhookConfigId

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
                 * .attempts()
                 * .createdAt()
                 * .deliveredAt()
                 * .eventType()
                 * .failedAt()
                 * .maxAttempts()
                 * .nextRetryAt()
                 * .payload()
                 * .responseBody()
                 * .responseStatus()
                 * .status()
                 * .webhookConfigId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InnerData]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var attempts: JsonField<Double>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var deliveredAt: JsonField<OffsetDateTime>? = null
                private var eventType: JsonField<String>? = null
                private var failedAt: JsonField<OffsetDateTime>? = null
                private var maxAttempts: JsonField<Double>? = null
                private var nextRetryAt: JsonField<OffsetDateTime>? = null
                private var payload: JsonField<Payload>? = null
                private var responseBody: JsonField<String>? = null
                private var responseStatus: JsonField<Double>? = null
                private var status: JsonField<Status>? = null
                private var webhookConfigId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(innerData: InnerData) = apply {
                    id = innerData.id
                    attempts = innerData.attempts
                    createdAt = innerData.createdAt
                    deliveredAt = innerData.deliveredAt
                    eventType = innerData.eventType
                    failedAt = innerData.failedAt
                    maxAttempts = innerData.maxAttempts
                    nextRetryAt = innerData.nextRetryAt
                    payload = innerData.payload
                    responseBody = innerData.responseBody
                    responseStatus = innerData.responseStatus
                    status = innerData.status
                    webhookConfigId = innerData.webhookConfigId
                    additionalProperties = innerData.additionalProperties.toMutableMap()
                }

                /** Delivery UUID */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Number of delivery attempts */
                fun attempts(attempts: Double) = attempts(JsonField.of(attempts))

                /**
                 * Sets [Builder.attempts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attempts] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attempts(attempts: JsonField<Double>) = apply { this.attempts = attempts }

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

                /** When the delivery succeeded */
                fun deliveredAt(deliveredAt: OffsetDateTime?) =
                    deliveredAt(JsonField.ofNullable(deliveredAt))

                /** Alias for calling [Builder.deliveredAt] with `deliveredAt.orElse(null)`. */
                fun deliveredAt(deliveredAt: Optional<OffsetDateTime>) =
                    deliveredAt(deliveredAt.getOrNull())

                /**
                 * Sets [Builder.deliveredAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deliveredAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deliveredAt(deliveredAt: JsonField<OffsetDateTime>) = apply {
                    this.deliveredAt = deliveredAt
                }

                /** Webhook event type */
                fun eventType(eventType: String) = eventType(JsonField.of(eventType))

                /**
                 * Sets [Builder.eventType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

                /** When the delivery permanently failed */
                fun failedAt(failedAt: OffsetDateTime?) = failedAt(JsonField.ofNullable(failedAt))

                /** Alias for calling [Builder.failedAt] with `failedAt.orElse(null)`. */
                fun failedAt(failedAt: Optional<OffsetDateTime>) = failedAt(failedAt.getOrNull())

                /**
                 * Sets [Builder.failedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun failedAt(failedAt: JsonField<OffsetDateTime>) = apply {
                    this.failedAt = failedAt
                }

                /** Maximum delivery attempts */
                fun maxAttempts(maxAttempts: Double) = maxAttempts(JsonField.of(maxAttempts))

                /**
                 * Sets [Builder.maxAttempts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxAttempts] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxAttempts(maxAttempts: JsonField<Double>) = apply {
                    this.maxAttempts = maxAttempts
                }

                /** When the next retry is scheduled */
                fun nextRetryAt(nextRetryAt: OffsetDateTime?) =
                    nextRetryAt(JsonField.ofNullable(nextRetryAt))

                /** Alias for calling [Builder.nextRetryAt] with `nextRetryAt.orElse(null)`. */
                fun nextRetryAt(nextRetryAt: Optional<OffsetDateTime>) =
                    nextRetryAt(nextRetryAt.getOrNull())

                /**
                 * Sets [Builder.nextRetryAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nextRetryAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun nextRetryAt(nextRetryAt: JsonField<OffsetDateTime>) = apply {
                    this.nextRetryAt = nextRetryAt
                }

                /** Event payload JSON as stored for delivery */
                fun payload(payload: Payload) = payload(JsonField.of(payload))

                /**
                 * Sets [Builder.payload] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payload] with a well-typed [Payload] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

                /** Response body from the merchant endpoint (truncated) */
                fun responseBody(responseBody: String?) =
                    responseBody(JsonField.ofNullable(responseBody))

                /** Alias for calling [Builder.responseBody] with `responseBody.orElse(null)`. */
                fun responseBody(responseBody: Optional<String>) =
                    responseBody(responseBody.getOrNull())

                /**
                 * Sets [Builder.responseBody] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseBody] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun responseBody(responseBody: JsonField<String>) = apply {
                    this.responseBody = responseBody
                }

                /** HTTP status code from the merchant endpoint */
                fun responseStatus(responseStatus: Double?) =
                    responseStatus(JsonField.ofNullable(responseStatus))

                /**
                 * Alias for [Builder.responseStatus].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun responseStatus(responseStatus: Double) =
                    responseStatus(responseStatus as Double?)

                /**
                 * Alias for calling [Builder.responseStatus] with `responseStatus.orElse(null)`.
                 */
                fun responseStatus(responseStatus: Optional<Double>) =
                    responseStatus(responseStatus.getOrNull())

                /**
                 * Sets [Builder.responseStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseStatus] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun responseStatus(responseStatus: JsonField<Double>) = apply {
                    this.responseStatus = responseStatus
                }

                /** Delivery status */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Webhook config UUID */
                fun webhookConfigId(webhookConfigId: String) =
                    webhookConfigId(JsonField.of(webhookConfigId))

                /**
                 * Sets [Builder.webhookConfigId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webhookConfigId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun webhookConfigId(webhookConfigId: JsonField<String>) = apply {
                    this.webhookConfigId = webhookConfigId
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
                 * .attempts()
                 * .createdAt()
                 * .deliveredAt()
                 * .eventType()
                 * .failedAt()
                 * .maxAttempts()
                 * .nextRetryAt()
                 * .payload()
                 * .responseBody()
                 * .responseStatus()
                 * .status()
                 * .webhookConfigId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InnerData =
                    InnerData(
                        checkRequired("id", id),
                        checkRequired("attempts", attempts),
                        checkRequired("createdAt", createdAt),
                        checkRequired("deliveredAt", deliveredAt),
                        checkRequired("eventType", eventType),
                        checkRequired("failedAt", failedAt),
                        checkRequired("maxAttempts", maxAttempts),
                        checkRequired("nextRetryAt", nextRetryAt),
                        checkRequired("payload", payload),
                        checkRequired("responseBody", responseBody),
                        checkRequired("responseStatus", responseStatus),
                        checkRequired("status", status),
                        checkRequired("webhookConfigId", webhookConfigId),
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
                attempts()
                createdAt()
                deliveredAt()
                eventType()
                failedAt()
                maxAttempts()
                nextRetryAt()
                payload().validate()
                responseBody()
                responseStatus()
                status().validate()
                webhookConfigId()
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
                    (if (attempts.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (deliveredAt.asKnown().isPresent) 1 else 0) +
                    (if (eventType.asKnown().isPresent) 1 else 0) +
                    (if (failedAt.asKnown().isPresent) 1 else 0) +
                    (if (maxAttempts.asKnown().isPresent) 1 else 0) +
                    (if (nextRetryAt.asKnown().isPresent) 1 else 0) +
                    (payload.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (responseBody.asKnown().isPresent) 1 else 0) +
                    (if (responseStatus.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (webhookConfigId.asKnown().isPresent) 1 else 0)

            /** Event payload JSON as stored for delivery */
            class Payload
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Payload]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Payload]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(payload: Payload) = apply {
                        additionalProperties = payload.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Payload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Payload = Payload(additionalProperties.toImmutable())
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
                fun validate(): Payload = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Payload && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Payload{additionalProperties=$additionalProperties}"
            }

            /** Delivery status */
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

                    @JvmField val QUEUED = of("QUEUED")

                    @JvmField val DELIVERED = of("DELIVERED")

                    @JvmField val FAILED = of("FAILED")

                    @JvmField val RETRYING = of("RETRYING")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    QUEUED,
                    DELIVERED,
                    FAILED,
                    RETRYING,
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
                    QUEUED,
                    DELIVERED,
                    FAILED,
                    RETRYING,
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
                        QUEUED -> Value.QUEUED
                        DELIVERED -> Value.DELIVERED
                        FAILED -> Value.FAILED
                        RETRYING -> Value.RETRYING
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
                        QUEUED -> Known.QUEUED
                        DELIVERED -> Known.DELIVERED
                        FAILED -> Known.FAILED
                        RETRYING -> Known.RETRYING
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InnerData &&
                    id == other.id &&
                    attempts == other.attempts &&
                    createdAt == other.createdAt &&
                    deliveredAt == other.deliveredAt &&
                    eventType == other.eventType &&
                    failedAt == other.failedAt &&
                    maxAttempts == other.maxAttempts &&
                    nextRetryAt == other.nextRetryAt &&
                    payload == other.payload &&
                    responseBody == other.responseBody &&
                    responseStatus == other.responseStatus &&
                    status == other.status &&
                    webhookConfigId == other.webhookConfigId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    attempts,
                    createdAt,
                    deliveredAt,
                    eventType,
                    failedAt,
                    maxAttempts,
                    nextRetryAt,
                    payload,
                    responseBody,
                    responseStatus,
                    status,
                    webhookConfigId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InnerData{id=$id, attempts=$attempts, createdAt=$createdAt, deliveredAt=$deliveredAt, eventType=$eventType, failedAt=$failedAt, maxAttempts=$maxAttempts, nextRetryAt=$nextRetryAt, payload=$payload, responseBody=$responseBody, responseStatus=$responseStatus, status=$status, webhookConfigId=$webhookConfigId, additionalProperties=$additionalProperties}"
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

        return other is WebhookGetDeliveriesResponse &&
            message == other.message &&
            status == other.status &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(message, status, data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookGetDeliveriesResponse{message=$message, status=$status, data=$data, additionalProperties=$additionalProperties}"
}
