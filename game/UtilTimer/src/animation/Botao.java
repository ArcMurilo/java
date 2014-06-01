package animation;

import javax.swing.JButton;

public class Botao extends JButton{
    private int i = 1;
    
    public Botao() {
        
    }
    
    public void click() {
        System.out.println("clicando!!" + i);
        i++;
    }
}
