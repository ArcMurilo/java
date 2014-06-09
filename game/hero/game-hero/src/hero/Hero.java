package hero;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hero {
    private int x, y;
    private int dx, dy;
    private int r = 1, l = 1;
    private int life;
    private boolean alive;
    private boolean attacking;
    private Image image;
    private Image[] imagesLeft, imagesRight;
    
    public Hero(int x, int y) {
        this.x = x;
        this.y = y;
        
        attacking = false;
        
        this.alive = true;
        this.life = 100;
        
        initImages();
        image = imagesRight[1];
    }    
    
    private void initImages() {
        imagesRight = new Image[6];
        imagesLeft = new Image[6];
        int i = 1;
        String image;
        
        for (i = 0; i <= 5; i++) {
            if (i == 0) {
                image = "/img/hero-att-left.png";
            } else {
                image = "/img/hero-left"+i+".png";
            }
            ImageIcon ii = new ImageIcon(this.getClass().getResource(image));
            imagesLeft[i] = ii.getImage();
        }
        
        for (i = 0; i <= 5; i++) {
            if (i == 0) {
                image = "/img/hero-att-right.png";
            } else {
                image = "/img/hero-right"+i+".png";
            }
            ImageIcon ii = new ImageIcon(this.getClass().getResource(image));
            imagesRight[i] = ii.getImage();
        }
    }
    
    public int getLife() {
        return this.life;
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
    
    public Rectangle getBounds() {
        return new Rectangle(this.x-10, this.y-10, image.getWidth(null)-10, image.getHeight(null)-10);
    }
    
    public void dano(int att) {
        this.life -= att;
        if (this.life <= 0) {
            this.life = 0;
            this.alive = false;
        }
    }
    
    public boolean isAlive() {
        return this.alive;
    }
    
    public boolean isAttacking() {
        return this.attacking;
    }
    
    public void attack() {
        if (r >= l) {
            image = imagesRight[0];
        }
        
        else {
            image = imagesLeft[0];
        }
        
        attacking = true;
    }
    
    public void move() {
        if (dx == 5) {
            image = imagesRight[r];
            r++;
            if(r > 5) r = 1;
            l = 1;
        }
        else if (dx == -5) {
            image = imagesLeft[l];
            l++;
            if (l > 5) l = 1;
            r = 1;
        }
        
        x += dx;
        y += dy;
        
        attacking = false;
    }
    
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_RIGHT) {
            dx = 5;
        }
        
        if (key == KeyEvent.VK_LEFT) {
            dx = -5;
        }
        
        if (key == KeyEvent.VK_DOWN) {
            dy = 3;
        }
        
        if (key == KeyEvent.VK_UP) {
            dy = -3;
        }
        
        if (key == KeyEvent.VK_CONTROL) {
            attack();
        }
    }
    
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
 
        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
        
        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }
        
        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
        
        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }
        if (key == KeyEvent.VK_CONTROL) {
            image = imagesRight[1];
        }
    }
}
