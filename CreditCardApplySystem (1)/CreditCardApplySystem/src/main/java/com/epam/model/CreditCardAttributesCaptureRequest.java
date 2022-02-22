package com.epam.model;

/**
 * No changes required
 */
public class CreditCardAttributesCaptureRequest {
    private String cardStatus;
    private String profileId;

    public CreditCardAttributesCaptureRequest() {
    }

    public CreditCardAttributesCaptureRequest(String cardStatus, String profileId) {
        this.cardStatus = cardStatus;
        this.profileId = profileId;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @Override
    public String toString() {
        return "CreditCardAttributesCaptureRequest{" +
                "cardStatus='" + cardStatus + '\'' +
                ", profileId='" + profileId + '\'' +
                '}';
    }
}
