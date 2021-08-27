package com.customers.service;

import com.customers.model.Customer;
import java.util.List;

public interface CustomerServiceInterface {

    List<Customer> findAll() throws Exception;

    Customer findByIdcustomer(long idcustomer) throws Exception;

    int deleteById(long idcustomer) throws Exception;

    Customer insert(Customer customer) throws Exception;

    Customer update(Customer customer) throws Exception;
}
