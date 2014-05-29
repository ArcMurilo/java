package classes;

import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import tela.TelaPrincipal;

public class Batalha {
    private Personagem player1;
    private Personagem player2;
    private String vencedor;
    private Random numRand;
    private ImageIcon img;
    
    private Timer x; //Timer da batalha
    //private TelaPrincipal janelaPai; //Referencia a janela pai da batalha 
    
    public Batalha(Personagem player1, Personagem player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean fimBatalha() {
        if (player1.getVida() <= 0) {
            player1.zerarVida();
            this.vencedor = player2.getNome();
            return true;
        }
        if (player2.getVida() <= 0) {
            player2.zerarVida();
            this.vencedor = player1.getNome();
            return true;
        }
        return false;
    }

    public int turno() {
        int atqPlayer1, atqPlayer2;

        atqPlayer1 = player1.ataque();
        atqPlayer2 = player2.ataque();

        img = new ImageIcon(getClass().getResource("/imagens/pow.png"));
        if (atqPlayer1 > atqPlayer2) {
            player2.sofrerDano(atqPlayer1);
            //imgPlayer2.setIcon(img);
            return 2;
        } else if (atqPlayer2 > atqPlayer1) {
            player1.sofrerDano(atqPlayer2);
            //imgPlayer1.setIcon(img);
            return 1;
        }
        return 0;
    }

    public void luta() {
        //Gatilho
        x = new Timer(1000, porrada);

        x.start();
    }

    //Instrucoes da batalha
    Action porrada = new AbstractAction() {
        int quemSofreDano;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!fimBatalha()) {
                quemSofreDano = turno();

                if (quemSofreDano == 1) {
                    // TODO: img de dano no player 1;
                    System.out.println("Player 1 tomou porrada");
                } else if (quemSofreDano == 2) {
                    // TODO: img de dano no player 2;
                    System.out.println("Player 2 tomou porrada");
                } else {
                    // TODO: img de miss nos dois;
                    System.out.println("MISS!");
                }

                System.out.println("HP Player 1: " + player1.getVida());
                System.out.println("HP Player 2: " + player2.getVida());
            } else {
                System.out.println("Acabou a porrada!");
                x.stop();
            }
        }
    };

}
