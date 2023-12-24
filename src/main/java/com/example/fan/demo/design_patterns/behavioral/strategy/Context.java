package com.example.fan.demo.design_patterns.behavioral.strategy;

/**
 * 步骤 3
 *
 * 创建 Context 类。
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
