// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.models.transfers

import com.fasterxml.jackson.annotation.JsonCreator
import com.usebila.api.core.Enum
import com.usebila.api.core.JsonField
import com.usebila.api.core.Params
import com.usebila.api.core.http.Headers
import com.usebila.api.core.http.QueryParams
import com.usebila.api.errors.BilaInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a paginated list of transfers/payouts for the authenticated merchant */
class TransferListParams
private constructor(
    private val accountId: String?,
    private val endDate: String?,
    private val page: Double?,
    private val perPage: Double?,
    private val startDate: String?,
    private val status: Status?,
    private val type: Type?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by account ID */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    /** Filter by end date (ISO 8601) */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /** Page number (default: 1) */
    fun page(): Optional<Double> = Optional.ofNullable(page)

    /** Items per page (default: 50) */
    fun perPage(): Optional<Double> = Optional.ofNullable(perPage)

    /** Filter by start date (ISO 8601) */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** Filter by transfer status */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** Filter by transfer type */
    fun type(): Optional<Type> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TransferListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TransferListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransferListParams]. */
    class Builder internal constructor() {

        private var accountId: String? = null
        private var endDate: String? = null
        private var page: Double? = null
        private var perPage: Double? = null
        private var startDate: String? = null
        private var status: Status? = null
        private var type: Type? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(transferListParams: TransferListParams) = apply {
            accountId = transferListParams.accountId
            endDate = transferListParams.endDate
            page = transferListParams.page
            perPage = transferListParams.perPage
            startDate = transferListParams.startDate
            status = transferListParams.status
            type = transferListParams.type
            additionalHeaders = transferListParams.additionalHeaders.toBuilder()
            additionalQueryParams = transferListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by account ID */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        /** Filter by end date (ISO 8601) */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /** Page number (default: 1) */
        fun page(page: Double?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Double) = page(page as Double?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Double>) = page(page.getOrNull())

        /** Items per page (default: 50) */
        fun perPage(perPage: Double?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Double) = perPage(perPage as Double?)

        /** Alias for calling [Builder.perPage] with `perPage.orElse(null)`. */
        fun perPage(perPage: Optional<Double>) = perPage(perPage.getOrNull())

        /** Filter by start date (ISO 8601) */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        /** Filter by transfer status */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /** Filter by transfer type */
        fun type(type: Type?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<Type>) = type(type.getOrNull())

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
         * Returns an immutable instance of [TransferListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TransferListParams =
            TransferListParams(
                accountId,
                endDate,
                page,
                perPage,
                startDate,
                status,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accountId?.let { put("accountId", it) }
                endDate?.let { put("endDate", it) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("perPage", it.toString()) }
                startDate?.let { put("startDate", it) }
                status?.let { put("status", it.toString()) }
                type?.let { put("type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by transfer status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            SUCCESSFUL,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                SUCCESSFUL -> Value.SUCCESSFUL
                FAILED -> Value.FAILED
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
                PENDING -> Known.PENDING
                SUCCESSFUL -> Known.SUCCESSFUL
                FAILED -> Known.FAILED
                else -> throw BilaInvalidDataException("Unknown Status: $value")
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

    /** Filter by transfer type */
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

        return other is TransferListParams &&
            accountId == other.accountId &&
            endDate == other.endDate &&
            page == other.page &&
            perPage == other.perPage &&
            startDate == other.startDate &&
            status == other.status &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountId,
            endDate,
            page,
            perPage,
            startDate,
            status,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TransferListParams{accountId=$accountId, endDate=$endDate, page=$page, perPage=$perPage, startDate=$startDate, status=$status, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
