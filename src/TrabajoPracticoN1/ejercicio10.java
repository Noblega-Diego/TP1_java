/*
 * Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es
 * lo volverá a pedir (do while), después muestra ese número por consola.
 */
package TrabajoPracticoN1;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio10 {
    public static void main(String[] args){
        short num;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("ingrese un numero positivo");
            num = scanner.nextShort();
        }while(num < 0);
        
    }
}
