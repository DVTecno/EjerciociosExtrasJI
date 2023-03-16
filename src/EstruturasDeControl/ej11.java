package EstruturasDeControl;

import java.util.Scanner;


public class ej11 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = leer.nextInt();
        int contador = 0;
        do {            
            num = num/10;
            contador ++;
        } while (num!=0);
        System.out.println("El número tiene " + contador + " dígitos.");
    }

}
