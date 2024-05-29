/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.DoWhile;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio6 {
    public void main (){
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        
        while(opcion!=4){
            
        System.out.println("******************  MENU  DEL SISTEMA *********************************");
        System.out.println("***** OPCIONES, SELECCIONE ********************************************");
        System.out.println("* (1).- EJERCICIO 1 ");
        System.out.println("* (2).- EJERCICIO 2 ");
        System.out.println("* (3).- EJERCICIO 3 ");
        System.out.println("* (4).- SALIR ");
        System.out.println("***********************************************************************");
        System.out.print("Digite su opcion: ");
        opcion = sc.nextInt();
        switch (opcion){
                case 1:
                        /***************EJERCICIO 1*********************/
                        int num;
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Ingrese numero, 0 para terminar");
                        num= sc1.nextInt();
                        while(num!=0){
                             System.out.println(num);
                              System.out.println("Ingrese otro numero, 0 para terminar:");
                              num= sc1.nextInt();
                        }
                        System.out.println("Ha terimnado la ejecucion.");
                        /**************************************/
                break;    
             case 2:
                /***************EJERCICIO 2*********************/
                    int n1, n2, n3 = 0, prom;
                    Scanner scn= new Scanner(System.in);
                     System.out.println("Ingrese la primera nota: ");
                     n1=scn.nextInt();

                     while(n1<1 || n1>10){
                         System.out.println("Solo se permiten notas de 1 a 10 ");
                         System.out.println("Ingrese la primera nota: ");
                         n1=scn.nextInt();

                     }
                         System.out.println("Ingrese la segunda nota: ");
                           n2=scn.nextInt();

                     while(n2<1 || n2>10){
                         System.out.println("Solo se permiten notas de 1 a 10 "); 
                         System.out.println("Ingrese la segunda nota: ");
                         n2=scn.nextInt();
                         System.out.println("Ingrese la tercera nota: ");
                         n3=scn.nextInt();
                     }
                     while(n3<1 || n3>10){
                         System.out.println("Solo se permiten notas de 1 a 10");
                         System.out.println("Ingrese la tercera nota: ");
                         n3=scn.nextInt();
                     }
                     prom=(n1+n2+n3)/3; 
                     System.out.println("El promedio de las notas ingresadas es: "+prom);
                    /****************************************************/
                break; 
             case 3:
                /***************EJERCICIO 3*********************/
                int num1,res1;
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Ingrese un numero, ingrese un negativo para terminar: ");
                num1= sc2.nextInt();
                while(num1>0){
                    res1=num1*num1;
                    System.out.println("El cuadrado del numero ingresado es: "+num1*num1 );
                    System.out.println("Ingrese otro numero, ingrese un negativo para terminar: " );
                    num1= sc2.nextInt();
                }
                System.out.println("Se ha terminado la ejecusion. ");
                /**********************************************/ 
                break;    
                default:
                    System.out.println("GRACIAS POR USAR NUESTRAS OPCIONES... ");
                break;   
             } 
        
        }
    }
   

}
