package classes;

import java.util.Random;

public class Arqueiro extends Personagem{

    public Arqueiro() {
        modVida = 4;
        modForca = 1.8;
        this.calculaVida(this.modVida);
        this.calculaForca(this.modForca);
        this.agilidade = 1.5;
    }
}

