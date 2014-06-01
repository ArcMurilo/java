package animation;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class UtilTimerExample extends JFrame {

    public UtilTimerExample() {
        add(new Board());
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setTitle("Star");
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                JFrame ex = new UtilTimerExample();
                ex.setVisible(true);
            }
      
    });
    }
}
