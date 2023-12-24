package com.example.fan.demo.design_patterns.behavioral.interpreter;

/**
 * 步骤 1
 *
 * 创建一个表达式接口。
 */
public interface Expression {
    public boolean interpret(String context);
}
