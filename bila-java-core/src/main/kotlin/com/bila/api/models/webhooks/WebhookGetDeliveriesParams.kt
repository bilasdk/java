// File generated from our OpenAPI spec by Stainless.

package com.bila.api.models.webhooks

import com.bila.api.core.Params
import com.bila.api.core.http.Headers
import com.bila.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get delivery history */
class WebhookGetDeliveriesParams
private constructor(
    private val id: String?,
    private val endDate: String?,
    private val eventType: String?,
    private val page: Double?,
    private val perPage: Double?,
    private val startDate: String?,
    private val status: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** ISO 8601 end of createdAt range (inclusive) */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /** Filter by event type */
    fun eventType(): Optional<String> = Optional.ofNullable(eventType)

    /** Page number */
    fun page(): Optional<Double> = Optional.ofNullable(page)

    /** Items per page */
    fun perPage(): Optional<Double> = Optional.ofNullable(perPage)

    /** ISO 8601 start of createdAt range (inclusive) */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** Filter by status (QUEUED, DELIVERED, FAILED, RETRYING) */
    fun status(): Optional<String> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WebhookGetDeliveriesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [WebhookGetDeliveriesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookGetDeliveriesParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var endDate: String? = null
        private var eventType: String? = null
        private var page: Double? = null
        private var perPage: Double? = null
        private var startDate: String? = null
        private var status: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(webhookGetDeliveriesParams: WebhookGetDeliveriesParams) = apply {
            id = webhookGetDeliveriesParams.id
            endDate = webhookGetDeliveriesParams.endDate
            eventType = webhookGetDeliveriesParams.eventType
            page = webhookGetDeliveriesParams.page
            perPage = webhookGetDeliveriesParams.perPage
            startDate = webhookGetDeliveriesParams.startDate
            status = webhookGetDeliveriesParams.status
            additionalHeaders = webhookGetDeliveriesParams.additionalHeaders.toBuilder()
            additionalQueryParams = webhookGetDeliveriesParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** ISO 8601 end of createdAt range (inclusive) */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /** Filter by event type */
        fun eventType(eventType: String?) = apply { this.eventType = eventType }

        /** Alias for calling [Builder.eventType] with `eventType.orElse(null)`. */
        fun eventType(eventType: Optional<String>) = eventType(eventType.getOrNull())

        /** Page number */
        fun page(page: Double?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Double) = page(page as Double?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Double>) = page(page.getOrNull())

        /** Items per page */
        fun perPage(perPage: Double?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Double) = perPage(perPage as Double?)

        /** Alias for calling [Builder.perPage] with `perPage.orElse(null)`. */
        fun perPage(perPage: Optional<Double>) = perPage(perPage.getOrNull())

        /** ISO 8601 start of createdAt range (inclusive) */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        /** Filter by status (QUEUED, DELIVERED, FAILED, RETRYING) */
        fun status(status: String?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

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
         * Returns an immutable instance of [WebhookGetDeliveriesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WebhookGetDeliveriesParams =
            WebhookGetDeliveriesParams(
                id,
                endDate,
                eventType,
                page,
                perPage,
                startDate,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endDate?.let { put("endDate", it) }
                eventType?.let { put("eventType", it) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("perPage", it.toString()) }
                startDate?.let { put("startDate", it) }
                status?.let { put("status", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookGetDeliveriesParams &&
            id == other.id &&
            endDate == other.endDate &&
            eventType == other.eventType &&
            page == other.page &&
            perPage == other.perPage &&
            startDate == other.startDate &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            endDate,
            eventType,
            page,
            perPage,
            startDate,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "WebhookGetDeliveriesParams{id=$id, endDate=$endDate, eventType=$eventType, page=$page, perPage=$perPage, startDate=$startDate, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
