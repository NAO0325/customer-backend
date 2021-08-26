package com.customers.mapper;

import com.customers.model.CustomerType;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CustomerTypeRowMapper implements RowMapper<CustomerType> {

    @Override
    public CustomerType mapRow(ResultSet rs, int rowNum) throws SQLException {
        CustomerType obj = new CustomerType();
        obj.setIdtype(rs.getLong("idtype"));
        obj.setTypeName(rs.getString("type_name"));
        return obj;
    }
}
