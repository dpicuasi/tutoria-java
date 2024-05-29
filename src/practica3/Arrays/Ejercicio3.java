
package practica3.Arrays;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio3 {
    public void main (){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la diemnsion del vector: ");
        String estudiantes[] = new String[sc.nextInt()];
        
        for(int i=0; i<estudiantes.length;i++){
            System.out.println("Ingrese el nomre de un estudiante: ");
            estudiantes[i]=sc.next();
            
        }
        System.out.println("Los estudiantes ingresados fueron: ");
        for(int i=0; i<estudiantes.length;i++){
            System.out.println("El nomre del estudiante de la posicion "+i+" es: "+estudiantes[i]);
        }
    }
}
