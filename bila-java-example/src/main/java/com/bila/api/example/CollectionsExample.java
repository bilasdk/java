package com.bila.api.example;

import com.usebila.api.client.BilaClient;
import com.usebila.api.client.okhttp.BilaOkHttpClient;
import com.usebila.api.models.collections.CollectionGetStatusByReferenceResponse;
import com.usebila.api.models.collections.CollectionInitiateMobileMoneyCollectionParams;
import com.usebila.api.models.collections.CollectionInitiateMobileMoneyCollectionResponse;
import com.usebila.api.models.collections.CollectionListParams;
import com.usebila.api.models.collections.CollectionListResponse;
import com.usebila.api.models.collections.CollectionRetrieveResponse;

/**
 * Collections examples
 *
 * <p>To demonstrate how to make collects via mobile money.
 */
public final class CollectionsExample {

    private static final String COLLECTION_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";
    private static final String WALLET_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";
    private static final String REFERENCE = "collection-001";

    private CollectionsExample() {}

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
         * Retrieve collection
         *********************************************/
        CollectionRetrieveResponse collection = client.collections().retrieve(COLLECTION_ID);
        Examples.printJson("retrieve", collection);

        /********************************************
         * List collections
         *********************************************/
        CollectionListParams listParams = CollectionListParams.builder()
                .accountId(WALLET_ID)
                .startDate("2024-01-01T00:00:00Z")
                .endDate("2024-12-31T23:59:59Z")
                .page(1.0)
                .perPage(50.0)
                .status(CollectionListParams.Status.PENDING)
                .build();

        CollectionListResponse collections = client.collections().list(listParams);
        Examples.printJson("list", collections);

        /********************************************
         * Get collection status by reference
         *********************************************/
        CollectionGetStatusByReferenceResponse status = client.collections().getStatusByReference(REFERENCE);
        Examples.printJson("getStatusByReference", status);

        /********************************************
         * Initiate mobile money collection
         *********************************************/
        CollectionInitiateMobileMoneyCollectionParams initiateParams =
                CollectionInitiateMobileMoneyCollectionParams.builder()
                        .amount(100.5)
                        .country(CollectionInitiateMobileMoneyCollectionParams.Country.ZM)
                        .operator(CollectionInitiateMobileMoneyCollectionParams.Operator.AIRTEL)
                        .phone("0977433571")
                        .reference(REFERENCE)
                        .walletId(WALLET_ID)
                        .bearer(CollectionInitiateMobileMoneyCollectionParams.Bearer.CUSTOMER)
                        .customerName("John Doe")
                        .narration("Payment for subscription")
                        .build();

        CollectionInitiateMobileMoneyCollectionResponse initiated =
                client.collections().initiateMobileMoneyCollection(initiateParams);
        Examples.printJson("initiateMobileMoneyCollection", initiated);
    }

    private static BilaClient createClient() {
        String apiKey = System.getenv("BILA_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            apiKey = "sk_test_your_api_key_here";
        }

        return BilaOkHttpClient.builder().apiKey(apiKey).sandbox().build();
    }
}
