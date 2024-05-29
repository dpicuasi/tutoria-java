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
public class Ejercicio6 {
    public void main() {
        // TODO code application logic here
        int v1[][] = {{10,2,9},{45,6,2},{12,2,8}};
        int cont = 0;
        boolean bandera = false;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero que desea buscar: ");
        int numB = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < v1.length; i++){
            for (int j = 0; j < v1[i].length; j++){
            if (numB == v1[i][j]){
                //System.out.println("El numero se encuetra en el indice :" + numB + " esta en la posicion: " + "[" + i +"]"+"[" + j +"]");
                cont+=1;
                bandera=true;
                break;
            } /*else {
                System.out.println("El numero no se encuetra en el array " );
            }*/                
        }            
    }
        System.out.println("El numero : " + numB + " se encuentra : " + cont + " veces en la matriz ");
        if(!bandera){
            System.out.println("El numero ingresado no se encuentra");
        }
  }  

}
