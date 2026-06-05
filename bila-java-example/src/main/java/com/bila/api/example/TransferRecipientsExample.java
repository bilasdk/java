package com.bila.api.example;

import com.usebila.api.client.BilaClient;
import com.usebila.api.client.okhttp.BilaOkHttpClient;
import com.usebila.api.models.transferrecipients.TransferRecipientCreateBankAccountParams;
import com.usebila.api.models.transferrecipients.TransferRecipientCreateBankAccountResponse;
import com.usebila.api.models.transferrecipients.TransferRecipientCreateMobileMoneyParams;
import com.usebila.api.models.transferrecipients.TransferRecipientCreateMobileMoneyResponse;
import com.usebila.api.models.transferrecipients.TransferRecipientListParams;
import com.usebila.api.models.transferrecipients.TransferRecipientListResponse;
import com.usebila.api.models.transferrecipients.TransferRecipientRetrieveResponse;

/**
 * Transfer recipients examples
 *
 * <p>To demonstrate how to manage payout recipients for bank accounts and mobile money.
 */
public final class TransferRecipientsExample {

    private static final String RECIPIENT_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";

    private TransferRecipientsExample() {}

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
         * Retrieve transfer recipient
         *********************************************/
        TransferRecipientRetrieveResponse recipient =
                client.transferRecipients().retrieve(RECIPIENT_ID);
        Examples.printJson("retrieve", recipient);

        /********************************************
         * List transfer recipients
         *********************************************/
        TransferRecipientListParams listParams =
                TransferRecipientListParams.builder()
                        .page(1.0)
                        .perPage(50.0)
                        .type(TransferRecipientListParams.Type.BANK_ACCOUNT)
                        .build();

        TransferRecipientListResponse recipients = client.transferRecipients().list(listParams);
        Examples.printJson("list", recipients);

        /********************************************
         * Create bank account recipient
         *********************************************/
        TransferRecipientCreateBankAccountParams bankParams =
                TransferRecipientCreateBankAccountParams.builder()
                        .accountNumber("1234567890")
                        .bankId("bank-001")
                        .accountName("John Doe")
                        .country(TransferRecipientCreateBankAccountParams.Country.ZM)
                        .build();

        TransferRecipientCreateBankAccountResponse bankRecipient =
                client.transferRecipients().createBankAccount(bankParams);
        Examples.printJson("createBankAccount", bankRecipient);

        /********************************************
         * Create mobile money recipient
         *********************************************/
        TransferRecipientCreateMobileMoneyParams mobileParams =
                TransferRecipientCreateMobileMoneyParams.builder()
                        .country(TransferRecipientCreateMobileMoneyParams.Country.ZM)
                        .operator(TransferRecipientCreateMobileMoneyParams.Operator.AIRTEL)
                        .phone("0977433571")
                        .accountName("John Doe")
                        .build();

        TransferRecipientCreateMobileMoneyResponse mobileRecipient =
                client.transferRecipients().createMobileMoney(mobileParams);
        Examples.printJson("createMobileMoney", mobileRecipient);
    }

    private static BilaClient createClient() {
        String apiKey = System.getenv("BILA_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            apiKey = "sk_test_your_api_key_here";
        }

        return BilaOkHttpClient.builder().apiKey(apiKey).sandbox().build();
    }
}
