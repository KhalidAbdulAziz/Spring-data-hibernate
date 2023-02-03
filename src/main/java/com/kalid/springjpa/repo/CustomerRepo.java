package com.kalid.springjpa.repo;

import com.kalid.springjpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
