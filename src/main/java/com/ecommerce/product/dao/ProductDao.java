package com.ecommerce.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.product.entity.ProductEntity;

@Repository
public interface ProductDao extends JpaRepository<ProductEntity,Long>{

}
