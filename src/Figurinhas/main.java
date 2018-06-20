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
public class main {
    
    public static void main(String[] args) {
        
        ListaFigurinhasPossui possui = new ListaFigurinhasPossui();
        possui.adicionarFigurinha(2);
        possui.adicionarFigurinha(2);
        possui.adicionarFigurinha(3);
        
        for(int i = 1; i <= 6; i++){
            System.out.println(FigurinhasRepo.lista().get(i) + " - " + possui.getQtd(i));
        }
    
        if(possui.removerFigurinha(2))
            System.out.println("Removida");
        
        
        if(!possui.removerFigurinha(5))
            System.out.println("falha");
        
        for(int i = 1; i <= 6; i++){
            System.out.println(FigurinhasRepo.lista().get(i).getNumero() + " - " + possui.getQtd(i));
        }
    }
}
