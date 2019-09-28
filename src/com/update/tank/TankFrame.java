package com.update.tank;

import java.awt.*;
import java.awt.event.*;

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
        addKeyListener(new TankKeyListener());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.graphics = g;
        System.out.println("paint x =" + x + " y = " + y);
        g.fillRect(x, y, 50, 50);
        x += 100;
        y += 100;
    }


    private class TankKeyListener extends KeyAdapter {


        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("keyPressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("keyReleased");
        }
    }
}
