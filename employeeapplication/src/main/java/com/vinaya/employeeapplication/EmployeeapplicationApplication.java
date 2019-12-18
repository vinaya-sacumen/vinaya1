package com.vinaya.employeeapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeapplicationApplication {
    private static final Logger LOGGER= LoggerFactory.getLogger(EmployeeapplicationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EmployeeapplicationApplication.class, args);

LOGGER.info("simple log statement");
    }

}
