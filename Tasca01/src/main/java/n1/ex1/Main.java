package n1.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String entrada;

        do{
            System.out.println("1 - Introduce acción\n" +
                    "2 - Borra la última\n" +
                    "3 - Muestra lista\n" +
                    "4 - Salir");
            try{
                num = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Introduce un número por favor");
                sc.next();
                continue;
            }
            switch(num){
                case 1:
                    entrada = sc.next();
                    undo.addEntrada(entrada);
                    break;
                case 2:
                    undo.delete();
                    break;
                case 3:
                    undo.show();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("No es una opción válida");
                    break;
            }
        }while(num != 4);
    }
}
