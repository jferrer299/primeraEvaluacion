package ejerciciosVariablesOperadores;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("MOMENTO INICIAL");
        System.out.println("introduce la hora");
        int ihora = teclado.nextInt();
        System.out.println( "intorduce los minutos ");
        int imin = teclado.nextInt();
        System.out.println( "introduce los segundos");
        int iseg = teclado.nextInt();

        int ihotat = ihora * 3600;
        int imint = imin * 60;
        int iTotal = (ihotat) + (imint) + (iseg);


        System.out.println("MOMENTO FINAL");


        System.out.println("introduce la hora");
        int ohora = teclado.nextInt();
        System.out.println( "intorduce los minutos ");
        int omin = teclado.nextInt();
        System.out.println( "introduce los segundos");
        int oseg = teclado.nextInt();

        int ohorat = (ohora * 3600);
        int omint = (omin * 60);
        int oTotal = (ohorat) + (omint) + (oseg);

        int final_seg = oTotal - iTotal;

        int finalHoras = final_seg / 3600;
        int finalMin = (final_seg / 3600) / 60;
        int finalSeg = (final_seg / 3600) % 60;

        System.out.println(finalHoras);
        System.out.println(finalMin);
        System.out.println(finalSeg);








    }
}
