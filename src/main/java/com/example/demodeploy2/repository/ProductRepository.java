package com.example.demodeploy2.repository;

import com.example.demodeploy2.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
