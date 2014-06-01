/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class ArrayNumbers {
    //atributos

    private int num[];
    private int cont;

    //construtores sobrecarregados

    public ArrayNumbers() {
        num = new int[5];
        cont = 0;
    }
    
    public ArrayNumbers(int qtde) {
        num = new int[qtde];
        cont = 0;
    }
        
    public ArrayNumbers buscaIguais(int valor){
        ArrayNumbers rtn = new ArrayNumbers();
        int i, p = 0;
        
        for(i = 0; i < cont; i++) {
            if (num[i] == valor){
                rtn.adiciona(i);
            }
        }        
        return rtn;
    }

    //métodos
    public boolean adiciona(int valor) {
        if (cont < this.num.length) {
            this.num[cont] = valor;
            cont++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "Valores:\n";
        for (int i = 0; i < cont; i++) {
            result = result + num[i] + "\t";
        }
        return result;
    }
    
    public int soma() {
        int soma = 0;
        for (int i = 0; i < cont; i++) {
        soma = soma + num[i];
        }
        return soma;
    }

      public void gera() {
        Random gerador = new Random();
        while (cont < num.length) {
            num[cont] = gerador.nextInt(51);
            cont++;
        }
    }
      
    public ArrayNumbers inverso() {
        ArrayNumbers inverso = new ArrayNumbers();
        
        for (int i = num.length - 1; i >= 0; i--) {
            inverso.adiciona(num[i]);
        }
        
        return inverso;
    }

    
    public void ordenar() {
        int arrumar = 0;
        for (int i = 0; i < cont; i++) {
            for (int j = 0; j < cont; j++) {
                if (num[i] < num[j]) {
                    arrumar = num[i];
                    num[i] = num[j];
                    num[j] = arrumar;
                }
            }
        }
    }
    
    public int[] divisiveis(int valor) {
        int[] x = new int[this.num.length];
        int i, p = 0;
        
        for (i = 0; i < this.num.length; i++) {
            if (num[i] % valor == 0) {
                x[p] = num[i];
                p++;
            }
        }
        
        return x;
    }
       
}
     

