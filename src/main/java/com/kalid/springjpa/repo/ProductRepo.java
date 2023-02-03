package com.kalid.springjpa.repo;

import com.kalid.springjpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
