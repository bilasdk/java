package com.bila.api.example;

import com.usebila.api.client.BilaClient;
import com.usebila.api.client.okhttp.BilaOkHttpClient;
import com.usebila.api.models.transfers.TransferGetStatusByReferenceResponse;
import com.usebila.api.models.transfers.TransferInitiateBankTransferParams;
import com.usebila.api.models.transfers.TransferInitiateBankTransferResponse;
import com.usebila.api.models.transfers.TransferInitiateMobileMoneyTransferParams;
import com.usebila.api.models.transfers.TransferInitiateMobileMoneyTransferResponse;
import com.usebila.api.models.transfers.TransferListParams;
import com.usebila.api.models.transfers.TransferListResponse;
import com.usebila.api.models.transfers.TransferRetrieveResponse;

/**
 * Transfers examples
 *
 * <p>To demonstrate how to send payouts via bank transfer and mobile money.
 */
public final class TransfersExample {

    private static final String TRANSFER_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";
    private static final String ACCOUNT_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";
    private static final String TRANSFER_RECIPIENT_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";
    private static final String WALLET_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";
    private static final String BANK_REFERENCE = "transfer-001";
    private static final String MOBILE_REFERENCE = "mobile-transfer-001";

    private TransfersExample() {}

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
         * Retrieve transfer
         *********************************************/
        TransferRetrieveResponse transfer = client.transfers().retrieve(TRANSFER_ID);
        Examples.printJson("retrieve", transfer);

        /********************************************
         * List transfers
         *********************************************/
        TransferListParams listParams =
                TransferListParams.builder()
                        .accountId(ACCOUNT_ID)
                        .startDate("2024-01-01T00:00:00Z")
                        .endDate("2024-12-31T23:59:59Z")
                        .page(1.0)
                        .perPage(50.0)
                        .status(TransferListParams.Status.PENDING)
                        .type(TransferListParams.Type.BANK_ACCOUNT)
                        .build();

        TransferListResponse transfers = client.transfers().list(listParams);
        Examples.printJson("list", transfers);

        /********************************************
         * Get transfer status by reference
         *********************************************/
        TransferGetStatusByReferenceResponse status =
                client.transfers().getStatusByReference(BANK_REFERENCE);
        Examples.printJson("getStatusByReference", status);

        /********************************************
         * Initiate bank transfer
         *********************************************/
        TransferInitiateBankTransferParams bankParams =
                TransferInitiateBankTransferParams.builder()
                        .accountId(ACCOUNT_ID)
                        .amount(1000.0)
                        .reference(BANK_REFERENCE)
                        .accountNumber("1234567890")
                        .bankId("bank-001")
                        .country(TransferInitiateBankTransferParams.Country.ZM)
                        .narration("Payment for services")
                        .recipientName("Jane Doe")
                        .transferRecipientId(TRANSFER_RECIPIENT_ID)
                        .walletId(WALLET_ID)
                        .build();

        TransferInitiateBankTransferResponse bankTransfer =
                client.transfers().initiateBankTransfer(bankParams);
        Examples.printJson("initiateBankTransfer", bankTransfer);

        /********************************************
         * Initiate mobile money transfer
         *********************************************/
        TransferInitiateMobileMoneyTransferParams mobileParams =
                TransferInitiateMobileMoneyTransferParams.builder()
                        .amount(250.0)
                        .country(TransferInitiateMobileMoneyTransferParams.Country.ZM)
                        .operator(TransferInitiateMobileMoneyTransferParams.Operator.AIRTEL)
                        .phone("0977433571")
                        .reference(MOBILE_REFERENCE)
                        .narration("Mobile money payout")
                        .recipientName("Jane Doe")
                        .walletId(WALLET_ID)
                        .build();

        TransferInitiateMobileMoneyTransferResponse mobileTransfer =
                client.transfers().initiateMobileMoneyTransfer(mobileParams);
        Examples.printJson("initiateMobileMoneyTransfer", mobileTransfer);
    }

    private static BilaClient createClient() {
        String apiKey = System.getenv("BILA_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            apiKey = "sk_test_your_api_key_here";
        }

        return BilaOkHttpClient.builder().apiKey(apiKey).sandbox().build();
    }
}
