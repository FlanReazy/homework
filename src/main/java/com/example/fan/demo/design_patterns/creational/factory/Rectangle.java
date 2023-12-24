package com.example.fan.demo.design_patterns.creational.factory;

/**
 * 步骤 2
 *
 * 创建实现接口的实体类。Rectangle和 Square
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
