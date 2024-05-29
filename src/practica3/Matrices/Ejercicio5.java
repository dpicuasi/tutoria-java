/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.Matrices;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio5 {
     public void main(){
         int[][] m1={{23,4,6,},{33,6,12},{5,66,3}};
         int n;
         boolean bandera=false;
         
         Scanner sc=new Scanner(System.in);
                 
                 System.out.println("Ingrese el numero a buscar en la matriz: ");
                 n=sc.nextInt();
                 
                 for(int i=0; i<m1.length;i++){
                 for(int j=0; j<m1[i].length;j++){
                     if(n==m1[i][j]){
                     System.out.println("El numero "+n+" se encuentra en la posicion["+i+"]["+j+"].");
                     bandera=true;
                     break;
                 }
                 }
              if(!bandera){
                  System.out.println("No se encontro el numero "+n+" en la matriz.");
                     
                 }
     }
     }
}


