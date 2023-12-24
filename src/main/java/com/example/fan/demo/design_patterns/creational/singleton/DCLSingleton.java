package com.example.fan.demo.design_patterns.creational.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 */
public class DCLSingleton {
    private volatile static DCLSingleton singleton;

    private DCLSingleton() {
    }

    public static DCLSingleton getDCLSingleton() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
