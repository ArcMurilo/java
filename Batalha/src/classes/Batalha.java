package classes;

import java.util.Random;

public class Batalha {
    private Personagem player1;
    private Personagem player2;
    private String vencedor;
    private Random numRand;

    public Batalha(Personagem player1, Personagem player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public boolean fimBatalha() {
        if (player1.getVida() <= 0) {
            this.vencedor = player2.getNome();
            return true;
        }
        if (player2.getVida() <= 0) {
            this.vencedor = player1.getNome();
            return true;
        }
        
        return false;
    }
    
    public boolean luta() {
        int atqPlayer1, atqPlayer2;
        atqPlayer1 = player1.ataque();
        atqPlayer2 = player2.ataque();
        
        if (atqPlayer1 > atqPlayer2) {
            player2.sofrerDano(atqPlayer1);
            return true;
        }
        else if (atqPlayer2 > atqPlayer1) {
            player1.sofrerDano(atqPlayer2);
            return true;
        }
        
        return false;
    }
}
