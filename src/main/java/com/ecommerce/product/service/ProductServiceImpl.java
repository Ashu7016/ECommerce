package com.ecommerce.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.product.dao.ProductDao;
import com.ecommerce.product.entity.ProductEntity;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productdao;

	@Override
	public ProductEntity createProduct(ProductEntity productEntity) {
		// TODO Auto-generated method stub
		productdao.save(productEntity);
		
		return productEntity;
	}

	@Override
	public List<ProductEntity> getAllProduct() {
		
		return productdao.findAll();
	}

	@Override
	public ProductEntity getProductById(Long ProductId) {
		
		return productdao.getOne(ProductId);
	}



	@Override
	public void deleteProductById(Long ProductId) {
		// TODO Auto-generated method stub
		ProductEntity entity = productdao.getOne(ProductId);
		productdao.delete(entity);
	}

	@Override
	public ProductEntity updateProductBy(ProductEntity productEntity) {
		productdao.save(productEntity);
		return  productEntity;
	}
	
}
