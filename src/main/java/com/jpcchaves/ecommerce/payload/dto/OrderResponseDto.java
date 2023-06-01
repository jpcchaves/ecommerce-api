package com.jpcchaves.ecommerce.payload.dto;

public class OrderResponseDto {
    private String orderTrackingNumber;
    private String status;
    private String message;

    public OrderResponseDto() {
    }

    public OrderResponseDto(String orderTrackingNumber,
                            String status,
                            String message) {
        this.orderTrackingNumber = orderTrackingNumber;
        this.status = status;
        this.message = message;
    }

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
