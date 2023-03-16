package EstruturasDeControl;

public class ej2 {

    /*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
 diferente a cada una. A continuación, realizar las instrucciones necesarias 
 para que: B tome el valor de C, C tome el valor de A, A tome el valor 
 de D y D tome el valor de B. Mostrar los valores iniciales y los valores 
 finales de cada variable. Utilizar sólo una variable auxiliar.

     */
    public static void main(String[] args) {
        System.out.println("  --CAMBIO DE VALORES--");

        int A = 1, B = 2, C = 3, D = 4, aux;
        System.out.println("Valor de A:" + A + ", B:" + B + ", C:" + C + ", D:" + D);
        System.out.println("despues del cambio: ");

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Valor de A:" + A + ", B:" + B + ", C:" + C + ", D:" + D);

    }

}
