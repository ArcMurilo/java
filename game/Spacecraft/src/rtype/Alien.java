package rtype;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Alien {
    private int x, y;
    private int width, height;
    private boolean visible;
    private Image image;
    
    public Alien(int x, int y) {
        ImageIcon ii = 
                new ImageIcon(getClass().getResource("alien.png"));
        image = ii.getImage();
        width = image.getWidth(null);
        height = image.getHeight(null);
        visible = true;
        this.x = x;
        this.y = y;        
    }
    
    public void move() {
        if (x < 0) x = 400;
        x -= 1;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public Image getImage() {
        return this.image;
    }
    
    public boolean isVisible() {
        return this.visible;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
}
