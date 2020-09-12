/*
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
 * son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
 * 
 */
package TrabajoPracticoN1;

/**
 *
 * @author diego
 */
public class ejercisio04 {
    public static void main(String[] args){
        int num1 = 22;
        int num2 = 22;
        if(num1 == num2){// si son iguales
            System.out.println("los numeros "+ num1 +" y "+ num2 +" son iguales");
        }else if(num1>num2){//si num1 > num2
            System.out.println("el numero " + num1 + " es mas grande que" + num2);
        }else{//si num2 > num1
            System.out.println("el numero " + num2 + " es mas grande que" + num1);
        }
    }
}
