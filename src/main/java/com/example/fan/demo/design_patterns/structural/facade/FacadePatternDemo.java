package com.example.fan.demo.design_patterns.structural.facade;

/**
 * 步骤 4
 *
 * 使用该外观类画出各种类型的形状。
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
