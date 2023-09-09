package com.ocrrecgen.OCRrecipegenerator.controller;

import com.ocrrecgen.OCRrecipegenerator.service.CustomerService;
import com.ocrrecgen.OCRrecipegenerator.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/get-users")
    public List<Customer> getUsers() {
        return this.customerService.getUsers();
    }
}
