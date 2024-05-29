
package practica1.Switch;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio1 {
     public void main() { 
         int num;
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el mes en numeros: ");
         num=sc.nextInt();
         
         switch(num){
             case 1:
                 System.out.println("El mes ingresado es ENERO.");
                 break;
             case 2:
                 System.out.println("El mes ingresado es FEBRERO.");
                 break;
             case 3:
                 System.out.println("El mes ingresado es MARZO.");
                 break;
             case 4:
                 System.out.println("El mes ingresado es ABRIL.");
                 break;
             case 5:
                 System.out.println("El mes ingresado es MAYO.");
                 break;
             case 6:
                 System.out.println("El mes ingresado es JUNIO.");
                 break;
             case 7:
                 System.out.println("El mes ingresado es JULIO.");
                 break;
             case 8:
                 System.out.println("El mes ingresado es AGOSTO.");
                 break;
             case 9:
                 System.out.println("El mes ingresado es SEPTIEMBRE.");
                 break;
             case 10:
                 System.out.println("El mes ingresado es OCTUBRE.");
                 break;
             case 11:
                 System.out.println("El mes ingresado es NOVIEMBRE .");
                 break;
             case 12:
                 System.out.println("El mes ingresado es DICIEMBRE.");
                 break;

             default:
                  System.out.println("Mes es incorrecto.");
                  break;
         }
     }
}
