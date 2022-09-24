package com.home.kafka.data.producer.model;

import lombok.Data;

import java.util.List;

@Data
public class BakeryRecipe {
    private int id;
    private String type;
    private String name;
    private float ppu;
    private List<BatterType> batters;
    private List<ToppingType> toppings;
}
