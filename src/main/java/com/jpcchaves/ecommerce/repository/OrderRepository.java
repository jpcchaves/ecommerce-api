package com.jpcchaves.ecommerce.repository;

import com.jpcchaves.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
