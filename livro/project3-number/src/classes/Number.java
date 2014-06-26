package classes;

public class Number {
    //metodo main
    public static void main(String[] args) throws Exception{
        // recebem numeros aleatorias para realizar a conta
        int number1, number2;
        // armazena o resultado
        int resposta;
        
        // gera os numeros aleatorios
        number1 = (int) (Math.round(Math.random() * 20));
        number2 = (int) (Math.round(Math.random() * 20));
        
        // armazena o código para operação
        // 0 - mult; 1 - div; 2 - soma; 3 - sub; 4 - resto. 
        int operacao;
        // gera codigo aleatório
        operacao = (int) (Math.round(Math.random()*4));
        
        System.out.print("**********\n");
        
        // checa qual operação realizar 
        if (operacao == 0) {
            System.out.println(number1 + " x " + number2);
            resposta = number1 * number2;
        }
        else if (operacao == 1) {
            System.out.println(number1 + " / " + number2);
            resposta = number1 / number2;
        } 
        else if (operacao == 2) {
            System.out.println(number1 + " + " + number2);
            resposta = number1 + number2;
        }
        else if (operacao == 3) {
            System.out.println(number1 + " - " + number2);
            resposta = number1 - number2;
        }
        else {
            System.out.println(number1 + " % " + number2);
            resposta = number1 % number2;
        }
        
        System.out.print("**********\n");
        
        System.out.print("3...");
        Thread.sleep(1000);
        System.out.print("2...");
        Thread.sleep(1000);
        System.out.print("1...");
        Thread.sleep(1000);
        
        System.out.print("Resposta: " + resposta + "\n");
    }
}
