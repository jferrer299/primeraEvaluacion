package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Porfavor escriba un número");
        int num1 = teclado.nextInt();
        System.out.println("Porfavor escriba un segundo número");
        int num2 = teclado.nextInt();
        System.out.println("Porfavor escriba un tercer número");
        int num3 = teclado.nextInt();
        System.out.println("Porfavor escriba un cuarto número");
        int num4 = teclado.nextInt();
        int suma = num1 + num2;
        int producto = num3 * num4;
        System.out.println("La suma de los dos primeros numero es ="+ suma + " "+ "El producto del tercer y cuarto numero es = " + " " + producto);
    }
}
