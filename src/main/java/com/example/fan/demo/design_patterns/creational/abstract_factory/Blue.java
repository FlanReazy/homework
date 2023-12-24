package com.example.fan.demo.design_patterns.creational.abstract_factory;

/**
 * 步骤4
 *
 * 创建实现接口的实体类。
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
