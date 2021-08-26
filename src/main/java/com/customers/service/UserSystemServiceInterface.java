package com.customers.service;

import com.customers.model.UserSystem;
import java.util.List;

public interface UserSystemServiceInterface {

    List<UserSystem> findAll() throws Exception;

    UserSystem findByIduser(long iduser) throws Exception;

    int deleteById(long iduser) throws Exception;

    int insert(UserSystem user) throws Exception;

    int update(UserSystem user) throws Exception;
}
