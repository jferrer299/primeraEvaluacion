package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es el precio del producto");
        float precio = teclado.nextFloat();
        float fprecio =((precio * 85)/100);
        System.out.println(fprecio);
    }
}
