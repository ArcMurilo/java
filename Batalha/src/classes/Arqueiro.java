package classes;

import java.util.Random;

public class Arqueiro extends Personagem{
    private Random num = new Random();
    
    public Arqueiro() {
        this.calculaVida();
        this.calculaForca();
        this.distAtaque = 3;
    }
    
    @Override
    public void calculaVida() {
        int n = num.nextInt(11);
        
        if (n == 0) n = 1;
        
        vida = n * 4;
    }
    
    @Override
    public void calculaForca() {
        int n = num.nextInt(5);
        
        if (n == 0) n = 1;
        
        forca = (int) (n * 1.5);
    }
}

