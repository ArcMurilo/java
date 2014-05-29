package classes;

public class Arqueiro extends Personagem{
    public Arqueiro(String nome) {
        this.nome = nome;
        modVida = 4.0;
        modForca = 1.8;
        vida = calculaVida(modVida);
        forca = calculaForca(modForca);
        agilidade = 1.3;
    }
}