package EstruturasDeControl;

import java.util.Scanner;


public class ej9 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero mayor a 1:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el divisor:");
        int num2 = leer.nextInt();
        while (num1<num2) {            
            System.out.println("El divisor debe ser mayor, ingrese nuevamente");
            num2 = leer.nextInt();
        }
        int contador = 0;
        do {            
            num1 -= num2;
            contador ++; // contador = contador + 1
        } while (num1>=num2);
        System.out.println("El residuo es " + num1 + " y el cociente es " + contador);
        System.out.println("");
        
    }

}
