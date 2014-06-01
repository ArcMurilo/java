package classes;

public class TV extends Equipamento {
    private final String[] canais = {"Globo", "SBT", "RedeTV", "Band", "Cultura" };
    private String canalAtivoNome;
    private int canalAtivoNum;
    private int tamanhoTela;
    private int brilho;
    private int contraste;
    private int cor;

    public TV(String modelo, String marca, String voltagem, int tamanhoTela) {
        super.modelo = modelo;
        super.marca = marca;
        super.voltagem = voltagem;
        
        super.volume = 0;
        super.ligado = false;
        
        this.modelo = modelo;
        this.marca = marca;
        this.voltagem = voltagem;
        
        this.volume = 0;
        this.ligado = false;
    }
    
    public void personalizarDisplay(int brilho, int contraste, int cor) {
        this.brilho = brilho;
        this.contraste = contraste;
        this.cor = cor;
    }
    
    @Override
    public void mudarCanalMais() {
        if (this.canalAtivoNum == 4)
            this.canalAtivoNum = 0;
        else
            this.canalAtivoNum += 1;
        this.canalAtivoNome = canais[this.canalAtivoNum];
    }
    
    @Override
    public void mudarCanalMenos() {
        if (this.canalAtivoNum == 0)
            this.canalAtivoNum = 4;
        else
            this.canalAtivoNum -= 1;
        this.canalAtivoNome = canais[this.canalAtivoNum];
    }   
}
