package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos minutos quieres convertir?");
        int min = teclado.nextInt();;
        int horas = min / 60 ;
        int resto = min % 60 ;
        System.out.println(" Son" + " " + horas + " " + "horas" + " " + "y" + " " + resto + " " + "minutos" );
    }
}
