
package practica2.For;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio5 {
     public void main() {
            int num, valor=0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite cuantos numeros desea ingresar.");
            num = sc.nextInt();
            System.out.println("Se recomienda que solo se ingrese numeros del 1 al 5. ");
            for(int i=1; i<=num; i++){
            System.out.println("Ingrese el del numero No. "+i+":");
            valor = sc.nextInt(); 
            switch (valor){
                case 1:
                if(valor==1){
                cont1=cont1 +1; 
                }
                break;    
             case 2:
                if(valor==2){
                cont2=cont2 +1; 
                }
                break; 
             case 3:
                if(valor==3){
                cont3=cont3 +1; 
                } 
                break;    
            case 4:
                if(valor==4){
                cont4=cont4 +1; 
                } 
                break;
            case 5:
                if(valor==5){
                cont5=cont5 +1; 
                } 
                break;
                default:
             cont6=cont6 +1; 
            break;   
             }
         }
      System.out.println("R E S U L T A D O");   
      System.out.println(+cont1+" Numero 1");
      System.out.println(+cont2+" Numero 2");
      System.out.println(+cont3+" Numero 3");
      System.out.println(+cont4+" Numero 4");
      System.out.println(+cont5+" Numero 5");
      System.out.println(+cont6+" Numero fuera de rango");
  }  
}

