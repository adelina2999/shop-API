package com.shop.demo.service;

import com.shop.demo.view.entity.TVView;

import java.util.List;

public interface TVBusiness {

    List<TVView> getTV();

    TVView postTV(TVView tvView);


}
