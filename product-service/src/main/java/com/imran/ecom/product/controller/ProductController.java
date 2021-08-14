/**
 * 
 */
package com.imran.ecom.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imran.ecom.product.model.Product;
import com.imran.ecom.product.service.ProductService;

/**
 * @author imran-home
 *
 */

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	private List<Product> findAll() {
		// TODO Auto-generated method stub
		return productService.findAll();
	}
	
	
	@GetMapping("/{id}")
	private ResponseEntity<Product> findById(@PathVariable String id) {
		// TODO Auto-generated method stub
		Optional<Product> optionalProduct= productService.findById(id);
		if(!optionalProduct.isEmpty()) {
			return new ResponseEntity<Product>(optionalProduct.get(), HttpStatus.OK);
		}
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}
	

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	private void createProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		productService.createProduct(product);
	}
	
	
	
}
