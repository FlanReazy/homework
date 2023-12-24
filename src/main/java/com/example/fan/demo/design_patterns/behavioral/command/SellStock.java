package com.example.fan.demo.design_patterns.behavioral.command;

/**
 * 步骤 3
 *
 * 创建实现了 Order 接口的实体类。
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
