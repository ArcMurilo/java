package classes;

public abstract class Equipamento {
    protected String modelo;
    protected String marca;
    protected String voltagem;
    protected int volume;
    protected boolean ligado;

    public Equipamento() {
        
    }
    
    public int getVolume() {
        return this.volume;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getVoltagem() {
        return voltagem;
    }
    
    public String ligar() {
        this.ligado = true;
        return "ligado";
    }
    
    public String desligar() {
        this.ligado = false;
        return "desligado";
    }
    
    public boolean isLigado() {
        return this.ligado;
    }
    
    public void aumentarVolume() {
        if (this.volume < 99){
            this.volume += 2;
        }        
    }
    
    public void dimiuirVolume() {
        if (this.volume > 1) {
            this.volume -= 2;                    
        }
    }
    
    public abstract void mudarCanalMais();
    public abstract void mudarCanalMenos();
    public abstract String getCanal();
    public void mudarAM_FM() {} ;
    public int getAmFm() {return 0;};
}
