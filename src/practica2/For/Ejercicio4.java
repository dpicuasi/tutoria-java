
package practica2.For;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio4 {
            public void main (){
                int num, sum, cont, sueldo;
                sum=0;
                cont=0;
                Scanner sc = new Scanner(System.in);
                System.out.println("Numero de sueldos a ingresar:");
                num=sc.nextInt();
                
                for(int i=1;i<=num;i++){
                    System.out.println("Ingrese el sueldo "+i+" :");
                    sueldo=sc.nextInt();
                    sum=sum+sueldo;
                    
                    if(sueldo>1000){
                     cont=cont+1;
                 }
                }
                System.out.println("la suma de los "+num+" sueldos es:"+sum);
                System.out.println("El numero de sueldos mayores a 1000 son: "+cont);
                
                
                     
    }
}
