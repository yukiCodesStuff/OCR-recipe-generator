package com.ocrrecgen.OCRrecipegenerator.repository;

import com.ocrrecgen.OCRrecipegenerator.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository
        extends JpaRepository<Customer, Long> {
}
