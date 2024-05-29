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
public class Ejercicio4 {
     public void main() {
     
//SERIE DE FIBONACCI
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        System.out.println("La serie de fibonaci de " + num + " es: " + fibonacci(num));

    }

    public int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
