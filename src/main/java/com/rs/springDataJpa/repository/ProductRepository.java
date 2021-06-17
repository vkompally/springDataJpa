package com.rs.springDataJpa.repository;

import com.rs.springDataJpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
