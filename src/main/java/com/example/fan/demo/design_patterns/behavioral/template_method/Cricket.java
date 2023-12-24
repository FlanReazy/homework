package com.example.fan.demo.design_patterns.behavioral.template_method;

/**
 * 步骤 2
 *
 * 创建扩展了上述类的实体类。
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}