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
public class Ejercicio4 {
     public void main() {
        int opcion;
        boolean salir = false;

        Scanner sc = new Scanner(System.in);
try{
        do {
            System.out.println("1.-Opcion 1");
            System.out.println("2.-Opcion 2");
            System.out.println("3.-Opcion 3");
            System.out.println("4.-salir");
            System.out.println("Escoja una opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola, opcion1");
                    break;
                case 2:
                    System.out.println("Hola, opcion2");
                    break;
                case 3:
                    System.out.println("Hola, opcion3");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcin no valida");
                    break;
            }
        } while (!salir);
        
        } catch (InputMismatchException e1) {
            System.out.println("Solo permites el ingreso de numeros");
        }
    }

}

