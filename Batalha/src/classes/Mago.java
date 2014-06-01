package classes;

public class Mago extends Personagem {

    /**
     *
     * @param nome
     */
    public Mago(String nome) {
        this.nome = nome;
        modVida = 3;
        modForca = 3;
        vida = calculaVida(modVida);
        forca = calculaForca(modForca);
        agilidade = 1.2;
    }
}
