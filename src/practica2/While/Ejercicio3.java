
package practica2.While;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio3 {
    public void main() {
        int num,res;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero, ingrese un negativo para terminar: ");
        num= sc.nextInt();
        
        while(num>0){
            res=num*num;
            System.out.println("El cuadrado del numero ingresado es: "+num*num );
            System.out.println("Ingrese otro numero, ingrese un negativo para terminar: " );
            num= sc.nextInt();
        }
        System.out.println("Se ha terminado la ejecusion. ");
    }
}
