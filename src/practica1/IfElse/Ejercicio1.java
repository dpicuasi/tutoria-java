
package practica1.ifElse;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio1 {
    
     public void main() {
         int num1; 
         int num2;
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el primer numero:");
         num1=sc.nextInt();
         
         System.out.println("Ingrese el segundo numero:");
         num2=sc.nextInt();
         
         if((num1>0 && num1<21) && (num2>0 && num2<21)){
             if(num1>num2){
                 System.out.println("El numero "+num1+" es mayor que "+num2+".");
             }else{
                 System.out.println("El numero "+num2+" es mayor que "+num1+".");
             }
         }else{
             System.out.println("Solo se permiten numeros entre 1 al 20.");    
         }
     }   
}
