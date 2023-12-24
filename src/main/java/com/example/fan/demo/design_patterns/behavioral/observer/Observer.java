package com.example.fan.demo.design_patterns.behavioral.observer;

/**
 * 步骤 2
 *
 * 创建 Observer 类。
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
