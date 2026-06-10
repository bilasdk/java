package com.bila.api.example;

import com.usebila.api.client.BilaClient;
import com.usebila.api.client.okhttp.BilaOkHttpClient;
import com.usebila.api.models.transactions.TransactionListParams;
import com.usebila.api.models.transactions.TransactionListResponse;
import com.usebila.api.models.transactions.TransactionRetrieveResponse;

/**
 * Transactions examples
 *
 * <p>To demonstrate how to retrieve and list transaction history.
 */
public final class TransactionsExample {

    private static final String TRANSACTION_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";
    private static final String ACCOUNT_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";

    private TransactionsExample() {}

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

        /********************************************
         * Retrieve transaction
         *********************************************/
        TransactionRetrieveResponse transaction = client.transactions().retrieve(TRANSACTION_ID);
        Examples.printJson("retrieve", transaction);

        /********************************************
         * List transactions
         *********************************************/
        TransactionListParams listParams = TransactionListParams.builder()
                .accountId(ACCOUNT_ID)
                .startDate("2024-01-01T00:00:00Z")
                .endDate("2024-12-31T23:59:59Z")
                .page(1.0)
                .perPage(50.0)
                .type(TransactionListParams.Type.CREDIT)
                .build();

        TransactionListResponse transactions = client.transactions().list(listParams);
        Examples.printJson("list", transactions);
    }

    private static BilaClient createClient() {
        String apiKey = System.getenv("BILA_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            apiKey = "sk_test_your_api_key_here";
        }

        return BilaOkHttpClient.builder().apiKey(apiKey).sandbox().build();
    }
}
