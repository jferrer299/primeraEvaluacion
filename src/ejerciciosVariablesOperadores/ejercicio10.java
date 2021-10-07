package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner  teclado =  new Scanner (System.in);
        System.out.println("Escriba un número de 2 cifras");
        int num = teclado.nextInt();
        int decenas = num / 10;
        System.out.println(decenas);

    }
}
