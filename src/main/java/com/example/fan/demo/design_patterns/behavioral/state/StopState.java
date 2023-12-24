package com.example.fan.demo.design_patterns.behavioral.state;

/**
 * 步骤 2
 *
 * 创建实现接口的实体类。
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}