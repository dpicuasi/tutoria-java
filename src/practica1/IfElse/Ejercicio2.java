package practica1.IfElse;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio2 {
     public void main() {
         String nombre="pepe";
         String contrasenia ="123";
         String user;
         String clave;
         
         System.out.println("* (1.1).- IF-ELSE 1 ");
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el Usuario:");
         user = sc.nextLine();
         
         System.out.println("Ingrese la Clave:");
         clave = sc.nextLine();
         
         if(nombre.equals(user) && contrasenia.equals(clave)){
             System.out.println("Bienvenido "+user);
         }else{
             System.out.println("Usuario o clave incorrectos");
         }
         
     }
}


