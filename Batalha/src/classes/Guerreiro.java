package classes;

import java.util.Random;

public class Guerreiro extends Personagem {

    public Guerreiro() {
        modVida = 5;
        modForca = 2.5;
        this.calculaVida(this.modVida);
        this.calculaForca(this.modForca);
        this.agilidade = 1;
    }
}
