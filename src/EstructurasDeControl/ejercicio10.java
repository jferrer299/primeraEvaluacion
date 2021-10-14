package EstructurasDeControl;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Escribe el segundo numero");
        int num2 = teclado.nextInt();
        System.out.println("escribe el tercer numero");
        int num3 = teclado.nextInt();

        if (num1>num2){ if (num2>num3){
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }}
        if (num2>num1){if (num1>num3){
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }}
        if (num3>num2){if (num2>num1){
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num3);
        }}
    }
}
