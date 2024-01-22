package com.example.product.service;

import com.example.product.dto.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }


    @Override
    public Product createProduct(Product product) {
        return repository.saveProduct(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.updateProduct(product);
    }

    @Override
    public Product fetchProduct(Long productId) {
        return repository.getProductById(productId);
    }

    @Override
    public Product deleteProduct(Long productId) {
        return repository.deleteProductById(productId);
    }
}
