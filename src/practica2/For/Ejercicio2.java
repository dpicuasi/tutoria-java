
package practica2.For;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio2 {
    public void main (){
                int num;
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese un numero: ");
                num=sc.nextInt();

                System.out.println("Los numeros pares de 1 a "+num+" son:");
                for(int i=1;i<=num;i++){
                    int res = i%2;
                 if(res==0){
                System.out.println(i);
            }
        }
    }
}
