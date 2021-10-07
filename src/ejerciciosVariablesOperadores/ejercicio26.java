package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es el sueldo base?");
        float sueldo = teclado.nextFloat();
        System.out.println("¿Cuanto vale la primera venta ?");
        float v1 = teclado.nextFloat();
        System.out.println("¿Cuanto vale la segunda venta ?");
        float v2 = teclado.nextFloat();
        System.out.println("¿Cuanto vale la tercera venta ?");
        float v3 = teclado.nextFloat();
        //Calculamos el porcentaje
        float pv1 = ((v1*10)/100);
        float pv2 = ((v2*10)/100);
        float pv3 = ((v3*10)/100);
        float fsueldo = ((sueldo)+(pv1)+(pv2)+(pv3));
        System.out.println(fsueldo);


    }
}
