package com.jpcchaves.ecommerce.repository;

import com.jpcchaves.ecommerce.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
