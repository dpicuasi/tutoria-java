/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.DoWhile;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio2 {
     public void main() {
         int nota, contMayor=0, contMenor=0;  
         Scanner sc = new Scanner(System.in);
         
         do{
            System.out.println("Ingrese una nota: ") ;
            nota=sc.nextInt();
            if(nota>=7){
                contMayor=contMayor+1;
            }else{
                contMenor=contMenor+1;
            }
            }while(nota!=0);

                System.out.println("Ejecucion finalizada. ") ;
                System.out.println("El numero de notas mayores o iguales a 7 son: "+contMayor);
                System.out.println("El numero de notas menores a 7 son. "+contMenor) ;
         
         }
     }

