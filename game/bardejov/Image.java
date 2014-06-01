package bardejov;

import javax.swing.JFrame;

public class Image extends JFrame{
    
    public Image() {
        add(new Board());
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 300);
        setLocationRelativeTo(null);
        setTitle("Bardejov");
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Image();
    }
}
