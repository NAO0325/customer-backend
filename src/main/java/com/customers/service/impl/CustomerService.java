package com.customers.service.impl;

import com.customers.model.Customer;
import com.customers.model.repository.CustomerRepositoryInterface;
import com.customers.service.CustomerServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements CustomerServiceInterface {

    private final CustomerRepositoryInterface repo;

    @Autowired
    public CustomerService(CustomerRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Customer> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Customer findByIdcustomer(long idcustomer) throws Exception {
        return repo.findByIdCustomer(idcustomer).orElse(new Customer());
    }

    @Override
    public int deleteById(long idcustomer) throws Exception {
        return repo.deleteById(idcustomer);
    }

    @Override
    public Customer insert(Customer customer) throws Exception {
        int result = repo.insert(customer);
        if (result != 0) {
            return repo.findLast().orElse(new Customer());
        }
        return null;
    }

    @Override
    public Customer update(Customer customer) throws Exception {
        int result = repo.update(customer);
        if (result != 0) {
            return repo.findByIdCustomer(customer.getIdcustomer()).orElse(customer);
        }
        return null;
    }

}
