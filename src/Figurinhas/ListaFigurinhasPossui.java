/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figurinhas;

import java.util.ArrayList;

/**
 *
 * @author marcos.castanheira
 */
public class ListaFigurinhasPossui {
    
    private ArrayList<Integer> quantidade = new ArrayList<>();

    public ListaFigurinhasPossui() {
        for(int i = 0; i <= 681; i++){
            quantidade.add(FigurinhasRepo.random());
        }
    }
    
    public void adicionarFigurinha(int num){
        quantidade.set(num, quantidade.get(num).intValue() + 1);
    }  
    
    public boolean removerFigurinha(int num){
        if(quantidade.get(num) > 0){
            quantidade.set(num, quantidade.get(num).intValue() - 1);
            return true;
        }
        return false;
    }
    
    public int getQtd(int num){
        return quantidade.get(num);
    }
}
