package classes;

import java.util.Random;

public class Mago extends Personagem {
    private Random num = new Random();
    
    public Mago() {
        this.calculaVida();
        this.calculaForca();
        this.distAtaque = 3;
    }
    
    @Override
    public void calculaVida() {
        int n = num.nextInt(11);
        
        if (n == 0) n = 1;
        
        vida = n * 3;
    }
    
    @Override
    public void calculaForca() {
        int n = num.nextInt(5);
        
        if (n == 0) n = 1;
        
        forca = n * 3;
    }
}
