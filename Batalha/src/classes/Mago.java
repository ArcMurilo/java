package classes;

public class Mago extends Personagem {

    public Mago(String nome) {
        this.nome = nome;
        modVida = 3;
        modForca = 3;
        this.calculaVida(this.modVida);
        this.calculaForca(this.modForca);
        this.agilidade = 1.2;
    }
}
