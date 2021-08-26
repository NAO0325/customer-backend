package com.customers.service;

import com.customers.model.CustomerType;
import java.util.List;

public interface CustomerTypeServiceInterface {

    List<CustomerType> findAll() throws Exception;

    CustomerType findByIdtype(long idtype) throws Exception;

    int deleteById(long idtype) throws Exception;

    int insert(CustomerType customerType) throws Exception;

    int update(CustomerType customerType) throws Exception;
}
