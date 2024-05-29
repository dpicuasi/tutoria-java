/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.While;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio2 {
     public void main() {
         int n1, n2, n3 = 0, prom;
         Scanner sc= new Scanner(System.in);
         
         System.out.println("Ingrese la primera nota: ");
         n1=sc.nextInt();
         
         while(n1<1 || n1>10){
             System.out.println("Solo se permiten notas de 1 a 10 ");
             System.out.println("Ingrese la primera nota: ");
             n1=sc.nextInt();
             
         }
             System.out.println("Ingrese la segunda nota: ");
               n2=sc.nextInt();
               
         while(n2<1 || n2>10){
             System.out.println("Solo se permiten notas de 1 a 10 "); 
             System.out.println("Ingrese la segunda nota: ");
             n2=sc.nextInt();
             
               System.out.println("Ingrese la tercera nota: ");
               n3=sc.nextInt();
         }

         while(n3<1 || n3>10){
             System.out.println("Solo se permiten notas de 1 a 10");
             System.out.println("Ingrese la tercera nota: ");
             n3=sc.nextInt();
             
         }
         prom=(n1+n2+n3)/3;
         
         System.out.println("El promedio de las notas ingresadas es: "+prom);
         
         }
     }
   
     
     

