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
public class Ejercicio3 {
    public void main(){
          int [][] matriz = new int[4][4];
          Scanner sc = new Scanner(System.in);
        for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz[i].length;j++){
            System.out.print("Ingrese el numero para la posicion("+i+","+j+") de la matriz: ");
            matriz[i][j]=sc.nextInt();
        }
        }
            System.out.println("Los elementos ingresados en la matriz son: ");
              for(int i=0;i<matriz.length;i++){
              for(int j=0;j<matriz[i].length;j++){
            System.out.print(matriz[i][j]+"\t");
        }
            System.out.println("");
       }
    }
}
