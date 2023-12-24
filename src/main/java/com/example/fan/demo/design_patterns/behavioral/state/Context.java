package com.example.fan.demo.design_patterns.behavioral.state;

/**
 * 步骤 3
 *
 * 创建 Context 类。
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
