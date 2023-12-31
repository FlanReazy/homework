package com.example.fan.demo.design_patterns.behavioral.visitor;

/**
 * 步骤 3
 *
 * 定义一个表示访问者的接口。
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
