package com.demospring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpring2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpring2Application.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/helloyou")
    public String helloSomeone(@RequestParam(name = "name") String name) {
        // @RequestParam(name = "name") String name

        return "Hello " + name;
    }

}
