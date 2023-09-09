package com.ocrrecgen.OCRrecipegenerator.config;

import com.ocrrecgen.OCRrecipegenerator.entity.Customer;
import com.ocrrecgen.OCRrecipegenerator.enums.Language;
import com.ocrrecgen.OCRrecipegenerator.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            Customer yuki =new Customer(
                    "Yuki Janvier",
                    "jane.doe@gmail.com",
                    LocalDate.now(),
                    99,
                    Language.EN
            );

            Customer john =new Customer(
                    "John",
                    "john@gmail.com",
                    LocalDate.now(),
                    99,
                    Language.EN
            );

            customerRepository.saveAll(
                    List.of(
                            yuki, john
                    )
            );
        };
    }
}
