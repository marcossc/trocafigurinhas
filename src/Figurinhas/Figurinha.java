/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figurinhas;

/**
 *
 * @author marcos.castanheira
 */
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
