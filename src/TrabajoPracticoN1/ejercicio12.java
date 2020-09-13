/*
 * Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no
 * (siendo sábado y domingo no laborales). Usa un switch para ello. Valida que el número
 * ingresado sea un valor entre 1 y 7, caso contrario solicite el valor nuevamente.
 */
package TrabajoPracticoN1;

import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio12 {
    public static void main(String[] args){
        byte diaSem;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("ingrese el dia: ");
            diaSem = scanner.nextByte();
        }while(diaSem <= 0 || diaSem >= 8);
        
        switch(diaSem){
            case 1:
                System.out.println("lunes: laboral");
            break;
            case 2:
                System.out.println("martes: laboral");
            break;
            case 3:
                System.out.println("miercoles: laboral");
            break;
            case 4:
                System.out.println("jueves: laboral");
            break;
            case 5:
                System.out.println("viernes: laboral");
            break;
            case 6:
                System.out.println("sabado: dia no laboral");
            break;
            case 7:
                System.out.println("domingo: dia no laboral");
            break;      
        }
    }
}
