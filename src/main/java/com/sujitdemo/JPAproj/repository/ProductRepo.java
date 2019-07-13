package com.sujitdemo.JPAproj.repository;

import com.sujitdemo.JPAproj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
