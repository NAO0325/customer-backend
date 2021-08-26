package com.customers.mapper;

import com.customers.model.UserSystem;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserSystemRowMapper implements RowMapper<UserSystem> {

    @Override
    public UserSystem mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserSystem obj = new UserSystem();
        obj.setIduser(rs.getLong("iduser"));
        obj.setLogin(rs.getString("login"));
        obj.setPassword(rs.getString("password"));
        return obj;
    }
}
