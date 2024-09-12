package com.example.demo;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HelloWorld {
    @GetMapping
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/getId")
    public String getId(@RequestParam String id) {
        return "Hello World" + " " + id;
    }
}