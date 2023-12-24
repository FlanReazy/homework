package com.example.fan.demo.design_patterns.behavioral.strategy;

/**
 * 步骤 2
 *
 * 创建实现接口的实体类。
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
