package animation;

import java.awt.EventQueue;
import javax.swing.JFrame;


public class ThreadExample extends JFrame {
    
    public ThreadExample() {
        add(new Board());
        setTitle("Star");
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame ex = new ThreadExample();
                ex.setVisible(true);
            }
        });
    }
    
}
