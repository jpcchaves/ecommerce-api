package com.jpcchaves.ecommerce.service.impl;

import com.jpcchaves.ecommerce.entity.Category;
import com.jpcchaves.ecommerce.repository.CategoryRepository;
import com.jpcchaves.ecommerce.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }
}
