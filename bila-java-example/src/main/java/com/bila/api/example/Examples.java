package com.bila.api.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.usebila.api.core.ObjectMappers;

/** Shared helpers for runnable SDK examples. */
final class Examples {

    private Examples() {}

    static void printJson(String label, Object value) throws JsonProcessingException {
        System.out.println(
                label
                        + ": "
                        + ObjectMappers.jsonMapper()
                                .writerWithDefaultPrettyPrinter()
                                .writeValueAsString(value));
    }
}
