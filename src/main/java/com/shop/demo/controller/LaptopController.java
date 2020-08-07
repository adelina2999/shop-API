package com.shop.demo.controller;

import com.shop.demo.service.LaptopBusiness;
import com.shop.demo.view.entity.LaptopView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LaptopController {

    private final LaptopBusiness laptopBusiness;

    @GetMapping("/laptops")
    public List<LaptopView> getLaptops() {
        return laptopBusiness.getLaptops();
    }
}
