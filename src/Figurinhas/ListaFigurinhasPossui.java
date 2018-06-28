package Figurinhas;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaFigurinhasPossui implements Serializable {

    private ArrayList<Integer> quantidade = new ArrayList<>();

    public ListaFigurinhasPossui() {
        for (int i = 0; i <= 681; i++) {
            quantidade.add(FigurinhasRepo.random());
        }
    }

    public void adicionarFigurinha(int num) {
        quantidade.set(num, quantidade.get(num).intValue() + 1);
    }

    public boolean removerFigurinha(int num) {
        if (quantidade.get(num) > 0) {
            quantidade.set(num, quantidade.get(num).intValue() - 1);
            return true;
        }
        return false;
    }

    public int getQtd(int num) {
        return quantidade.get(num);
    }
}
