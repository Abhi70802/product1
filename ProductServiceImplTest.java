package com.example.product;

import com.example.product.dto.Product;
import com.example.product.service.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImplTest {

    @Mock
    private ProductServiceImpl productService;

    @Test
    public void createProductTest(){
        productService.createProduct(getProduct());
    }

    @Test
    public void updateProductTest(){
        productService.updateProduct(getProduct());
    }

    @Test
    public void fetchProductTest(){
        productService.fetchProduct(1L);
    }

    @Test
    public void deleteProductTest(){
        productService.deleteProduct(1L);
    }

    private Product getProduct(){
        Product product = new Product();
        product.setQuantityAvailable(10);
        product.setName("Abhishek");
        product.setPrice(12.00);
        product.setProductId(1L);
        return product;
    }
}
