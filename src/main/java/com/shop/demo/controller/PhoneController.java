package com.shop.demo.controller;

import com.shop.demo.service.PhoneBusiness;
import com.shop.demo.view.entity.PhoneView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneBusiness phoneBusiness;

    @GetMapping("/phones")
    public List<PhoneView> getPhones() {
        return phoneBusiness.getPhones();
    }

    @PostMapping("/phones")
    public PhoneView postPhone(@RequestBody PhoneView phoneView) {
        return phoneBusiness.postPhone(phoneView);
    }
}
