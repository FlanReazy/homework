package com.example.fan.demo.design_patterns.behavioral.visitor;

/**
 * 步骤 2
 *
 * 创建扩展了上述类的实体类。
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
