package com.example.fan.demo.design_patterns.structural.decorator;

/**
 * 步骤 3
 *
 * 创建实现了 Shape 接口的抽象装饰类。
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}