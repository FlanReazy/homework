package com.example.fan.demo.design_patterns.creational.builder;

/**
 * 步骤 4
 *
 * 创建扩展了 Burger 和 ColdDrink 的实体类。
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}