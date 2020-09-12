/*
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
 * el precio final con IVA. El IVA sera una constante que sera del 21%.
 */
package TrabajoPracticoN1;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercisio06 {
    public static void main(String[] args){
        final int IVA = 21;
        
        float valorProducto;
        float valorProductoIVA;
        Scanner scanner = new Scanner(System.in);
        //se le pide al usuario el precio del prodcto
        System.out.print("ingrese el precio del producto: ");
        valorProducto = scanner.nextFloat();
        //se procede a calcular el precio sumado el IVA
        valorProductoIVA = valorProducto + valorProducto * IVA/100;
        //se mostrara al usuario el valor del producto con IVA
        System.out.println("el valor del producto mas el IVA es de: "+ valorProductoIVA);
    }
}
