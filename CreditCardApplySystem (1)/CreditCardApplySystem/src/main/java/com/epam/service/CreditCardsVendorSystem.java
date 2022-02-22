package com.epam.service;

import com.epam.model.CreditCardApplyResponse;

import java.util.Arrays;
import java.util.List;

/**
 * No changes required
 */
public class CreditCardsVendorSystem {

    public static List<CreditCardApplyResponse> getCreditCardResponseFromSystem() {
       return Arrays.asList(new CreditCardApplyResponse("APP9098", "PENDING", "50000"),
                new CreditCardApplyResponse("APP9099", "APPROVED", "120000"),
                new CreditCardApplyResponse("APP9768", "COMPLETED", "75000"),
                new CreditCardApplyResponse("APP7814", "EXISTING_ACCOUNT", "20000"),
                new CreditCardApplyResponse("APP7191", "PENDING", "30000"),
                new CreditCardApplyResponse("APP3201", "COMPLETED", "10000"),
                new CreditCardApplyResponse("APP6531", "DECLINED", "125000"),
                new CreditCardApplyResponse("APP1602", "DUPLICATE_APPLICATION", "80000"),
                new CreditCardApplyResponse("APP1602", "CANCEL", "50000"));
    }

}
