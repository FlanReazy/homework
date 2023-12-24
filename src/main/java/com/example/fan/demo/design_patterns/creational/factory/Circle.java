package com.example.fan.demo.design_patterns.creational.factory;

/**
 * 步骤 2
 *
 * 创建实现接口的实体类。Rectangle和 Square
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
