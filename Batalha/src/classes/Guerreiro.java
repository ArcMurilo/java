package classes;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        this.nome = nome;
        modVida = 5;
        modForca = 2.5;
        this.calculaVida(this.modVida);
        this.calculaForca(this.modForca);
        this.agilidade = 1;
    }
}
