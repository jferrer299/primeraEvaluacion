package EstructurasDeControl;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maximo = 10;
        int num;
        int mayor=0;
        int menor=0;
        int cont;
        for(cont = 0;cont < maximo;cont++ ){
            System.out.println("Inserte un número: ");
            num = sc.nextInt();
            if(num>mayor)
            {mayor=num;
            }
        }


        System.out.println("El valro mayor es "+ mayor);
        System.out.println("El valro menor es "+ menor);


        }
    }








