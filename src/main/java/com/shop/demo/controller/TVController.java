package com.shop.demo.controller;

import com.shop.demo.service.TVBusiness;
import com.shop.demo.view.entity.TVView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TVController {

    private final TVBusiness TVBusiness;

    @GetMapping("/tv")
    public List<TVView> getTV() {
        return TVBusiness.getTV();
    }
}
