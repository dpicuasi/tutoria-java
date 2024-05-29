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
         String User, Clave;
         
         System.out.println("* (1.1).- IF-ELSE 1 ");
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el Usuario:");
         User = sc.nextLine();
         
         System.out.println("Ingrese la Clave:");
         Clave = sc.nextLine();
         
         if(nombre.equals(User) && contrasenia.equals(Clave)){
             System.out.println("Bienvenido "+User);
         }else{
             System.out.println("Usuario o clave incorrectos");
         }
         
     }
}


