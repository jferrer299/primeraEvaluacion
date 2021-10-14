package EstructurasDeControl;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dia (formato número)");
        int dia = teclado.nextInt();
        System.out.println("Escribe el mes (formato numero)");
        int mes  = teclado.nextInt();
        System.out.println("teclee el año (formato numero)");
        int año = teclado.nextInt();

        if (dia > 0 && dia < 31){ if (mes >0 && mes < 12) {
            System.out.println("La fecha es correcta");
        }
    }
}}
