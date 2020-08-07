package com.shop.demo.view;

import com.shop.demo.view.entity.PhoneView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<PhoneView, Long> {
}
