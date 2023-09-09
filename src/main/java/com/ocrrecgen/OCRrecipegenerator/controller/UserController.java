package com.ocrrecgen.OCRrecipegenerator.controller;

import com.ocrrecgen.OCRrecipegenerator.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/example-user")
    public User exampleUser() {
        return new User(
                Long.valueOf(1),
                "Yuki Janvier",
                "jane.doe@gmail.com",
                LocalDate.now(),
                99
        );
    }
}
