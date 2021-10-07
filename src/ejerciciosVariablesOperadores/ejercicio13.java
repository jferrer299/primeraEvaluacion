package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una cantidad de dinero");
        int dinero = teclado.nextInt();
        int bidladen = dinero / 500;
        int bi200 = ((dinero % 500) / 200);
        int bi100 = (((dinero % 500) % 200) / 100);
        int bi50 = ((((dinero % 500) % 200) % 100) / 50);
        int bi20 = (((((dinero % 500) % 200) % 100) % 50) / 20);
        int bi10 = ((((((dinero % 500) % 200) % 100) % 50) % 20) / 10);
        int bi5 = (((((((dinero % 500) % 200) % 100) % 50) % 20) % 10) / 5);
        int m2 = ((((((((dinero % 500) % 200) % 100) % 50) % 20) % 10) % 5) / 2);
        int m1 = ((((((((dinero % 500) % 200) % 100) % 50) % 20) % 10) % 5) % 2);

        if (bidladen > 0) {
            System.out.println("billetes de 500 : " + bidladen);
        }
        if (bi200 > 0) {
            System.out.println("billetes de 200 :" + bi200);
        }
        if (bi100 > 0) {
            System.out.println("billetes de 100 : " + bi100);
        }
        if (bi50 > 0) {
            System.out.println("billetes de 50 : " + bi50);
        }
        if (bi20 > 0) {
            System.out.println("billetes de 20 : " + bi20);
        }
        if (bi10 > 0) {
            System.out.println("biletes de 10 : " + bi10);
        }

        if (bi5 > 0){
            System.out.println("biletes de 5 :" + bi5);
        }
        if (m2 > 0) {
            System.out.println("monedas de 2 euros : " + m2);
        }
        if (m1 > 0 ) {
            System.out.println("monedas de 1 euro : " + m1);
        }
    }


}




