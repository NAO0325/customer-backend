package com.customers.model.repository.impl;

import com.customers.mapper.CustomerRowMapper;
import com.customers.model.Customer;
import com.customers.model.repository.CustomerRepositoryInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepository implements CustomerRepositoryInterface {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Customer> findAll() {
        return jdbcTemplate.query("SELECT * FROM customer", new CustomerRowMapper());
    }

    @Override
    public Optional<Customer> findByIdCustomer(long idcustomer) {
        return Optional.of(jdbcTemplate.queryForObject("SELECT * FROM customer WHERE idcustomer=?", new Object[]{
            idcustomer
        }, new BeanPropertyRowMapper<>(Customer.class)));
    }

    @Override
    public Optional<Customer> findLast() {
        return Optional.of(jdbcTemplate.queryForObject("SELECT * FROM customer ORDER BY idcustomer DESC LIMIT 1",
                new BeanPropertyRowMapper<>(Customer.class)));
    }

    @Override
    public int deleteById(long idcustomer) {
        return jdbcTemplate.update("DELETE FROM customer WHERE idcustomer=?", new Object[]{
            idcustomer
        });
    }

    @Override
    public int insert(Customer customer) {
        return jdbcTemplate.update("INSERT INTO customer (idtype, dni, customer_name, contact, region) " + "values(?, ?, ?, ?, ?)",
                new Object[]{
                    customer.getIdtype(), customer.getDni(), customer.getCustomerName(), customer.getContact(), customer.getRegion()
                });
    }

    @Override
    public int update(Customer customer) {
        return jdbcTemplate.update("UPDATE customer " + " SET idtype = ?, dni = ?, customer_name = ? , contact = ?, region = ? " + " WHERE idcustomer = ?",
                new Object[]{
                    customer.getIdtype(), customer.getDni(), customer.getCustomerName(), customer.getContact(), customer.getRegion(), customer.getIdcustomer()
                });
    }

}
