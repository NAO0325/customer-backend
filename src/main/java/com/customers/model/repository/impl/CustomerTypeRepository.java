package com.customers.model.repository.impl;

import com.customers.mapper.CustomerTypeRowMapper;
import com.customers.model.CustomerType;
import com.customers.model.repository.CustomerTypeRepositoryInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomerTypeRepository implements CustomerTypeRepositoryInterface {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerTypeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<CustomerType> findAll() {
        return jdbcTemplate.query("SELECT * FROM customer_type", new CustomerTypeRowMapper());
    }

    @Override
    public Optional<CustomerType> findByIdtype(long idtype) {
        return Optional.of(jdbcTemplate.queryForObject("SELECT * FROM customer_type WHERE idtype=?", new Object[]{
            idtype
        }, new BeanPropertyRowMapper<>(CustomerType.class)));
    }

    @Override
    public int deleteById(long idtype) {
        return jdbcTemplate.update("DELETE FROM customer_type WHERE idtype=?", new Object[]{
            idtype
        });
    }

    @Override
    public int insert(CustomerType customer) {
        return jdbcTemplate.update("INSERT INTO customer_type (type_name) " + "values(?)",
                new Object[]{
                    customer.getTypeName()
                });
    }

    @Override
    public int update(CustomerType customerType) {
        return jdbcTemplate.update("UPDATE customer_type " + " SET type_name = ? " + " WHERE idtype = ?",
                new Object[]{
                    customerType.getTypeName(), customerType.getIdtype()
                });
    }

}
