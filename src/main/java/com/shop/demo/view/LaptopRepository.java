package com.shop.demo.view;

import com.shop.demo.view.entity.LaptopView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<LaptopView, Long> {
}
