package com.hemanth.simplewebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents a product with an ID, name, and price.
 */
@Data
@AllArgsConstructor
public class Product {
    
    /**
     * The ID of the product.
     */
    private int prodId;
    
    /**
     * The name of the product.
     */
    private String prodName;
    
    /**
     * The price of the product.
     */
    private int price;

}
