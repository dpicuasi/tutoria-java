/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.Arrays;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio2 {

    public void main (){
        int suma=0, media;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("ingrese la dimension del vector; ");
        int v1[] = new int[sc.nextInt()];
        
        for(int i=0; i<v1.length; i++){
            System.out.println("Ingrese un numero: ");
            v1[i]=sc.nextInt();
    }
        for(int i=0; i<v1.length; i++){
            suma = suma+v1[i];
    }
          media=suma/v1.length;
          System.out.println("Se ingresaron "+v1.length+" numeros.");
          System.out.println("La media de los numeros ingresados es: "+media);
}
}
