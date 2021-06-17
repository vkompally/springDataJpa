package com.rs.springDataJpa.controller;

import com.rs.springDataJpa.dto.OrderRequest;
import com.rs.springDataJpa.dto.OrderResponse;
import com.rs.springDataJpa.entity.Customer;
import com.rs.springDataJpa.entity.Product;
import com.rs.springDataJpa.repository.CustomerRepository;
import com.rs.springDataJpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }

    @PostMapping("/createProduct")
    public Product placeOrder(@RequestBody Product request){
        return productRepository.save(request);
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){

        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){

        return customerRepository.getJoinInformation();
    }
}
