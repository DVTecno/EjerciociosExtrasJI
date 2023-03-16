package EstruturasDeControl;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        do {
            System.out.print("Ingrese una vocal: ");
            letra = leer.next();
            System.out.println("");
            if (letra.length() != 1) {
                System.out.println("Letra ingresada incorrecta ");
            }
        } while (letra.length() != 1);

        //if (letra.matches("[aeiouAEIOU]")) {
        if (letra.equalsIgnoreCase("a")
                || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i")
                || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es vocal!");

        } else {
            System.out.println("La letra ingresada no es vocal!");

        }
    }
}
