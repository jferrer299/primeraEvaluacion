package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numro de 3 cifras");
        int num = teclado.nextInt();
        int c = num /100;
        int d = (num % 100) /10;
        int u = (num % 100) % 10;
        int inversion = ((u*100) + (d *10) + c );
        System.out.println(inversion);
    }
}
