/*
 * Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
 * multiplicación, división y módulo (resto de la división).
 */
package TrabajoPracticoN1;

/**
 *
 * @author diego
 */
public class ejercicio03 {
    public static void main(String[] args){
        int num1 = 64;
        int num2 = 32;
        float result = num1+num2;
        System.out.println("suma: " + result);
        result = num1-num2;
        System.out.println("resta: " + result);
        result = num1*num2;
        System.out.println("multiplicacion:" + result);
        result = num1/num2;
        System.out.println("divicion:" + result);
        result = num1%num2;
        System.out.println("modulo:" + result);
    }
    
}
