/**
 * 
 */
package com.imran.ecom.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imran.ecom.product.model.Product;
import com.imran.ecom.product.repository.ProductRepository;


/**
 * @author imran-home
 *
 */
@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	
	
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
	}
	

	public Optional<Product> findById(String id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
		
	}
	
	

	private Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
	
}
