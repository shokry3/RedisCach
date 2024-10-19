package com.app.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.service.pojo.Product;

public interface  ProductRepository extends JpaRepository<Product, Long> {

}
