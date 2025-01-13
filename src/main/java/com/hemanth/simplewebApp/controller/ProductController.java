package com.hemanth.simplewebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hemanth.simplewebApp.service.ProductService;
import com.hemanth.simplewebApp.model.Product;

import java.util.List;

/**
 * Controller for handling product-related requests.
 * Provides CRUD operations for managing products.
 */
@RestController
public class ProductController {

    @Autowired
    ProductService service;
    
    /**
     * Returns a list of all products.
     * @return A list of Product objects.
     */
    @GetMapping("/products")
    public List<Product> getproducts(){
        return service.getProducts();
    }

    /**
     * Returns a product by its ID.
     * @param prodId The ID of the product to retrieve.
     * @return The Product object with the specified ID.
     */
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
       return service.getproductById(prodId);
    } 

    /**
     * Adds a new product.
     * @param prod The Product object to add.
     */
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    /**
     * Updates an existing product.
     * @param prod The Product object to update.
     */
    @PutMapping("/products")   
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    /**
     * Deletes a product by its ID.
     * @param prodId The ID of the product to delete.
     */
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
