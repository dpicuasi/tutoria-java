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
public class Ejercicio1 {
    
    public  void main() {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        num=sc.nextInt();
        
        System.out.println("El factorial de "+num+" es : "+factorial(num));
        
    }
    public int factorial(int num){
        int res;
        if(num==0){
            return 1;
        }else{

               res=num*factorial(num-1) ;
               return res;
    }
    
     
}
}
