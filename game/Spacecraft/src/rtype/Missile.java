package rtype;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Missile {
    private int x, y;
    private Image image;
    boolean visible;
    
    private final int BOARD_WIDTH = 390;
    private final int MISSILE_SPEED = 2;
    
    public Missile(int x, int y) {
        ImageIcon ii = 
                new ImageIcon(getClass().getResource("missile.png"));
        image = ii.getImage();
        visible = true;
        this.x = x;
        this.y = y;
    }
    
    public Image getImage() {
        return this.image;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public boolean isVisible() {
        return this.visible;
    }
    
    public void move() {
        x += MISSILE_SPEED;
        if (x > BOARD_WIDTH)
            visible = false;
    }
}

