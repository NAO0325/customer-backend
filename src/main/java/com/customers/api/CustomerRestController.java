package com.customers.api;

import com.customers.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {

    private final CustomerServiceInterface service;

    @Autowired
    public CustomerRestController(CustomerServiceInterface service) {
        this.service = service;
    }

}
