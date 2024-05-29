
package practica3.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio1 {
    public void main (){
        int numeros[] = new int [10];
        Scanner sc = new Scanner(System.in);
        try{
        for(int i=0; i<numeros.length;i++){
            System.out.println("Ingrese un numero: ");
            numeros[i]=sc.nextInt();
        
        }
        System.out.println("Los numeros ingresados fueron: ");
        
        for(int i=0; i<numeros.length;i++){
            System.out.println("El numero en el indice "+i+" es: "+numeros[i]);
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No se puede ingresar mas elementos de los que contiene.");
        }catch(InputMismatchException e1){    
            System.out.println("Solo se permite el ingreso de numeros.");
                }
    
    }
}
