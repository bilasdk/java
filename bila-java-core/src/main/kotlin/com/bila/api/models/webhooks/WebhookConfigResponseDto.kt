// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.webhooks

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
import kotlin.jvm.optionals.getOrNull

class WebhookConfigResponseDto
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val events: JsonField<List<String>>,
    private val isActive: JsonField<Boolean>,
    private val merchantId: JsonField<String>,
    private val secret: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("events") @ExcludeMissing events: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("isActive") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("merchantId")
        @ExcludeMissing
        merchantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secret") @ExcludeMissing secret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(id, createdAt, events, isActive, merchantId, secret, updatedAt, url, mutableMapOf())

    /**
     * Webhook config UUID
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Subscribed event types
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<String> = events.getRequired("events")

    /**
     * Whether the webhook is active
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isActive(): Boolean = isActive.getRequired("isActive")

    /**
     * Merchant UUID
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantId(): String = merchantId.getRequired("merchantId")

    /**
     * Signing secret; plaintext only on create/rotate-secret, otherwise masked
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secret(): String = secret.getRequired("secret")

    /**
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Webhook endpoint URL
     *
     * @throws BilaInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<String>> = events

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [merchantId].
     *
     * Unlike [merchantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchantId") @ExcludeMissing fun _merchantId(): JsonField<String> = merchantId

    /**
     * Returns the raw JSON value of [secret].
     *
     * Unlike [secret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /**
         * Returns a mutable builder for constructing an instance of [WebhookConfigResponseDto].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .events()
         * .isActive()
         * .merchantId()
         * .secret()
         * .updatedAt()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookConfigResponseDto]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var events: JsonField<MutableList<String>>? = null
        private var isActive: JsonField<Boolean>? = null
        private var merchantId: JsonField<String>? = null
        private var secret: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var url: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookConfigResponseDto: WebhookConfigResponseDto) = apply {
            id = webhookConfigResponseDto.id
            createdAt = webhookConfigResponseDto.createdAt
            events = webhookConfigResponseDto.events.map { it.toMutableList() }
            isActive = webhookConfigResponseDto.isActive
            merchantId = webhookConfigResponseDto.merchantId
            secret = webhookConfigResponseDto.secret
            updatedAt = webhookConfigResponseDto.updatedAt
            url = webhookConfigResponseDto.url
            additionalProperties = webhookConfigResponseDto.additionalProperties.toMutableMap()
        }

        /** Webhook config UUID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Subscribed event types */
        fun events(events: List<String>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun events(events: JsonField<List<String>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: String) = apply {
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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** Merchant UUID */
        fun merchantId(merchantId: String) = merchantId(JsonField.of(merchantId))

        /**
         * Sets [Builder.merchantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchantId(merchantId: JsonField<String>) = apply { this.merchantId = merchantId }

        /** Signing secret; plaintext only on create/rotate-secret, otherwise masked */
        fun secret(secret: String) = secret(JsonField.of(secret))

        /**
         * Sets [Builder.secret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secret] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun secret(secret: JsonField<String>) = apply { this.secret = secret }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Webhook endpoint URL */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [WebhookConfigResponseDto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .events()
         * .isActive()
         * .merchantId()
         * .secret()
         * .updatedAt()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookConfigResponseDto =
            WebhookConfigResponseDto(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("isActive", isActive),
                checkRequired("merchantId", merchantId),
                checkRequired("secret", secret),
                checkRequired("updatedAt", updatedAt),
                checkRequired("url", url),
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
    fun validate(): WebhookConfigResponseDto = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        events()
        isActive()
        merchantId()
        secret()
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (events.asKnown().getOrNull()?.size ?: 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (merchantId.asKnown().isPresent) 1 else 0) +
            (if (secret.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookConfigResponseDto &&
            id == other.id &&
            createdAt == other.createdAt &&
            events == other.events &&
            isActive == other.isActive &&
            merchantId == other.merchantId &&
            secret == other.secret &&
            updatedAt == other.updatedAt &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            events,
            isActive,
            merchantId,
            secret,
            updatedAt,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookConfigResponseDto{id=$id, createdAt=$createdAt, events=$events, isActive=$isActive, merchantId=$merchantId, secret=$secret, updatedAt=$updatedAt, url=$url, additionalProperties=$additionalProperties}"
}
