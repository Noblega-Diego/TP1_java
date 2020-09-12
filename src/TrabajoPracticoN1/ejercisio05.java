/*
 * Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
 * debemos indicarlo.
 */
package TrabajoPracticoN1;

import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercisio05 {
    public static void main(String[] args){
        int num;
        //instanciamos la clase Scanner par la lectura de datos por la terminal.
        Scanner scanner = new Scanner(System.in);
        //se le pedira al usuario que ingrese un numero
        System.out.print("ingrese el numero: ");
        num = scanner.nextInt();
        
        if(num%2 == 0){//comprovamos si es numero par
            System.out.println("el numero "+ num +" es par");
        }else{
            System.out.println("el numero "+ num +" es impar");
        }
    }
}
