package com.example.fan.demo.design_patterns.creational.singleton;

/**
 * 登记式/静态内部类
 */
public class StaticSingleton {
    private static class SingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton() {
    }

    public static final StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
