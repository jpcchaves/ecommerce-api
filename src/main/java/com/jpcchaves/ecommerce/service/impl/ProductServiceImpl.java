package com.jpcchaves.ecommerce.service.impl;

import com.jpcchaves.ecommerce.entity.Product;
import com.jpcchaves.ecommerce.repository.ProductRepository;
import com.jpcchaves.ecommerce.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> searchProducts(String name) {
        return repository.findProductsByNameContainingIgnoreCase(name);
    }
}
