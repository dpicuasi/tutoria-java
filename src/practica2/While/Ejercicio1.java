
package practica2.While;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio1 {
    public void main (){
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese numero, 0 para terminar");
        num= sc.nextInt();
        while(num!=0){
             System.out.println(num);
              System.out.println("Ingrese otro numero, 0 para terminar:");
              num= sc.nextInt();
        }
         System.out.println("Ha terimnado la ejecucion.");
            
        }
    }

