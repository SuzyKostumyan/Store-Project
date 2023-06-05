package com.project.store.domain;

import com.project.store.enums.FormFactor;
import com.project.store.enums.ProductType;
import com.project.store.enums.ScreenSize;
import java.io.Serializable;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author admin
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "products", schema = "public")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serialNumber;

    private String manufacturer;

    private double price;

    private int quantity;
    
    @Enumerated(EnumType.STRING)
    private ProductType productType;
    
    private int volume;
    
    private double diagonal;
    
    private ScreenSize screenSize;
    
    private FormFactor formFactor;
}
