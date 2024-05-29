 
package practica2.DoWhile;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio3 {
     public void main() {
       int num,contUnidades=0,contDecenas=0,contCentenas=0, contMiles=0;
       Scanner sc = new Scanner (System.in);
       do{
       System.out.println("Ingrese un numero:");
       num = sc.nextInt();
       
       if((num>=1) && (num<=9)){
            System.out.println("El numero ingresado es de una cifra ");
           contUnidades=contUnidades+1;
       }else{ 
           if((num>=10) && (num<=99)){
           System.out.println("El numero ingresado es de dos cifras ");
           contDecenas=contDecenas+1;
       }else{ 
           if((num>=100) && (num<=999)){
               System.out.println("El numero ingresado es de tres cifras ");
           
           contCentenas=contCentenas+1;
       }else{ 
           if((num>=1000) && (num<=9999)){
           System.out.println("El numero ingresado es de cuatro cifras ");
           }
           contMiles=contMiles+1;
       }
       }
       }
//       //break corta la ejecucion 
//       if(num==5){
//       break;
//       }
       
       }while(num!=0);
       System.out.println("Ejecucion finalizada:");
       System.out.println("El numero de una cifra es: "+contUnidades );
       System.out.println("El numero de dos cifras es: "+contDecenas );
       System.out.println("El numero de tres cifras es: "+contCentenas );
       System.out.println("El numero de cuatro cifras es: "+contMiles );
       
      }  

        
    }

