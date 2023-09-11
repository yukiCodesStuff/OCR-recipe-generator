package com.ocrrecgen.OCRrecipegenerator.service;

import com.ocrrecgen.OCRrecipegenerator.entity.Customer;
import com.ocrrecgen.OCRrecipegenerator.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getUsers() {
        return this.customerRepository.findAll();
    }
}
