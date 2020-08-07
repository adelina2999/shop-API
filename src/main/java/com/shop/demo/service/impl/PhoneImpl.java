package com.shop.demo.service.impl;

import com.shop.demo.service.PhoneBusiness;
import com.shop.demo.view.PhoneRepository;
import com.shop.demo.view.entity.PhoneView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneImpl implements PhoneBusiness {

    public final PhoneRepository phoneRepository;

    @Override
    public List<PhoneView> getPhones() {
        return phoneRepository.findAll();
    }

    @Override
    public PhoneView postPhone(PhoneView phoneView) {
        return phoneRepository.save(phoneView);
    }
}
