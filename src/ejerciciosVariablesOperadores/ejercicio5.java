package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Porfavor esriba un numero entero");
        int n = teclado.nextInt();
        int op = ((n + 1)* n + 2)* n +3 ;
        System.out.println("El resultado de la operacion es = "+ op);
    }
}
