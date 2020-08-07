package com.shop.demo.service;

import com.shop.demo.view.entity.LaptopView;

import java.util.List;

public interface LaptopBusiness {

    List<LaptopView> getLaptops();

    LaptopView postLaptop(LaptopView laptopView);

}
