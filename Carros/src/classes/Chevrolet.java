package classes;

public class Chevrolet extends Carro{ 
    
    @Override
    public double gerarComissao() {
        return (super.getValor() * 0.05);
    }
}
