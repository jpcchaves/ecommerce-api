package com.jpcchaves.ecommerce.service;

import com.jpcchaves.ecommerce.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String name);
}
