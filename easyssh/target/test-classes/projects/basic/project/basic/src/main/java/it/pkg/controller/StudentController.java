package it.pkg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello World";
    }
}