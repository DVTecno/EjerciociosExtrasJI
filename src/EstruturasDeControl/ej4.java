package EstruturasDeControl;

import java.util.Scanner;

public class ej4 {

    /*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
    muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingreseun numero entre (1-10) para ver su equivalente en romano ");
        int num = leer.nextInt();
        
        switch (num) {

            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");
            case 11 -> System.out.println("Graciar por utizar el sistema");

            default -> System.out.println("Ingrese un numero");
        }

    }

}
