package EstructurasDeControl;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Teclee el año que quiere comprobar");
        int año = teclado.nextInt();
        int condicion1 = (año % 4);
        int condicion2 = (año % 100);
        int condicion3 = (año % 400);

        if (condicion1 ==0 || condicion3 ==0){
            System.out.println("El año " + año + " " + "es bisiesto");

        } else {
            System.out.println("El año " + año + " " + " no es bisiesto");
        }


    }
}
