/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.EjercicioObjetos4;

import java.util.Date;
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
        Pelicula datos = new Pelicula();
        Pelicula[] arregloPeliculas;
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("INGRESE LA CANTIDAD DE PELICULAS DEL ARREGLO");
        int cantidad = sc.nextInt();
        sc.nextLine();
        arregloPeliculas = new Pelicula[cantidad];
        System.out.println("");
        for (int i = 0; i < arregloPeliculas.length; i++) {
            System.out.println("DATOS DE LA PELICULA: " + (i + 1));
            System.out.println("");
            System.out.print("INGRESE EL NOMBRE: ");
            String nombre=sc.next();
            datos.setNombre(nombre);
            System.out.print("INGRESE EL GENERO: ");
            datos.setGenero(sc.next());
            System.out.print("INGRESE EL IDIOMA: ");
            datos.setIdioma(sc.next());
            System.out.print("INGRESE LA DURACION: ");
            datos.setDuracion(sc.nextInt());
            System.out.print("INGRESE EL AÑO: ");
            datos.setAño(sc.nextInt());
            System.out.println("INGRESE 3 ACTORES: ");
            for (int j = 0; j < datos.getActor().length; j++) {
                System.out.println("INGRESE EL ACTOR : " + (j + 1));
                Actor actor=new Actor();
                System.out.print("INGRESE EL NOMBRE: ");
                actor.setNombre(sc.next());
                System.out.print("INGRESE EL FECHA NACIMIENTO: ");
                actor.setFechaNacimiento(new Date(sc.next()));
                System.out.print("INGRESE LA NACIONALIDAD: ");
                actor.setNacionalidad(sc.next());
                System.out.print("INGRESE LA EDAD: ");
                actor.setEdad(sc.nextInt());
                System.out.println("");
            }
            arregloPeliculas[i] = datos;
        }
        System.out.println(" ");
        System.out.println(" LAS PELICULAS SON INGRESADAS SON: ");
        for (Pelicula est : arregloPeliculas) {
            System.out.print(" NOMBRE: " + est.getNombre());
            System.out.println(" ");
            System.out.print(" GENERO : " + est.getGenero());            
            System.out.println(" ");

            for (int i = 0; i < est.getActor().length; i++) {
                System.out.println("\t LOS HOBBIES SON:");
                System.out.println("HOBBIE : " + (i + 1) + " --> " + est.getActor()[i].toString());
            }
        }
        System.out.println("");
    }
}
