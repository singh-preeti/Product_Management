package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductRepository;



@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/product")
@RestController
public class ProductController {
	
	private ProductRepository prodService;
	
	@Autowired
	public void setEmployeeService(ProductRepository prodService) {
		this.prodService = prodService;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Product>> getAll() {
		return ResponseEntity.ok(prodService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		return ResponseEntity.ok(prodService.findById(id).orElse(null));
	}
	
	@PostMapping("/")
	public ResponseEntity<Product> add(@RequestBody Product employee) {
		return ResponseEntity.ok(prodService.save(employee));
	}
	
	@PutMapping("/")
	public ResponseEntity<Product> update(@RequestBody Product employee) {
		return ResponseEntity.ok(prodService.save(employee));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Product> delete(@PathVariable Long id) {
		prodService.findById(id).ifPresent(prodService::delete);
		return ResponseEntity.ok().build();
	}
}