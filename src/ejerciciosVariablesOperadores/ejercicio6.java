package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantas ardillas hay?");
        int ardi = teclado.nextInt();
        System.out.println("¿Cuantas nueces hay?");
        int nuc = teclado.nextInt();
        int reparto = nuc / ardi;
        int sobran = nuc % ardi;
        System.out.println("Cada ardilla tocaria a "+ reparto + " " + "nueces" + "y" + "sobrarian " + sobran + " " + "nueces" );
    }
}
