/*
 * Muestra los números del 1 al 100 (ambos incluidos) que sean divisibles entre 2 y 3. Utiliza el bucle que
 * desees.
 */
package TrabajoPracticoN1;

/**
 *
 * @author diego
 */
public class ejercicio09 {
    public static void main(String[] args){
        for(int num = 1; num <= 100; num++){//se verifica si el numero es dibisible entre 2 y 3
            if(num%2 == 0 && num%3 == 0)
                System.out.println("num: "+ num + " es dibisible entre 2 y 3");
            else
                System.out.println("num: "+ num + " no es dibisible...");
        }
    }
}
