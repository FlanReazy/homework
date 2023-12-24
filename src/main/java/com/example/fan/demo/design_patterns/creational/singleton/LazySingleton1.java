package com.example.fan.demo.design_patterns.creational.singleton;

/**
 * 懒汉式，线程安全
 */
public class LazySingleton1 {
    private static LazySingleton1 instance;

    private LazySingleton1() {
    }

    public static synchronized LazySingleton1 getInstance() {
        if (instance == null) {
            instance = new LazySingleton1();
        }
        return instance;
    }
}
