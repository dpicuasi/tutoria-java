/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.EjercicioObjetos3;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public void main() {
        Persona datos = new Persona();
        Persona[] arregloPersonas;
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("INGRESE LA CANTIDAD DE PERSONAS DEL ARREGLO");
        int cantidad = sc.nextInt();
        sc.nextLine();
        arregloPersonas = new Persona[cantidad];
        System.out.println("");
        for (int i = 0; i < arregloPersonas.length; i++) {
            System.out.println("DATOS DE LA PERSONA: " + (i + 1));
            System.out.println("");
            System.out.print("INGRESE EL NOMBRE DE LA PERSONA: ");
            String nombre=sc.next();
            datos.setNombre(nombre);
            System.out.print("INGRESE LA EDAD: ");
            datos.setEdad(sc.nextInt());
            System.out.print("INGRESE EL SEXO: ");
            datos.setSexo(sc.next());
            System.out.print("INGRESE LA NACIONALIDAD: ");
            datos.setNacionalidad(sc.next());
            for (int j = 0; j < datos.getHobbies().length; j++) {
                System.out.println("INGRESE EL HOBBIE : " + (j + 1));
                datos.getHobbies()[j] = sc.next();
                System.out.println("");
            }
            arregloPersonas[i] = datos;
        }
        System.out.println(" ");
        System.out.println(" LAS PERSONAS SON INGRESADAS SON: ");
        for (Persona est : arregloPersonas) {
            System.out.print(" NOMBRE: " + est.getNombre());
            System.out.println(" ");
            System.out.print(" EDAD : " + est.getEdad());
            System.out.println(" ");
            System.out.print(" MAYOR/MENOR : " + est.mayorDeEdad());
            System.out.println(" ");
            System.out.print(" SEXO : " + est.getSexo());
            System.out.println(" ");
            System.out.print(" NACIONALIDAD : " + est.getNacionalidad());
            System.out.println(" ");

            for (int i = 0; i < est.getHobbies().length; i++) {
                System.out.println("\t LOS HOBBIES SON:");
                System.out.println("HOBBIE : " + (i + 1) + " --> " + est.getHobbies()[i]);
            }
        }
        System.out.println("");
    }
}
