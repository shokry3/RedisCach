package com.app.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.service.dao.ProductRepository;
import com.app.service.pojo.Product;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Cacheable(value = "products", key = "#id")
	public Optional<Product> getProductById(Long id){
		System.out.println("Fetching product from database...");
		return productRepository.findById(id);
	}
	
	@CachePut(value = "products", key = "#product.id")
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	@CacheEvict(value = "products", key = "#id")
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
}
