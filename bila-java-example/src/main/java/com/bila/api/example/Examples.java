package com.bila.api.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.usebila.api.client.BilaClient;
import com.usebila.api.client.okhttp.BilaOkHttpClient;
import com.usebila.api.core.ObjectMappers;

/** Shared helpers for runnable SDK examples. */
final class Examples {

    private Examples() {}

    static BilaClient createClient() {
        String apiKey = System.getenv("BILA_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            apiKey = "sk_test_your_api_key_here";
        }

        return BilaOkHttpClient.builder().apiKey(apiKey).sandbox().build();
    }

    static void printJson(String label, Object value) throws JsonProcessingException {
        System.out.println(
                label
                        + ": "
                        + ObjectMappers.jsonMapper()
                                .writerWithDefaultPrettyPrinter()
                                .writeValueAsString(value));
    }
}
