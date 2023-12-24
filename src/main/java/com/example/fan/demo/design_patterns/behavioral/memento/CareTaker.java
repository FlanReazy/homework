package com.example.fan.demo.design_patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 步骤 3
 *
 * 创建 CareTaker 类。
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
