package com.jpcchaves.ecommerce.repository;

import com.jpcchaves.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
