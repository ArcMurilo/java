package classes;

import java.util.Random;

public class Personagem {
    protected String nome;
    protected int vida;
    protected int forca;
    protected double agilidade;
    protected double modVida;
    protected double modForca;
    private Random numRand = new Random();
    
    public Personagem() {
        
    }
    
    //TODO: implementar nos construtores o nome do personagem.
    
    public String getNome() {
        return this.nome;
    }
    
    public void zerarVida() {
        this.vida = 0;
    }
    
    public int getVida() {
        return this.vida;
    }
    
    public int getForca() {
        return this.forca;
    }
    
    public double getAgilidade() {
        return this.agilidade;
    }
    
    public int calculaVida(double modificador) {
        return (int)((numRand.nextInt(30) + 1) * modificador);
    }
    
    public int calculaForca(double modificador) {
        return (int)((numRand.nextInt(10) + 1) * modificador);
    }
    
    public int ataque() {
        int atq = numRand.nextInt(6) + 1;
        
        if (atq == 1) {
            return ((int) (this.forca * this.agilidade * 0.5));
        }
        if (atq == 6) {
            return ((int) (this.forca * this.agilidade * 1.5));
        }
        
        return (int) (this.forca * this.agilidade);
    }
    
    public void sofrerDano(int dano) {
        this.vida -= dano;
    }
}
