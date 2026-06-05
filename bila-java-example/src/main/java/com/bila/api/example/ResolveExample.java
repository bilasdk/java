package com.bila.api.example;

import com.usebila.api.client.BilaClient;
import com.usebila.api.models.resolve.ResolveBankAccountParams;
import com.usebila.api.models.resolve.ResolveBankAccountResponse;
import com.usebila.api.models.resolve.ResolveMobileMoneyParams;
import com.usebila.api.models.resolve.ResolveMobileMoneyResponse;

/**
 * Resolve examples
 *
 * <p>To demonstrate how to verify bank account and mobile money account details.
 */
public final class ResolveExample {

    private ResolveExample() {}

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
         * Resolve bank account
         *********************************************/
        ResolveBankAccountParams resolveBankParams =
                ResolveBankAccountParams.builder()
                        .accountNumber("1234567890")
                        .bankId("bank-001")
                        .country(ResolveBankAccountParams.Country.ZM)
                        .build();

        ResolveBankAccountResponse bankAccount = client.resolve().bankAccount(resolveBankParams);
        Examples.printJson("bankAccount", bankAccount);

        /********************************************
         * Resolve mobile money
         *********************************************/
        ResolveMobileMoneyParams resolveMobileParams =
                ResolveMobileMoneyParams.builder()
                        .country(ResolveMobileMoneyParams.Country.ZM)
                        .operator(ResolveMobileMoneyParams.Operator.AIRTEL)
                        .phone("0977433571")
                        .build();

        ResolveMobileMoneyResponse mobileMoney = client.resolve().mobileMoney(resolveMobileParams);
        Examples.printJson("mobileMoney", mobileMoney);
    }
}
