/*
 * Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te
 * pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la 
 * contraseña y mostrara un mensaje diciendo “Acceso Correcto”. Piensa bien en la condición de
 * salida (3 intentos y si acierta sale, aunque le queden intentos).
 */
package TrabajoPracticoN1;

import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio11 {
    //el static usado en los metodos tales como el main para usar el metodo sin necesidad de instanciar la clase
    public static void main(String[] args){
        String password = "qwert321";
        String passwordUser;
        boolean pase = false;
        Scanner scanner = new Scanner(System.in);
        byte intentos = 0;
        //verificacion de la contraseña
        do{
            System.out.print("ingrese la contraseña:");
            passwordUser = scanner.nextLine();
            if(passwordUser.equals(password)){//se usa objeto.equals(objeto a comparar) para comparar objetos entre si
                pase = true;
            }else{
                intentos ++;
            }
        }while((intentos < 3) && (pase == false));
        
        //combrueba si tiene el acceso
        if(pase){
            System.out.println("Acceso Correcto");
        }
    }
}
