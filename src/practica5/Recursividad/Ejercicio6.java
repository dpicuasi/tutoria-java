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
public class Ejercicio6 {
     public void main(){
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese dos numero a multiplicar:");
        System.out.println("Ingrese número 1:");
        a=sc.nextInt();
        System.out.println("Ingrese número 2:");
        b=sc.nextInt();
        
        int respuesta=multipliEntera(a, b);
        System.out.println("Respuesta: "+respuesta);
        
    }
    
    private int multipliEntera(int a, int b) { 
        if (b == 0 ){
            return b; 
        } else {
            return  a + multipliEntera(a,(b-1)); 
        }
    }
}
