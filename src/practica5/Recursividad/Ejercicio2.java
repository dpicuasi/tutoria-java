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
public class Ejercicio2 {
    public void main() {
    //FACTORIAL SUMA RECURSIVA DE UN NUMERO
        int num, res;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        System.out.println("La suma del recursiva de " + num + " es: " + Factorial(num));
    }

    public int Factorial(int num) {
        int res;
        if (num == 0) {//caso base
            return 1;
        } else {//caso recursivo
            res = num + Factorial(num - 1);
            return res;
        }
    }
}
    

