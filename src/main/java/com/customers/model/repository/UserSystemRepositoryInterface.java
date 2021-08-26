package com.customers.model.repository;

import com.customers.model.UserSystem;
import java.util.List;
import java.util.Optional;


public interface UserSystemRepositoryInterface {
    
     List<UserSystem> findAll();
     
     Optional<UserSystem> findByIdUser(long iduser);
     
     int deleteById(long iduser);
     
     int insert(UserSystem user);
     
     int update(UserSystem user);
     
}
