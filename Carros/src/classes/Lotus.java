package classes;

public class Lotus extends Carro{
    
    @Override
    public double gerarComissao() {
        return (super.getValor() * 0.15);
    }
}    
