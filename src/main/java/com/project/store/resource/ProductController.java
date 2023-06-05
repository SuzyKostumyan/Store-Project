package com.project.store.resource;

import com.project.store.domain.Product;
import com.project.store.enums.ProductType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.store.service.ProductService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/api/products")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(
            @PathVariable Long id
    ) {
        return productService.getProductById(id);
    }

    @GetMapping("/byType")
    public List<Product> getProductByType(
            @RequestParam ProductType productType
    ) {

        return productService.getProductByType(productType);
    }

    @PostMapping
    public Product addProduct(
            @RequestBody Product product
    ) {
        return productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable Long id,
            @RequestBody Product updatedProduct
    ) {
        Product product = productService.updateProduct(id, updatedProduct);

        return product;
    }
}
