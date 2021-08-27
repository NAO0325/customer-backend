package com.customers.service.impl;

import com.customers.model.CustomerType;
import com.customers.model.repository.CustomerTypeRepositoryInterface;
import com.customers.service.CustomerTypeServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerTypeService implements CustomerTypeServiceInterface {
    
    private final CustomerTypeRepositoryInterface repo;
    
    @Autowired
    public CustomerTypeService(CustomerTypeRepositoryInterface repo) {
        this.repo = repo;
    }
    
    @Override
    public List<CustomerType> findAll() throws Exception {
        return repo.findAll();
    }
    
    @Override
    public CustomerType findByIdtype(long idtype) throws Exception {
        return repo.findByIdtype(idtype).orElse(new CustomerType());
    }
    
    @Override
    public int deleteById(long idtype) throws Exception {
        return repo.deleteById(idtype);
    }
    
    @Override
    public CustomerType insert(CustomerType customerType) throws Exception {
        int result = repo.insert(customerType);
        if (result != 0) {
            return repo.findLast().orElse(new CustomerType());
        }
        return null;
    }
    
    @Override
    public CustomerType update(CustomerType customerType) throws Exception {
        int result = repo.update(customerType);
        if (result != 0) {
            return repo.findByIdtype(customerType.getIdtype()).orElse(customerType);
        }
        return null;
    }
    
}
