/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.Arrays;

/**
 *
 * @author Kintydev
 */
public class Ejercicio4 {
   public void main(){
        int v1[] = {12,4,7,55,3,1,8,9,4,3,6,11,4,6,34,78,99,33,21,45};
        
        int pares=0;
        int impares=0;
        /*Contar pares e impares*/
        for(int i=0;i<v1.length;i++)
        {
            if(v1[i] % 2 ==0){//pregunto por la operacion modulo 2, que quiere decir el residuo de la division para 2
                pares++;
            }else{
                impares++;
            }
        }
        /*Dimensionar los vectores*/
        int v2[]=new int[pares];
        int v3[]=new int[impares];
        
        /*Agregar pares e impares a sus vectores*/
        for(int i=0,j=0,k=0;i<v1.length;i++)
        {
            if(v1[i] % 2 ==0){
                v2[j]=v1[i];
                j++;
            }else{
                v3[k]=v1[i];
                k++;
            }
        }
        
        /*Imprimir pares*/
        System.out.println("VECTOR DE PARES");
        for(int i=0;i<v2.length;i++){
            System.out.print("v2["+i+"]"+"="+v2[i]+"   ");
        }
        System.out.println("");
        System.out.println("");
        /*Imprimir impares*/
        System.out.println("VECTOR DE IMPARES");
        for(int i=0;i<v3.length;i++){
            System.out.print("v3["+i+"]"+"="+v3[i]+"   ");
        }
        System.out.println("");
        System.out.println("");
    }
    
    
}
