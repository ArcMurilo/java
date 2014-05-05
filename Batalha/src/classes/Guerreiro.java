package classes;

import java.util.Random;

public class Guerreiro extends Personagem {
    /* 
     * Classe com maior vida, força média porém deve estar próximo
     * ao seu inimigo para atacar.
    */
    
    
    
    private Random num = new Random();
    
    public Guerreiro() {
        this.calculaVida();
        this.calculaForca();
        this.distAtaque = 1;
    }
    
    @Override
    public void calculaVida() {
        int n = num.nextInt(11);
        
        if (n == 0) n = 1;
        
        vida = n * 5;
    }
    
    @Override
    public void calculaForca() {
        int n = num.nextInt(5);
        
        if (n == 0) n = 1;
        
        forca = n * 2;
    }
}
