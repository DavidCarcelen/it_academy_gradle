package n1.ex1;

import java.util.ArrayList;
import java.util.List;

public final class Undo {
    private List <String> entradas;

    private static Undo instance;

    private Undo(){
        entradas = new ArrayList<>();
    }

    public static Undo getInstance(){
        if (instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void addEntrada(String entrada){
        this.entradas.add(entrada);
    }

    public void delete(){
        if (!entradas.isEmpty()) {
            entradas.remove(entradas.size() - 1);
        }
    }

    public void show(){
        for(String s : entradas){
            System.out.println(s);
        }
    }
}
