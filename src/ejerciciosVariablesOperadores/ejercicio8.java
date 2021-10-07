package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos segundos quieres converit?");
        int segundos = teclado.nextInt();
        int horas = segundos / 3600;
        int min = (segundos % 3600) / 60 ;
        int seg = (segundos % 3600) % 60;
        System.out.println( "horas = "+ " " + horas + " " + "minutos = " + " " + min + " " + " segundos" + seg);

    }
}
