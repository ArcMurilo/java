package hero;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Monster {
    private int X_INICIAL, X_FINAL, Y_INICIAL;
    private int x, r, l;
    private int life;
    private boolean andar_esquerda, alive;
    private Image image;
    private Image[] imagesLeft, imagesRight;
    
    public Monster(int x, int y) {
        this.X_INICIAL = x;
        this.Y_INICIAL = y;
        this.X_FINAL = X_INICIAL - 50;
        this.x = X_INICIAL;
        
        this.life = 100;
        this.alive = true;
        
        andar_esquerda = true;
        r = 0;
        l = 0;       
        
        initImages();
        image = imagesLeft[0];
    }    
    
    private void initImages() {
        imagesRight = new Image[4];
        imagesLeft = new Image[4];
        int i = 1;
        String image;
        
        for (i = 1; i <= 4; i++) {
            image = "/img/monster-left"+i+".png";
            ImageIcon ii = new ImageIcon(this.getClass().getResource(image));
            imagesLeft[i-1] = ii.getImage();
        }
        
        for (i = 1; i <= 4; i++) {
            image = "/img/monster-right"+i+".png";
            ImageIcon ii = new ImageIcon(this.getClass().getResource(image));
            imagesRight[i-1] = ii.getImage();
        }
    }
    
    public int getLife() {
        return this.life;
    }
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.Y_INICIAL;
    }
    
    public Image getImage() {
        return this.image;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(this.x+15, this.Y_INICIAL+15, image.getWidth(null)-15, image.getHeight(null)-15);
    }
            
    
    public void move() {
        if (andar_esquerda) {
            x -= 5;
            andarEsquerda();
        }
        else {
            x += 5;
            andarDireita();
        }
        
        if (x < X_FINAL) {
            andar_esquerda = false; 
        } 
        if (x > X_INICIAL) {
            andar_esquerda = true;
        }
            
    }
    
    private void andarEsquerda() {
        r = 0;
        image = imagesLeft[l];
        l++;
        if (l > 3) l = 0;
    }
     
    private void andarDireita() {
        l = 0;
        image = imagesRight[r];
        r++;
        if (r > 3) r = 0;
    }
    
    public void dano(int att) {
        this.life -= att;
        this.x += 20;
        if (this.life <= 0) {
            this.life = 0;
            this.alive = false;
        }
    }
    
    public boolean isAlive() {
        return this.alive;
    }
}
