/*
 * Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel
 * solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible
 * entre 5, sin embargo, 17 si es primo. Un buen truco para calcular la raíz cuadrada del numero e
 * ir comprobando que si es divisible desde ese número hasta 1.
 * NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
 */
package TrabajoPracticoN1;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercisio13 {
    public static void main(String[] args){
        int numero;
        byte contadorDeDivisores;//cantidad de divisores. ya que solo necesitamos 3 divisores para saber si es impar, por esa razon se eligio el byte 
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        numero = scanner.nextInt();
        if(numero <= 1){
            System.out.println(numero + " no es primo");
        }else{
            //nos qedan solo los nmeros mayores a dos teniendo en cuenta que todo numero entero es dibisible por si mismo y el uno
            //por lo tanto inicializamos el contador en 2
            contadorDeDivisores = 2;
            //se busca algun otro numero que pueda llegar a ser dibisible 
            for(int i = 2; i<numero; i++){
                if(numero%i == 0 && numero != 2){
                    contadorDeDivisores++;
                    //apenas encuentre almenos un numero dibisible i = num, para luego dejar de seguir iterando o buscando;
                    i = numero;
                }
            }
            if(contadorDeDivisores == 2){
                System.out.println(numero + " es primo");
            }else{
                System.out.println(numero + " no es primo");
            }
        }
                
    }
}
