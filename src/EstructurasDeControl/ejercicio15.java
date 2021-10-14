package EstructurasDeControl;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char respuesta;
        System.out.print("¿Que lenguaje de programación estamos estudiando? a.Java b.Kotlin c.Scala d. Python");
        respuesta = teclado.next().charAt(0);
        if ( respuesta == 'a') {
            System.out.println("¡Sí!");}
        else if ( respuesta == 'b'){
            System.out.println("¡No!");
        }
        else if ( respuesta == 'c'){
            System.out.println("¡No!");
        }
        else if ( respuesta == 'd'){
            System.out.println("¡No!");
        } else {
            System.out.println("No es una opcion valida");
        }


    }
}
