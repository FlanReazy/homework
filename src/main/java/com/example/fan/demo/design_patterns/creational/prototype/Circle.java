package com.example.fan.demo.design_patterns.creational.prototype;

/**
 * 步骤 2
 *
 * 创建扩展了上面抽象类的实体类。
 */
public class Circle extends Shape {
    public Circle() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
