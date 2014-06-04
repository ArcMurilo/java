package rtype;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpriteSpacecraft extends JFrame{
    
    public SpriteSpacecraft() {
        add(new Board());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Spacecraft");
        setResizable(false);
        //setVisible(true);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame s = new SpriteSpacecraft();
                s.setVisible(true);
            }
        });
    }
}
