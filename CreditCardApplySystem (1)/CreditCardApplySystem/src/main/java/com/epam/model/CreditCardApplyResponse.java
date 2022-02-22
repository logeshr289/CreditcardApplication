package com.epam.model;

/**
 * No changes required
 */
public class CreditCardApplyResponse {

    private String applicationId;
    private String status;
    private String approvedAmount;

    CreditCardApplyResponse() {

    }

    public CreditCardApplyResponse(String applicationId, String status, String approvedAmount) {
        this.applicationId = applicationId;
        this.status = status;
        this.approvedAmount = approvedAmount;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(String approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    @Override
    public String toString() {
        return "CreditCardApplyResponse{" +
                "applicationId='" + applicationId + '\'' +
                ", status='" + status + '\'' +
                ", approvedAmount='" + approvedAmount + '\'' +
                '}';
    }
}
