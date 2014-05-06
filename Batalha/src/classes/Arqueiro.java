package classes;

public class Arqueiro extends Personagem{

    public Arqueiro(String nome) {
        this.nome = nome;
        modVida = 4;
        modForca = 1.8;
        this.calculaVida(this.modVida);
        this.calculaForca(this.modForca);
        this.agilidade = 1.5;
    }
}

