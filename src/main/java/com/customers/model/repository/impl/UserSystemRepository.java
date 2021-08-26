package com.customers.model.repository.impl;

import com.customers.mapper.UserSystemRowMapper;
import com.customers.model.UserSystem;
import com.customers.model.repository.UserSystemRepositoryInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserSystemRepository implements UserSystemRepositoryInterface {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserSystemRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UserSystem> findAll() {
        return jdbcTemplate.query("SELECT * FROM user_system", new UserSystemRowMapper());
    }

    @Override
    public Optional<UserSystem> findByIduser(long iduser) {
        return Optional.of(jdbcTemplate.queryForObject("SELECT * FROM user_system WHERE iduser=?", new Object[]{
            iduser
        }, new BeanPropertyRowMapper<>(UserSystem.class)));
    }

    @Override
    public int deleteById(long iduser) {
        return jdbcTemplate.update("DELETE FROM user_system WHERE iduser=?", new Object[]{
            iduser
        });
    }

    @Override
    public int insert(UserSystem user) {
        return jdbcTemplate.update("INSERT INTO user_system (login, password) " + "values(?, ?)",
                new Object[]{
                    user.getLogin(), user.getPassword()
                });
    }

    @Override
    public int update(UserSystem customerType) {
        return jdbcTemplate.update("UPDATE user_system " + " SET password = ? " + " WHERE iduser = ?",
                new Object[]{
                    customerType.getLogin(), customerType.getPassword()
                });
    }

}
