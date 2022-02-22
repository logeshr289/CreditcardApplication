package com.epam.service;

import com.epam.model.CreditCardApplyResponse;
import com.epam.model.CreditCardAttributesCaptureRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
    * Change is required here.
    * EndClient calling the below method buildCreditCardAttributesCaptureRequest as it needs build a new request &
    * change the below status(which we received it from CreditCardApplyResponseSystem) and build a new requestList
    * by changing the 'status' to below status codes required for our system to complete the process.
    * oldstatuscode -- new status code
    * PENDING -- CARD_PENDING
    * APPROVED -- CARD_APPROVED(Used for ID(Instant Decision) indicates the application is approved and customer account being created)
    * COMPLETED -- CARD_APPROVED(Used for ID(Instant Credit) indicates the application is approved and completion of customer account creation)
    * DUPLICATE_APPLICATION -- CARD_DECLINED
    * EXISTING_ACCOUNT -- CARD_DECLINED
    * DECLINED -- CARD_DECLINED
    * CANCEL -- ERROR
 */
public class CreditCardApplyService {

    public List<CreditCardAttributesCaptureRequest> buildCreditCardAttributesCaptureRequest(List<CreditCardApplyResponse> creditCardApplyResponse) {
        List<CreditCardAttributesCaptureRequest> cardAttributesCaptureRequests = new ArrayList<>();
        for(CreditCardApplyResponse response : creditCardApplyResponse){
            CreditCardAttributesCaptureRequest creditCardAttributesCaptureRequest = new CreditCardAttributesCaptureRequest();
            /**
             * Need to change the status here, dont keep elseif conditions to set the new status code values
             * based on the above old status to new status
             */
            
            Map<String,String> map=new HashMap<>();
            map.put("PENDING","CARD_PENDING");  
            map.put("APPROVED","CARD_APPROVED");  
            map.put("COMPLETED","CARD_APPROVED");  
            map.put("DUPLICATE_APPLICATION","CARD_DECLINED");
            map.put("EXISTING_ACCOUNT","CARD_DECLINED");
            map.put("DECLINED","CARD_DECLINED");
            map.put("CANCEL","ERROR");
            
            creditCardAttributesCaptureRequest.setCardStatus(map.get(response.getStatus()));
            creditCardAttributesCaptureRequest.setProfileId(response.getApplicationId());
            cardAttributesCaptureRequests.add(creditCardAttributesCaptureRequest);
        }
        return cardAttributesCaptureRequests;
    }

}
