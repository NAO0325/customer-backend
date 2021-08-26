package com.customers.model.repository;

import com.customers.model.Customer;
import java.util.List;
import java.util.Optional;


public interface CustomerRepositoryInterface {
    
     List<Customer> findAll();
     
     Optional<Customer> findByIdCustomer(long idcustomer);
     
     int deleteById(long idcustomer);
     
     int insert(Customer customer);
     
     int update(Customer customer);
     
}
