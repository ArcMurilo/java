package classes;

import java.util.Random;

public class Guerreiro extends Personagem {
    private final int modVida = 5;
    private final float modForca = 2.5;
    
    public Guerreiro() {
        this.calculaVida(this.modVida);
        this.calculaForca(this.modForca);
        this.agilidade = 1;
    }
}
