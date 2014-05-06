/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Random;
/**
 *
 * @author Murilo
 */
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
    
    
}
