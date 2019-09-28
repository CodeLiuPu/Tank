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
public class TankFrame extends Frame {
    int x = 200;
    int y = 200;

    Graphics graphics;
    public TankFrame() {
        setSize(800, 600);
        setResizable(false);
        setTitle("Tank War");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.graphics = g;
        System.out.println("paint x =" + x + " y = " + y);
        g.fillRect(x, y, 50, 50);
//        x+=100;
//        y+=100;
    }

    public void moveeee(int x,int y){
        System.out.println("moveeee x =" + x + " y = " + y);
        this.x = x;
        this.y = y;
        this.paint(graphics);

    }
}
