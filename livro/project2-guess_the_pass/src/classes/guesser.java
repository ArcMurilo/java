package classes;

import javax.swing.*;

public class guesser {
    // metodo main
    public static void main(String[] args) {
        // variavel para armazenar o valor informado pelo usuario
        String input;
        // receber o valor
        input = JOptionPane.showInputDialog("Qual a palavra secreta?");
        
        //testa se o jogador acertou
        if (input.toLowerCase().equals("evil genius")) {
            System.out.print("Parabéns, você acertou!");
        }
        else {
            System.out.print("=( errou...");
        }
        
        System.out.print("\n");
    }
}
