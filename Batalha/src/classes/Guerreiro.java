package classes;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        this.nome = nome;
        modVida = 5;
        modForca = 2.5;
        vida = calculaVida(modVida);
        forca = calculaForca(modForca);
        agilidade = 1;
    }
}
