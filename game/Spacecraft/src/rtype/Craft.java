package rtype;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Craft {
    
    private String craft = "craft.png";
    
    private final int CRAFT_SIZE = 20;
    
    private int dx;
    private int dy;
    private int x;
    private int y;
    public int width;
    public int height;
    private boolean visible;
    private Image image;
    private ArrayList missiles;
    
    public Craft() {
        ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
        image = ii.getImage();
        width = image.getWidth(null);
        height = image.getHeight(null);
        missiles = new ArrayList();
        x = 40;
        y = 60;       
    }
    
    public void move() {
        x += dx;
        y += dy;
        
        if (x < 1) x = 1;
        if (y < 1) y = 1;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
    
    public boolean isVisible() {
        return this.visible;                
    }
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public Image getImage() {
        return this.image;
    }
    
    public ArrayList getMissiles() {
        return this.missiles;
    }
    
    //pega os eventos do teclado
    
    public void keyPressed (KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }
        
        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }
        
        if (key == KeyEvent.VK_UP) {
            dy = -1;            
        }
        
        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
        
        if (key == KeyEvent.VK_SPACE) {
            fire();
        }
    }
    
    public void fire() {
        missiles.add(new Missile(x + CRAFT_SIZE, y + CRAFT_SIZE/2));
    }
    
        
    public void keyReleased (KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }
        
        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
        
        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }
        
        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
