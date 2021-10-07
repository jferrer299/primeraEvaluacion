package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Escriba un numero de 2 dígitos");
        int num = teclado.nextInt();
        int d = num/10;
        int u = num % 10;
        int inversion = ((u*10) + d );
        System.out.println(inversion);
    }
}
