package com.bila.api.example;

/**
 * Prints instructions for running the Bila JVM SDK examples.
 */
public final class Main {

    private Main() {}

    public static void main(String[] args) {
        System.out.println("Bila JVM SDK examples");
        System.out.println();
        System.out.println("Set your API key, then run a specific example:");
        System.out.println();
        System.out.println("  export BILA_API_KEY=sk_test_your_api_key_here");
        System.out.println("  ./gradlew :bila-java-example:run -Pexample=Accounts");
        System.out.println();
        System.out.println("Available examples:");
        System.out.println("  Accounts            - Retrieve accounts, list accounts, and check balances");
        System.out.println("  Banks               - List supported banks and financial institutions");
        System.out.println("  Collections         - Collect payments via mobile money");
        System.out.println("  Resolve             - Verify bank account and mobile money details");
        System.out.println("  Transactions        - Retrieve and list transaction history");
        System.out.println("  TransferRecipients  - Manage payout recipients");
        System.out.println("  Transfers           - Send payouts via bank transfer and mobile money");
        System.out.println("  Webhooks            - Configure webhooks and manage delivery history");
        System.out.println();
        System.out.println("Replace the -Pexample value with any name from the list above.");
    }
}
