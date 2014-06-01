package classes;

public class TV extends Equipamento {
    private final String[] canais = {"Globo", "SBT", "RedeTV", "Band", "Cultura" };
    private String canalAtivoNome;
    private int canalAtivoNum;
    private int tamanhoTela;

    public TV(String modelo, String marca, String voltagem, int tamanhoTela) {
        super.modelo = modelo;
        super.marca = marca;
        super.voltagem = voltagem;
        
        super.volume = 0;
        super.ligado = false;
   
        this.tamanhoTela = tamanhoTela;
        this.canalAtivoNum = 0;
        this.canalAtivoNome = this.canais[0];
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
    
    @Override
    public String getCanal() {
        return this.canalAtivoNome;
    }
}
