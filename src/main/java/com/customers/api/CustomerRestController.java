package com.customers.api;

import com.customers.model.Customer;
import com.customers.service.CustomerServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {

    private final CustomerServiceInterface service;

    @Autowired
    public CustomerRestController(CustomerServiceInterface service) {
        this.service = service;
    }

    @GetMapping(value = "/listAll")
    public List<Customer> listAll() throws Exception {
        return service.findAll();
    }

    @PostMapping(value = "/findById")
    public Customer findById(@RequestParam("id") Long id) throws Exception {
        return service.findByIdcustomer(id);
    }

    @PostMapping(value = "/insert")
    public Customer insert(@RequestBody Customer customer) throws Exception {
        return service.insert(customer);
    }

    @PostMapping(value = "/update")
    public Customer update(@RequestBody Customer customer) throws Exception {
        return service.update(customer);
    }

    @PostMapping(value = "/deleteById")
    public int deleteById(@RequestParam("id") Long id) throws Exception {
        return service.deleteById(id);
    }

}
