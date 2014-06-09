package hero;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Heroes extends JFrame {
    
    public Heroes() {
        add(new Board());
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Heroes");
        this.setSize(new Dimension(400, 300));        
    }
    
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame h = new Heroes();
                h.setVisible(true);
            }
        });
    }
}
