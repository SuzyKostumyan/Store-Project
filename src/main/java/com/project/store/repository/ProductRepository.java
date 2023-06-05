package com.project.store.repository;

import com.project.store.domain.Product;
import com.project.store.enums.ProductType;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByProductType(ProductType productType);
}
