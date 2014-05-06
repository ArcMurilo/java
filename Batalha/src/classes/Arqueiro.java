package classes;

import java.util.Random;

public class Arqueiro extends Personagem{
    private final int modVida = 4;
    private final float modForca = 1.8;
    
    public Arqueiro() {
        this.calculaVida(this.modVida);
        this.calculaForca(this.modForca);
        this.agilidade = 1.5;
    }
}

