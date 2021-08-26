package com.customers.service.impl;

import com.customers.model.UserSystem;
import com.customers.model.repository.UserSystemRepositoryInterface;
import com.customers.service.UserSystemServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSystemService implements UserSystemServiceInterface {

    private final UserSystemRepositoryInterface repo;

    @Autowired
    public UserSystemService(UserSystemRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<UserSystem> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public UserSystem findByIduser(long iduser) throws Exception {
        return repo.findByIduser(iduser).orElse(new UserSystem());
    }

    @Override
    public int deleteById(long iduser) throws Exception {
        return repo.deleteById(iduser);
    }

    @Override
    public int insert(UserSystem user) throws Exception {
        return repo.insert(user);
    }

    @Override
    public int update(UserSystem user) throws Exception {
        return repo.update(user);
    }

}
