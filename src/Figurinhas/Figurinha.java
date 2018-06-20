package Figurinhas;

public class Figurinha {
    
    private String tipo;
    private int numero;

    public Figurinha(int numero, String tipo) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return FigurinhasRepo.lpad(String.valueOf(getNumero()), "0", 3) + " - " + FigurinhasRepo.rpad(getTipo(), " ", 13);
    }
    
}
