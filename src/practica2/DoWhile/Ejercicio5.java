/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.DoWhile;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio5 {
    public void main() {
        int num1, num2,res;
        Scanner sc = new Scanner(System.in);
        try{

        System.out.println("Ingerse un numero:");
        num1=sc.nextInt();
        
        System.out.println("Ingerse otro numero:");
        num2=sc.nextInt();
        
        res=num1/num2;
        } catch(InputMismatchException e1){
        System.out.println("solo se permite el ingreso de numeros.");
        } catch (ArithmeticException e2){
        System.out.println("la division para 0 no existe.");
        }
    }
}
    
    
