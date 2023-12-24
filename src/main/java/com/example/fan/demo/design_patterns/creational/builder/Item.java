package com.example.fan.demo.design_patterns.creational.builder;

/**
 * 步骤 1
 *
 * 创建一个表示食物条目和食物包装的接口。
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
