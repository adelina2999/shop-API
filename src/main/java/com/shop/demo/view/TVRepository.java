package com.shop.demo.view;

import com.shop.demo.view.entity.TVView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TVRepository extends JpaRepository<TVView, Long> {
}
