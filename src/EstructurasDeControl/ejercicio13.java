package EstructurasDeControl;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter;
        System.out.print("Porfavor diga el tipo de UVA : (A o B en mayusculas porfavor) ");
        caracter = sc.next().charAt(0);  //se obtiene el primer carácter del String introducido por teclado
        System.out.println("Diga el tamaño de la UVA: (1 o 2)");
        int tamaño = sc.nextInt();
        if ( caracter == 'A' ){ if ( tamaño == 1 ) {
            System.out.println("la ganancia inicial es de 20 centimos mas sobre el precio");
            };
        }
        if ( caracter == 'A' ){ if ( tamaño == 2 ) {
            System.out.println("la ganancia inicial es de 30 centimos mas sobre el precio");
        };
        }
        if ( caracter == 'B' ){ if ( tamaño == 1 ) {
            System.out.println("se rebajan 30 centimos del precio inicial");
        };
        }
        if ( caracter == 'B' ){ if ( tamaño == 2 ) {
            System.out.println("se rebajan 50 centimos del precio inicial");
        };
        }

    }
}
