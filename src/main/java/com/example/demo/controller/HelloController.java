package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "reddy";
    }
    @GetMapping("/bello")
    public String bello() {
    	return "reddy";
    }
    @GetMapping("/nani")
    public String nani() {
    	return "buddy";
    }
    @GetMapping("/fear")
    public String fear() {
        return "feal to fear>>>";

    }
}
