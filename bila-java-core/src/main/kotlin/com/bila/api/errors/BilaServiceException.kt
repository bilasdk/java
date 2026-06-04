// File generated from our OpenAPI spec by Stainless.

package com.bila.api.errors

import com.bila.api.core.JsonValue
import com.bila.api.core.http.Headers

abstract class BilaServiceException
protected constructor(message: String, cause: Throwable? = null) : BilaException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
