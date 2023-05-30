package com.jpcchaves.ecommerce.controller;

import com.jpcchaves.ecommerce.entity.Product;
import com.jpcchaves.ecommerce.service.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Product>> searchProducts(@PathParam("name") String name) {
        return ResponseEntity.status(HttpStatus.OK).body(service.searchProducts(name));
    }
}
