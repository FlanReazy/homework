package com.example.fan.demo.design_patterns.structural.adapter;

/**
 * 步骤 1
 *
 * 为媒体播放器和更高级的媒体播放器创建接口。
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}
