// File generated from our OpenAPI spec by Stainless.

package com.usebila.api.errors

import com.usebila.api.core.JsonValue
import com.usebila.api.core.http.Headers

abstract class BilaServiceException
protected constructor(message: String, cause: Throwable? = null) : BilaException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
