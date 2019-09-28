package com.update.tank;


import java.awt.*;

/**
 * @author : liupu
 * date    : 2019/9/28
 * desc    :
 * github : https://github.com/CodeLiuPu/
 */
public class Main {
    public static void main(String[] args) {
        TankFrame frame = new TankFrame();
        for (int i = 200; i < 1000; i = i + 100) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            frame.moveeee(i, i);
        }
    }
}
