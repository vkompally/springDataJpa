package com.rs.springDataJpa.repository;

import com.rs.springDataJpa.dto.OrderResponse;
import com.rs.springDataJpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {


    @Query("SELECT new com.rs.springDataJpa.dto.OrderResponse( c.name, p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();


}
