package com.bila.api.example;

import com.usebila.api.client.BilaClient;
import com.usebila.api.models.accounts.AccountGetBalanceResponse;
import com.usebila.api.models.accounts.AccountListParams;
import com.usebila.api.models.accounts.AccountListResponse;
import com.usebila.api.models.accounts.AccountRetrieveResponse;

/**
 * Accounts examples
 *
 * <p>To demonstrate how to retrieve accounts, list accounts, and check balances.
 */
public final class AccountsExample {

    private static final String ACCOUNT_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";

    private AccountsExample() {}

    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void run() throws Exception {
        BilaClient client = Examples.createClient();

        /********************************************
         * Retrieve account
         *********************************************/
        AccountRetrieveResponse account = client.accounts().retrieve(ACCOUNT_ID);
        Examples.printJson("retrieve", account);

        /********************************************
         * List accounts
         *********************************************/
        AccountListParams listParams =
                AccountListParams.builder().page(1.0).perPage(50.0).build();

        AccountListResponse accounts = client.accounts().list(listParams);
        Examples.printJson("list", accounts);

        /********************************************
         * Get account balance
         *********************************************/
        AccountGetBalanceResponse balance = client.accounts().getBalance(ACCOUNT_ID);
        Examples.printJson("getBalance", balance);
    }
}
