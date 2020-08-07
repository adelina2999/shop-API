package com.shop.demo.service.impl;

import com.shop.demo.service.TVBusiness;
import com.shop.demo.view.TVRepository;
import com.shop.demo.view.entity.TVView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TVImpl implements TVBusiness {

    public final TVRepository tvRepository;

    @Override
    public List<TVView> getTV() {
        return tvRepository.findAll();
    }

    @Override
    public TVView postTV(TVView tvView) {
        return tvRepository.save(tvView);
    }
}
