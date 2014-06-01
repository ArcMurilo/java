package classes;

public abstract class Equipamento {
    protected String modelo;
    protected String marca;
    protected String voltagem;
    protected int volume;
    protected boolean ligado;

    public Equipamento() {
        
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
        this.volume += 2;
    }
    
    public void dimiuirVolume() {
        this.volume -= 2;
    }
    
    public abstract void mudarCanalMais();
    public abstract void mudarCanalMenos();
    
}
