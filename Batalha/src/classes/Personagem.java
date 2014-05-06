package classes;

import java.util.Random;

public class Personagem {
    protected String nome;
    protected int vida;
    protected int forca;
    protected int agilidade;
    protected int posicao;
    private Random numRand;
    
    public Personagem() {
        
    }
    
    public void calculaVida(int modificador) {
        this.vida = ((numRand.nextInt(10) + 1) * modificador);
    }
    
    public void calculaForca(int modificador) {
        this.forca = ((numRand.nextInt(10) + 1) * modificador);
    }
    
    public int ataque() {
        int atq = numRand.nextInt(6) + 1;
        
        if (atq == 1) {
            return ((int) (this.forca * 0.5));
        }
        if (atq == 6) {
            return ((int) (this.forca * 1.5));
        }
        
        return this.forca;
    }
    
    public void sofrerDano(int dano) {
        this.vida -= dano;
    }
}
