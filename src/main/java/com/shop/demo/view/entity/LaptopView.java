package com.shop.demo.view.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "laptops")
public class LaptopView {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_laptop;
    private String name;
    private long price;
    private String create_time;
    private boolean in_stock;
}
