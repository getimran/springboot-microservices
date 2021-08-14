/**
 * 
 */
package com.imran.ecom.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imran.ecom.product.model.Product;

/**
 * @author imran-home
 *
 */
public interface ProductRepository extends MongoRepository<Product, String>{

}
