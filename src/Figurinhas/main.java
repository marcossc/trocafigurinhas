package Figurinhas;

public class main {
    
    public static void main(String[] args) {
        
        /*ListaFigurinhasPossui possui = new ListaFigurinhasPossui();
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
        }*/
        
        new Thread(new Servidor.Servidor(6789)).run();
    }
}
