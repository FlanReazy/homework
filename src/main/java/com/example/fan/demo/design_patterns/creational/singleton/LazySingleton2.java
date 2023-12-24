package com.example.fan.demo.design_patterns.creational.singleton;

/**
 * 饿汉式
 */
public class LazySingleton2 {
    private static LazySingleton2 instance = new LazySingleton2();

    private LazySingleton2() {
    }

    public static LazySingleton2 getInstance() {
        return instance;
    }
}
