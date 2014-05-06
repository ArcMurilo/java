package classes;

import java.util.Random;

public class Guerreiro extends Personagem {
    private final int modVida = 5;
    private final int modForca = 2;
    
    public Guerreiro() {
        this.calculaVida(this.modVida);
        this.calculaForca(this.modForca);
        this.distAtaque = 3;
    }
}
