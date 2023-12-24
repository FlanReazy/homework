package com.example.fan.demo.design_patterns.behavioral.visitor;

/**
 * 步骤 1
 *
 * 定义一个表示元素的接口。
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
