package com.customers.api;

import com.customers.model.UserSystem;
import com.customers.service.UserSystemServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserSystemRestController {

    private final UserSystemServiceInterface service;

    @Autowired
    public UserSystemRestController(UserSystemServiceInterface service) {
        this.service = service;
    }

    @GetMapping(value = "/listAll")
    public List<UserSystem> listAll() throws Exception {
        return service.findAll();
    }

    @PostMapping(value = "/findById")
    public UserSystem findById(@RequestParam("id") Long id) throws Exception {
        return service.findByIduser(id);
    }

    @PostMapping(value = "/insert")
    public int insert(@RequestBody UserSystem user) throws Exception {
        return service.insert(user);
    }

    @PostMapping(value = "/update")
    public int update(@RequestBody UserSystem user) throws Exception {
        return service.update(user);
    }

    @PostMapping(value = "/deleteById")
    public int deleteById(@RequestParam("id") Long id) throws Exception {
        return service.deleteById(id);
    }

}
