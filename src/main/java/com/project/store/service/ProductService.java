package com.project.store.service;

import com.project.store.domain.Product;
import com.project.store.enums.ProductType;
import com.project.store.exception.NotFoundException;
import com.project.store.repository.ProductRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Component
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Product not found with ID: " + id));
    }

    public List<Product> getProductByType(ProductType productType) {

        return productRepository.findByProductType(productType);

    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Product not found with ID: " + id));

        product.setSerialNumber(updatedProduct.getSerialNumber());
        product.setManufacturer(updatedProduct.getManufacturer());
        product.setPrice(updatedProduct.getPrice());
        product.setQuantity(updatedProduct.getQuantity());

        return productRepository.save(product);
    }
}
