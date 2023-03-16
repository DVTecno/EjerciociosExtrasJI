package EstruturasDeControl;

import java.util.Scanner;

public class ej5 {

    /*
    Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
    todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
    los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio,
    y luego un valor real que represente el costo del tratamiento (previo al descuento)
    y determine el importe en efectivo a pagar por dicho socio.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese clase de socio");
        char tipo = leer.next().toUpperCase().charAt(0);

        switch (tipo) {
            case 'A' -> {
                System.out.println("Ingrese nel valor de su tratamiento");
                double valor = leer.nextDouble();
                System.out.println("El costo de su tratamiento es $: " + (valor * 0.50));
            }

            case 'B' -> {
                System.out.println("Ingrese nel valor de su tratamiento");
                double valor = leer.nextDouble();
                System.out.println("El costo de su tratamiento es $: " + (valor * 0.65));
            }
            
            case 'C' -> {
                System.out.println("Ingrese nel valor de su tratamiento");
                double valor = leer.nextDouble();
                System.out.println("El costo de su tratamiento es $: " + valor );
            }
            
            default -> {
                System.out.println("Opcion Invalida");

            }
        }

    }

}
