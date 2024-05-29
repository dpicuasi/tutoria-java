
package practica2.While;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio4 {
      //ejercicios en clase
    public void main (){
        int n1,n2,n3,n4,n5,media,total;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese el primer numero");
        n1 =sc.nextInt();
         while(n1 == 0){
            System.out.println("no se permite cero ");
            System.out.println("ingrese el primer numero");
            n1 =sc.nextInt();
        }
        
        
        System.out.println("ingrese el segundo numero");
        n2 =sc.nextInt();
        while(n2 == 0){
            System.out.println("no se permite cero ");
            System.out.println("ingrese el segundo numero");
            n2 =sc.nextInt();
        }
        
        System.out.println("ingrese el tercero numero");
        n3 =sc.nextInt();
        while(n3 == 0){
            System.out.println("no se permite cero ");
            System.out.println("ingrese el tercero numero");
            n3 =sc.nextInt();
        }
        
        System.out.println("ingrese el cuarto");
        n4 =sc.nextInt();
        while(n4 == 0){
            System.out.println("no se permite cero ");
            System.out.println("ingrese el cuarto numero");
            n4 =sc.nextInt();
        }
        
        System.out.println("ingrese el quinto");
        n5 =sc.nextInt();
        while(n5 == 0){
            System.out.println("no se permite cero ");
            System.out.println("ingrese el quinto numero");
            n5 =sc.nextInt();
        }
        total = n1+n2+n3+n4+n5;
        media = total/5;
        System.out.println("la media de los numeros ingresados es: "+media);
    }
}
      
    

