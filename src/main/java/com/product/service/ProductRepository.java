package com.product.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.product.model.Product;

@Service
public interface ProductRepository extends JpaRepository<Product,Long> {

}
