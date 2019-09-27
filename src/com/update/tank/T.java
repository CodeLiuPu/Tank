package com.update.tank;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author : liupu
 * date    : 2019/9/28
 * desc    :
 * github : https://github.com/CodeLiuPu/
 */
public class T {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(800,600);
        frame.setResizable(false);
        frame.setTitle("Tank War");
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
