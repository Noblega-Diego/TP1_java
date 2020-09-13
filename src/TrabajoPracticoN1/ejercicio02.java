/*
 * Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (aplica
 * Scanner y JOptionPane).
 */
package TrabajoPracticoN1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ejercicio02 {
    public static void main(String[] args){
        String nombre;
        Scanner in = new Scanner(System.in);
        //pedirle al usuario su nombre
        System.out.print("ingrese su nombre: ");
        //leemos lo ingresado por el usuario
        nombre = in.nextLine();
        //lo imprimimos el nombre con un saludo
        JOptionPane.showMessageDialog(null, "Bienvenido "+ nombre);
    }
}
