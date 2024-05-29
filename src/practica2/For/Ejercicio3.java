/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.For;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio3 {
    public void main (){
                int num,res, sum;
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese un numero:");
                num=sc.nextInt();
                sum=0;
                
                System.out.println("Los numeros pares de 1 al "+num+" son:");
                for(int i=1;i<=num;i++){
                res=i%2;
                if(res==0){
                    System.out.println(i);}
                    sum=sum+i;
                } 
                
                System.out.println("La suma de los numeros pares es: "+sum);
                
            }
    }


    
    

