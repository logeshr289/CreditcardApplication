package com.epam;

import com.epam.model.CreditCardApplyResponse;
import com.epam.model.CreditCardAttributesCaptureRequest;
import com.epam.service.CreditCardApplyService;
import com.epam.service.CreditCardsVendorSystem;

import java.util.List;

/**
 * No change is required here.
 * This EndClient has make a call to @{@link CreditCardsVendorSystem} where all the customers will
 * apply for a credit card in that particular system & after BG check(CIBIL score), and It will give the
 * responseList(List<{@link CreditCardApplyResponse}>) of all the customers who have applied for their
 * credit cards.
 *
 */
public class EndClient {

    public static void main(String[] args) {
        List<CreditCardApplyResponse> creditCardApplyResponse = CreditCardsVendorSystem.getCreditCardResponseFromSystem();
        CreditCardApplyService creditCardApplyService = new CreditCardApplyService();
        /**
         * The below {@link List<CreditCardAttributesCaptureRequest>} will be used by our system
         * to complete the process
         */
        List<CreditCardAttributesCaptureRequest> creditCardAttributesCaptureRequest = creditCardApplyService.buildCreditCardAttributesCaptureRequest(creditCardApplyResponse);
        System.out.println(creditCardAttributesCaptureRequest);
    }

}
