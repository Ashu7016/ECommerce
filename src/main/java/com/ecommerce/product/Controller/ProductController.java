package com.ecommerce.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.product.entity.ProductEntity;
import com.ecommerce.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@PostMapping("/create")
	public ProductEntity createProduct(@RequestBody ProductEntity productEntity)
	{
		return this.productservice.createProduct(productEntity);
	}
	
	@GetMapping("/Product")
	public List<ProductEntity> getProduct()
	{
		return this.productservice.getAllProduct();
	}
	
	@PutMapping("/Product")
	
	public ProductEntity updateProductBy(@RequestBody ProductEntity productEntity)
	{
		return this.productservice.updateProductBy(productEntity);
	}
	
	@DeleteMapping("/getProduct/{productId}")	
	public ResponseEntity<HttpStatus>deleteOrder(@PathVariable Long productId)
	{
		try {
			this.productservice.deleteProductById(productId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
