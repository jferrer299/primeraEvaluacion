package EstructurasDeControl;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Porfavor escriba un numero");
        int num = teclado.nextInt();
        int pi = (num % 2);
        if ( pi == 0) {
            System.out.println("El numero es par");
        }
        if (pi > 0) {
            System.out.println("El numero es impar");
        }
    }
}
