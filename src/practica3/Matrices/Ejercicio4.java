/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.Matrices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio4 {
     public void main(){
        try{
            System.out.println("*********************MATRIZ****************************");
            int [][] matriz;
            int filas=0;
            int columnas=0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de filas: ");
            filas=sc.nextInt();
            while(filas<=0){
             System.out.print("Ingrese un valor mayor a 0: ");    
             filas=sc.nextInt();
            }
            System.out.print("Ingrese la cantidad de columnas: ");
            columnas=sc.nextInt();
            while(columnas<=0){
             System.out.print("Ingrese un valor mayor a 0: ");    
             columnas=sc.nextInt();
            }
            matriz = new int[filas][columnas];
            
            /*Ingreso de valores en la matriz*/
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    System.out.print("Ingrese el numero para la posicion("+i+","+j+") de la matriz: ");
                    matriz[i][j]=sc.nextInt();
                }
            }
            
            System.out.println("*********************IMPRESION****************************");
            
            System.out.println("Los elementos ingresados en la matriz son: ");
              for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                   System.out.print(matriz[i][j]+"\t");
                }
                System.out.println();
              }
        
        }catch(InputMismatchException e1){    
          System.out.println("Solo se permite el ingreso de numeros.");
        }
        
    }
}
