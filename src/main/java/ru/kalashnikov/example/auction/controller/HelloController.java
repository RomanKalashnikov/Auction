package ru.kalashnikov.example.auction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String greeting(Map<String, Object> model) {
        return "hello";
    }
}
