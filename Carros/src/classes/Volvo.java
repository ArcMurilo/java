package classes;

public class Volvo extends Carro {
    
    @Override
    public double gerarComissao() {
        return (super.getValor() * 0.10);
    }
}