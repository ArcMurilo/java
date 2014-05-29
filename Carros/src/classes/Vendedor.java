package classes;

public class Vendedor {
    private double comissaoMensal;

    public double getComissaoMensal() {
        return comissaoMensal;
    }
    
    public void calculoComissao(double valorComissaoCarro) {
        this.comissaoMensal += valorComissaoCarro;
    }
}
