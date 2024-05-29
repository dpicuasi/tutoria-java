/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.Recursividad;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public void main() {
       int a, b;
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Ingrese un numero: ");
       a=sc.nextInt();
       
       System.out.println("Ingrese otro numero: ");
       b=sc.nextInt();
       
        System.out.println("La multiplicacion de "+a+" y "+b+" es : "+multiplicacionEnteraRecursiva(a,b));      
          
               }

    public int multiplicacionEnteraRecursiva(int a, int b) {
               int mult;
               
               if(b==0){
                   return 0;
                   
               }else{
                   mult=a+multiplicacionEnteraRecursiva(a, b-1);
                   return mult;
               }
    }
}
               
               
               