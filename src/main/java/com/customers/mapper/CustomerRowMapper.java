package com.customers.mapper;

import com.customers.model.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer obj = new Customer();
        obj.setIdcustomer(rs.getLong("idcustomer"));
        obj.setIdtype(rs.getLong("idtype"));
        obj.setDni(rs.getString("dni"));
        obj.setCustomerName(rs.getString("customer_name"));
        obj.setContact(rs.getString("contact"));
        obj.setRegion(rs.getString("region"));
        return obj;
    }
}
