package com.example.product.repository;

import com.example.product.dto.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Slf4j
public class ProductRepository {

    private Map<Long, Product> productMap = new HashMap<>();

    public Product saveProduct(Product product) {
        return productMap.put(product.getProductId(), product);
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productMap.get(product.getProductId());
        if (null != existingProduct) {
            productMap.put(product.getProductId(), product);
        } else {
            log.info("Product does not exist");
        }
        return existingProduct;
    }

    public Product getProductById(Long productId) {
        return productMap.get(productId);
    }

    public Product deleteProductById(Long productId) {
        return productMap.remove(productId);
    }

}


