package com.example.product.service;

import com.example.product.dto.Product;

public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct(Product product);

    Product fetchProduct(Long productId);

    Product deleteProduct(Long productId);
}
