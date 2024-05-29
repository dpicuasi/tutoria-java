/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.Switch;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio2 {
    public void main (){ 
        String usuario = "Jose";
        String clave = "123";
        String tmpUsuario, tmpClave, rol;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese usuario: ");
        tmpUsuario=sc.nextLine();
        
         System.out.println( "Ingrese contraseña: ");
        tmpClave=sc.nextLine();
        
         System.out.println( "Ingrese rol: ");
        rol=sc.nextLine();
        
        if(usuario.equals(tmpUsuario) && clave.equals(tmpClave)){
            System.out.println("Bienvenido "+tmpUsuario);
            switch(rol){
                case "admin":
                    System.out.println("Usted tiene acceso total al sistema. ");
                    break;
                    
                case "user":
                    System.out.println("Usted tiene acceso restringuido. ");
                    break;
                    
                default:
                    System.out.println("Rol incorrecto. ");
                    break;
            }
        }
    }
    
                    
                
            }
        
        
