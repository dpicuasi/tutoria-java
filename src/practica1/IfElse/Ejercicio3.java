
package practica1.ifElse;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio3 {
    public void main (){
    System.out.println("* (1.2).- IF-ELSE 2 ");
    double desc, pagar, interes, cancelar;
    String efectivo="efectivo";
    String credito="tarjeta";
    String fpago;        
    Scanner sc = new Scanner (System.in);
     System.out.println("Ingresa la compra");
        pagar = sc.nextDouble();
         Scanner sc1 = new Scanner (System.in);
    System.out.println("Ingrese forma de pago");
         fpago= sc1.nextLine();
             
         if(fpago.equals(efectivo)){
            desc = (double) (pagar*0.08);
            cancelar = (double)(pagar-desc);
            System.out.println("Ingresa valor:" +pagar);
            System.out.println("Ingresa valor:" +fpago);
            System.out.println("Ingresa valor :" +desc);
            System.out.println("Ingresa valor:" +cancelar);
         } else {
              if(fpago.equals(credito)){
                interes = (double) (pagar*0.05);
                cancelar = (double)(pagar+interes);
            System.out.println("Ingresa valor : " +pagar);
            System.out.println("Ingresa valore: " +fpago);
            System.out.println("Ingresa valor : " +interes);
            System.out.println("Ingresa valor : " +cancelar);
              }else{
                  System.out.println("forma de pago: efectivo o tarjeta");
                   }
                }   
    }
}

