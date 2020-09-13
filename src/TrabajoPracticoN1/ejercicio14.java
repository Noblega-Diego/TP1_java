/*
 * Codifique un programa de consola en Java que permita realizar las siguientes acciones:
 * Generar un número aleatorio entre 0 y 100, para ello use la siguiente función:
 * int x = new Double(Math.random() * 100).intValue();
 * Una vez generado el número codifique la lógica necesaria para encontrar el número aleatorio
 * ayudando al usuario informando al mismo si el número ingresado es mayor o menor al número
 * aleatorio buscado. Una vez encontrado el número muestre la cantidad de intentos necesarios
 * para lograrlo.
 */
package TrabajoPracticoN1;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio14 {
    public static void main(String[] args){
        byte numero_aleatorio = 0;
        byte numero_ingresado;
        int cantidad_intentos = 0;
        Scanner scanner = new Scanner(System.in);
        numero_aleatorio = new Double(Math.random() * 100).byteValue();
        do{
            System.out.print("ingrese el numero:");
            numero_ingresado = scanner.nextByte();
            if(numero_ingresado > numero_aleatorio){
                cantidad_intentos ++;
                System.out.println("respuesta incorrecta");
                System.out.println( numero_ingresado + " es mayor");
            }else if(numero_ingresado < numero_aleatorio){
                cantidad_intentos ++;
                System.out.println("respuesta incorrecta");
                System.out.println(numero_ingresado + " es menor");
            }
        }while(numero_ingresado != numero_aleatorio);
        System.out.println("respuesta: correcta, cantidad de intentos:" + cantidad_intentos);
    }
}
