package com.shop.demo.service;

import com.shop.demo.view.entity.PhoneView;

import java.util.List;

public interface PhoneBusiness {

    List<PhoneView> getPhones();

    PhoneView postPhone(PhoneView phoneView);

}
