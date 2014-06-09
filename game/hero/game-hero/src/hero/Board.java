package hero;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener{
    
    private Timer timer;
    private Hero hero;
    private Monster monster;
    private int B_WIDTH;
    private int B_HEIGHT;
    private Image map;    
    
    public Board() {
        addKeyListener(new TAdapter());
        hero = new Hero(3, 160);
        monster = new Monster(250, 100);
        setFocusable(true);
        setDoubleBuffered(true);
        
        
        
        ImageIcon ii = new ImageIcon(this.getClass().getResource("/img/mapa.png"));
        map = ii.getImage();
        
        timer = new Timer(150, this);
        timer.start();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(map, 0, 0, this);
        if (monster.isAlive())
            g2d.drawImage(monster.getImage(), monster.getX(), monster.getY(), this);
        if (hero.isAlive()) 
            g2d.drawImage(hero.getImage(), hero.getX(), hero.getY(), this);
        
        Font font = new Font("Calibri", 5, 14);
        
        g2d.setFont(font);
        
        g2d.drawString("Hero HP: " + hero.getLife(), 3, 10);
        g2d.drawString("Monster HP " + monster.getLife(), 3, 25);
        
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        hero.move();
        monster.move();
        checkCollision();
        repaint();
    }
    
    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            hero.keyPressed(e);
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
            hero.keyReleased(e);
        }
    }
    
    public void checkCollision() {
        Rectangle r_hero, r_monster;
        
        r_hero = hero.getBounds();
        r_monster = monster.getBounds();
        
        if (r_hero.intersects(r_monster)){
            if (hero.isAttacking()) {
                monster.dano(25);
            } 
        }
    }
    
}
