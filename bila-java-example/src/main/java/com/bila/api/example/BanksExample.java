package com.bila.api.example;

import com.usebila.api.client.BilaClient;
import com.usebila.api.client.okhttp.BilaOkHttpClient;
import com.usebila.api.models.banks.BankListParams;
import com.usebila.api.models.banks.BankListResponse;

/**
 * Banks examples
 *
 * <p>To demonstrate how to list supported banks and financial institutions.
 */
public final class BanksExample {

    private BanksExample() {}

    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void run() throws Exception {
        BilaClient client = createClient();

        BankListParams listParams = BankListParams.builder().country("zm").build();

        BankListResponse banks = client.banks().list(listParams);
        Examples.printJson("list", banks);
    }

    private static BilaClient createClient() {
        String apiKey = System.getenv("BILA_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            apiKey = "sk_test_your_api_key_here";
        }

        return BilaOkHttpClient.builder().apiKey(apiKey).sandbox().build();
    }
}
