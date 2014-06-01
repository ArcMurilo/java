package animation;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SwingTimerExample extends JFrame {
    
    public SwingTimerExample() {
        add(new Board());
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("Star");
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                JFrame ex = new SwingTimerExample();
                ex.setVisible(true);
            }
      
    });
    }
    
}
