package com.example.joole.repository;

import com.example.joole.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    Product findByPrice(double price);
    Product findByName(String name);

}
