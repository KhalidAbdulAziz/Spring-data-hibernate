package com.kalid.springjpa.controller;

import com.kalid.springjpa.dto.OrderReq;
import com.kalid.springjpa.entity.Customer;
import com.kalid.springjpa.repo.CustomerRepo;
import com.kalid.springjpa.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/order")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ProductRepo productRepo;


    @PostMapping("/placeOrder")
    public Customer placeOrde(@RequestBody OrderReq req) {
        return customerRepo.save(req.getCustomer());
    }

    @GetMapping("/findAll")
    public List<Customer> findAllOrders() {
        return customerRepo.findAll();
    }


}
