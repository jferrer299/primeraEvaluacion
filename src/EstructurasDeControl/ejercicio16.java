package EstructurasDeControl;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Porfavor diga que casa es 1.Gryffindor 2.Hufflepuff 3.Slytheryn 4.Ravenclaw ");
        int casa = teclado.nextInt();
        if (casa == 1){
            System.out.println("Valentía");
        }
        else if (casa == 2){
            System.out.println("Lealtad");
        }
        else if (casa == 3){
            System.out.println("Astucia");
        }
        else if (casa == 4){
            System.out.println("Intelecto");
        } else {
            System.out.println("No es una casa valida");
        }


    }


}
