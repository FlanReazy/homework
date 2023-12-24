package com.example.fan.demo.design_patterns.creational.singleton;

/**
 * 懒汉式，线程不安全
 */
public class LazySingleton0 {
    private static LazySingleton0 instance;

    private LazySingleton0() {
    }

    public static LazySingleton0 getInstance() {
        if (instance == null) {
            instance = new LazySingleton0();
        }
        return instance;
    }
}
