package classes;

import java.util.Random;

public class Arqueiro extends Personagem{
    private final int modVida = 4;
    private final int modForca = 2;
    
    public Arqueiro() {
        this.calculaVida(this.modVida);
        this.calculaForca(this.modForca);
        this.distAtaque = 3;
    }
}

