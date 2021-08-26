package com.customers.model.repository;

import com.customers.model.CustomerType;
import java.util.List;
import java.util.Optional;


public interface CustomerTypeRepositoryInterface {
    
     List<CustomerType> findAll();
     
     Optional<CustomerType> findByIdtype(long idtype);
     
     int deleteById(long idtype);
     
     int insert(CustomerType customerType);
     
     int update(CustomerType customerType);
     
}
