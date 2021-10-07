package EstructurasDeControl;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Porfavor diga el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Porfavor teclee el segundo numero ");
        int num2 = teclado.nextInt();
        if (num1 > num2) {
            System.out.println("El primer numero es mayor que el segundo");
        }else {
            System.out.println("El segundo numero es mayor que el primero");
        }
    }
}
