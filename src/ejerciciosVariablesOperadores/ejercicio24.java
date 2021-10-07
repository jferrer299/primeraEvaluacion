package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio24{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es el precio del producto?");
        double precio = teclado.nextDouble();
        System.out.println("¿Cuantos productos se han comprado? ");
        double num_p = teclado.nextDouble();
        System.out.println("¿Cual es el importe del iva? (de 21% o de 10%");
        double iva = teclado.nextDouble();

        double precioProducto = (precio * (iva/100));
        double preciototal = (precioProducto * num_p);

        System.out.println(preciototal + precio);



        }
    }

