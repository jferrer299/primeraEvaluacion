package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el valor X del primer punto");
        int x1 = teclado.nextInt();
        System.out.println("Escribe el valos Y del primer punto");
        int y1 = teclado.nextInt();
        System.out.println("Escribe el valor X del segundo punto");
        int x2 = teclado.nextInt();
        System.out.println("Escribe el valor Y del segundo punto");
        int y2 = teclado.nextInt();
        int distancia = (int) Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
        System.out.println("la distancia es = " + distancia);

    }
}
