package com.example.fan.demo.design_patterns.structural.proxy;

/**
 * 步骤 2
 *
 * 创建实现接口的实体类。
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
