package classes;

public class Mago extends Personagem {
    private final int modVida = 3;
    private final float modForca = 3;
    
    public Mago() {
        this.calculaVida(this.modVida);
        this.calculaForca(this.modForca);
        this.agilidade = 1.2;
    }
}
