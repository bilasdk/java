package com.bila.api.example;

import com.usebila.api.client.BilaClient;
import com.usebila.api.models.webhooks.WebhookCreateParams;
import com.usebila.api.models.webhooks.WebhookCreateResponse;
import com.usebila.api.models.webhooks.WebhookDeactivateResponse;
import com.usebila.api.models.webhooks.WebhookGetDeliveriesParams;
import com.usebila.api.models.webhooks.WebhookGetDeliveriesResponse;
import com.usebila.api.models.webhooks.WebhookListEventsResponse;
import com.usebila.api.models.webhooks.WebhookListResponse;
import com.usebila.api.models.webhooks.WebhookRotateSecretResponse;
import com.usebila.api.models.webhooks.WebhookUpdateParams;
import com.usebila.api.models.webhooks.WebhookUpdateResponse;

/**
 * Webhooks examples
 *
 * <p>To demonstrate how to configure webhooks and manage delivery history.
 */
public final class WebhooksExample {

    private static final String WEBHOOK_ID = "68f11209-451f-4a15-bfcd-d916eb8b09f4";

    private WebhooksExample() {}

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
         * Create webhook
         *********************************************/
        WebhookCreateParams createParams =
                WebhookCreateParams.builder()
                        .addEvent(WebhookCreateParams.Event.PAYMENT_COMPLETED)
                        .addEvent(WebhookCreateParams.Event.WITHDRAWAL_COMPLETED)
                        .addEvent(WebhookCreateParams.Event.TRANSFER_COMPLETED)
                        .url("https://example.com/webhooks")
                        .build();

        WebhookCreateResponse created = client.webhooks().create(createParams);
        Examples.printJson("create", created);

        /********************************************
         * Update webhook
         *********************************************/
        WebhookUpdateParams updateParams =
                WebhookUpdateParams.builder()
                        .addEvent(WebhookUpdateParams.Event.PAYMENT_COMPLETED)
                        .addEvent(WebhookUpdateParams.Event.COLLECTION_COMPLETED)
                        .addEvent(WebhookUpdateParams.Event.TRANSFER_FAILED)
                        .url("https://example.com/webhooks/v2")
                        .isActive(true)
                        .build();

        WebhookUpdateResponse updated = client.webhooks().update(WEBHOOK_ID, updateParams);
        Examples.printJson("update", updated);

        /********************************************
         * List webhooks
         *********************************************/
        WebhookListResponse webhooks = client.webhooks().list();
        Examples.printJson("list", webhooks);

        /********************************************
         * Get webhook deliveries
         *********************************************/
        WebhookGetDeliveriesParams deliveriesParams =
                WebhookGetDeliveriesParams.builder()
                        .startDate("2026-04-01T00:00:00.000Z")
                        .endDate("2026-04-30T23:59:59.999Z")
                        .eventType("payment.completed")
                        .page(1.0)
                        .perPage(20.0)
                        .status("DELIVERED")
                        .build();

        WebhookGetDeliveriesResponse deliveries =
                client.webhooks().getDeliveries(WEBHOOK_ID, deliveriesParams);
        Examples.printJson("getDeliveries", deliveries);

        /********************************************
         * List webhook events
         *********************************************/
        WebhookListEventsResponse events = client.webhooks().listEvents();
        Examples.printJson("listEvents", events);

        /********************************************
         * Rotate webhook secret
         *********************************************/
        WebhookRotateSecretResponse rotated = client.webhooks().rotateSecret(WEBHOOK_ID);
        Examples.printJson("rotateSecret", rotated);

        /********************************************
         * Deactivate webhook
         *********************************************/
        WebhookDeactivateResponse deactivated = client.webhooks().deactivate(WEBHOOK_ID);
        Examples.printJson("deactivate", deactivated);
    }
}
