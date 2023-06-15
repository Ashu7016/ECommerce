package com.ecommerce.product.service;

import java.util.List;

import com.ecommerce.product.entity.ProductEntity;

public interface ProductService {
	
	ProductEntity createProduct(ProductEntity productEntity);
	List<ProductEntity> getAllProduct();
	
	ProductEntity getProductById(Long ProductId);
	ProductEntity updateProductBy(ProductEntity productEntity);
    void deleteProductById(Long ProductId);
	

}
