package com.hemanth.simplewebApp.service;

import com.hemanth.simplewebApp.model.Product;
import com.hemanth.simplewebApp.repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// import java.util.ArrayList;
// import java.util.Arrays;

/**
 * Service class for managing products.
 * Contains business logic for product operations.
 */
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
    
   // In-memory list of products
    //    List<Product> products = new ArrayList<>(Arrays.asList(
    //        new Product(101,"iphone",1000),
    //        new Product(102,"samsung",800),
    //        new Product(103,"oneplus",900)
    //    ));

   /**
    * Returns a list of all products.
    * @return A list of Product objects.
    */
    public List<Product> getProducts(){
       // return products; // Return the in-memory list of products
       return repo.findAll(); // Return the list of products from the database
    }

    /**
     * Returns a product by its ID.
     * @param prodId The ID of the product to retrieve.
     * @return The Product object with the specified ID.
     */
    public Product getproductById(int prodId) {
        // returns the product from the in-memory list
        // return products.stream()
        //     .filter(p -> p.getProdId() == prodId)
        //     .findFirst().get();

        // returns the product from the database
        return repo.findById(prodId).orElse(new Product());
    }

    /**
     * Adds a new product to the list.
     * @param prod The Product object to add.
     */
    public void addProduct(Product prod){
       // products.add(prod); // add the new prod in the in memory list
       repo.save(prod); // add the new prod in the database
    }

    /**
     * Updates an existing product in the list.
     * @param prod The Product object to update.
     */
    public void updateProduct(Product prod) {
            // update the product in memory list
            // int index = 0;
            // for(int i = 0; i < products.size(); i++){
            //     if(products.get(i).getProdId() == prod.getProdId()){
            //         index = i;
            //         break;
            //     }
            // }
            // products.set(index, prod);

        repo.save(prod); // update the product in the database
    }

    /**
     * Deletes a product by its ID.
     * @param prodId The ID of the product to delete.
     */
    public void deleteProduct(int prodId) {
        // int index = 0;
        // for(int i = 0; i < products.size(); i++){
        //     if(products.get(i).getProdId() == prodId){
        //         index = i;
        //         break;
        //     }
        // }
        // products.remove(index); // remove the product from the in-memory list
        repo.deleteById(prodId); // remove the product from the database
    }
}
