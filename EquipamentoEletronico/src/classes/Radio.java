package classes;

public class Radio extends Equipamento{
    private int AM_FM; // 0 AM / 1 FM
    private final String estacoesAM[] = { "Radio Difusora", "Radio Cultura", "Radio Jovem Pan AM" };
    private final String estacoesFM[] = { "Jovem Pan", "Ótima FM", "99.9 FM" };
    private int estacaoAtivaNumFM;
    private int estacaoAtivaNumAM;
    private String estacaoAtivaNome;
    
    public Radio(String modelo, String marca, String voltagem) {
        super.modelo = modelo;
        super.marca = marca;
        super.voltagem = voltagem;
        
        this.AM_FM = 0;        
        this.estacaoAtivaNumFM = 0;
        this.estacaoAtivaNumAM = 0;
        this.estacaoAtivaNome = estacoesAM[0];
    }
    
    public void mudarAM_FM() {
        if (AM_FM == 0) {
            this.AM_FM = 1;
            this.estacaoAtivaNome = estacoesFM[this.estacaoAtivaNumFM];
        }
        else {
            this.AM_FM = 0;
            this.estacaoAtivaNome = estacoesAM[this.estacaoAtivaNumAM];
        }            
    }
    
    public void mudarCanalMais() {
        if(AM_FM == 0) {
            if (estacaoAtivaNumAM == 2)
                estacaoAtivaNumAM = 0;
        else
            estacaoAtivaNumAM += 1;
        estacaoAtivaNome = estacoesAM[estacaoAtivaNumAM];
        }
        else {
            if (estacaoAtivaNumFM == 2)
                estacaoAtivaNumFM = 0;
        else
            estacaoAtivaNumFM += 1;
        estacaoAtivaNome = estacoesAM[estacaoAtivaNumAM];
        }     
    }
    
    public void mudarCanalMenos() {
        if(AM_FM == 0) {
            if (estacaoAtivaNumAM == 0)
                estacaoAtivaNumAM = 2;
        else
            estacaoAtivaNumAM -= 1;
        estacaoAtivaNome = estacoesAM[estacaoAtivaNumAM];
        }
        else {
            if (estacaoAtivaNumFM == 0)
                estacaoAtivaNumFM = 2;
        else
            estacaoAtivaNumFM -= 1;
        estacaoAtivaNome = estacoesAM[estacaoAtivaNumAM];
        }     
    }
}
