package com.vinaya.employeeapplication.api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class helloworld {



    @RequestMapping(value = "/hello")
    public String sayHello()
    {
        return "hello"+"world"+"hii";
   }
}
