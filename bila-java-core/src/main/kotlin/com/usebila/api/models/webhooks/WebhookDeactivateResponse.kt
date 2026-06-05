// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.usebila.api.core.ExcludeMissing
import com.usebila.api.core.JsonField
import com.usebila.api.core.JsonMissing
import com.usebila.api.core.JsonValue
import com.usebila.api.core.checkRequired
import com.usebila.api.errors.BilaInvalidDataException
import java.util.Collections
import java.util.Objects

class WebhookDeactivateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val message: JsonField<String>,
    private val status: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Boolean> = JsonMissing.of(),
    ) : this(message, status, mutableMapOf())

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
         * Returns a mutable builder for constructing an instance of [WebhookDeactivateResponse].
         *
         * The following fields are required:
         * ```java
         * .message()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookDeactivateResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String>? = null
        private var status: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookDeactivateResponse: WebhookDeactivateResponse) = apply {
            message = webhookDeactivateResponse.message
            status = webhookDeactivateResponse.status
            additionalProperties = webhookDeactivateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [WebhookDeactivateResponse].
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
        fun build(): WebhookDeactivateResponse =
            WebhookDeactivateResponse(
                checkRequired("message", message),
                checkRequired("status", status),
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
    fun validate(): WebhookDeactivateResponse = apply {
        if (validated) {
            return@apply
        }

        message()
        status()
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
        (if (message.asKnown().isPresent) 1 else 0) + (if (status.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookDeactivateResponse &&
            message == other.message &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(message, status, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookDeactivateResponse{message=$message, status=$status, additionalProperties=$additionalProperties}"
}
