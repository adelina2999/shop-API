package com.shop.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Laptop {

    @GetMapping("/laptops")
    public String getLaptops() {
        return "adelina";
    }
}
