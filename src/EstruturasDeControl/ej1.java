package EstruturasDeControl;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa los minutos a calcular");
        int dia = 0;
        int hora = 0;
        int minutos = leer.nextInt();

        while (minutos >= 1440) {
            dia += 1;
            minutos = (minutos - 1440);
        }

        while (minutos >= 60) {
            hora += 1;
            minutos = minutos - 60;
        }

        System.out.println("Su equivalente es de " + dia + " dias y " + hora + " horas con " + minutos+ "  minutos");
    }

}
