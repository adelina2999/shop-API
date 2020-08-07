package com.shop.demo.service.impl;

import com.shop.demo.service.LaptopBusiness;
import com.shop.demo.view.LaptopRepository;
import com.shop.demo.view.entity.LaptopView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LaptopImpl implements LaptopBusiness {

    public final LaptopRepository laptopRepository;

    @Override
    public List<LaptopView> getLaptops() {
        return laptopRepository.findAll();
    }
}
