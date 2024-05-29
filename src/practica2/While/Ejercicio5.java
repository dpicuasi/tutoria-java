
package practica2.While;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio5 {
    public void main (){
        int num, n;
        num = (int) (Math.random() * 20) + 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el  numero a divinar:");
        n=sc.nextInt();
        System.out.println("Ingreseun numero:");
        num=sc.nextInt();
        
        while(n!=num){
            if(num>n){
                  System.out.println("Menor");
            }else{
                 System.out.println("Mayor");
            }
             System.out.println("Ingrese un numero:");
             num=sc.nextInt();
        }
             System.out.println("Felicidades, acertaste !!!, el numero ingresado era "+n);
            
       
            }
        }
        
        
    

