package com.jpcchaves.ecommerce.payload.dto;

import com.jpcchaves.ecommerce.entity.Order;
import com.jpcchaves.ecommerce.entity.Payment;

public class OrderRequestDto {
    private Order order;
    private Payment payment;

    public OrderRequestDto() {
    }

    public OrderRequestDto(Order order,
                           Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
