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
public class Ejercicio3 {

    public void main() {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero inicial");
        num1 = sc.nextInt();
        System.out.println("Ingrese numero final");
        num2 = sc.nextInt();

        System.out.println("la suma recursiva entre : " + num1 + " y " + num2 + " es : " + recursiva(num1, num2));
    }

    public int recursiva(int num1, int num2) {
        int res;
        if (num1 == num2) {
            return num1;
        } else {
            res = num1 + recursiva(num1 + 1, num2);
            return res;
        }
    }

}
