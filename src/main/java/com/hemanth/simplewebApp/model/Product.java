package com.hemanth.simplewebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents a product with an ID, name, and price.
 */
@Data
@AllArgsConstructor
@Entity
public class Product {
    
    public Product() {
        //TODO Auto-generated constructor stub
    }

 
    @Id
    private int prodId;    // The ID of the product
    private String prodName;// The name of the product
    private int price;      // The price of the product

}
