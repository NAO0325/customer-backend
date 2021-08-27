package com.customers.api;

import com.customers.model.CustomerType;
import com.customers.service.CustomerTypeServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customertype")
public class CustomerTypeRestController {

    private final CustomerTypeServiceInterface service;

    @Autowired
    public CustomerTypeRestController(CustomerTypeServiceInterface service) {
        this.service = service;
    }

    @GetMapping(value = "/listAll")
    public List<CustomerType> listAll() throws Exception {
        return service.findAll();
    }

    @PostMapping(value = "/findById")
    public CustomerType findById(@RequestParam("id") Long id) throws Exception {
        return service.findByIdtype(id);
    }

    @PostMapping(value = "/insert")
    public CustomerType insert(@RequestBody CustomerType customerType) throws Exception {
        return service.insert(customerType);
    }

    @PostMapping(value = "/update")
    public CustomerType update(@RequestBody CustomerType customerType) throws Exception {
        return service.update(customerType);
    }

    @PostMapping(value = "/deleteById")
    public int deleteById(@RequestParam("id") Long id) throws Exception {
        return service.deleteById(id);
    }

}
