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

    private int x = 200;
    private int y = 200;

    private int width = 50;
    private int height = 50;

    private int speed = 10;

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
        System.out.println("paint x =" + x + " y = " + y);
        g.fillRect(x, y, width, height);
    }

    private class TankKeyListener extends KeyAdapter {

        boolean bL = false;
        boolean bR = false;
        boolean bU = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
            }

            if (bL && !bR) {
                x -= speed;
            } else if (bR && !bL) {
                x += speed;
            }
            if (bU && !bD) {
                y -= speed;
            } else if (bD && !bU) {
                y += speed;
            }

            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
            }
        }
    }
}
