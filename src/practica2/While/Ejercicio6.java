
package practica2.While;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio6 {
    public void main (){
         String nombre;
        Double nota1 = 0d, nota2 = 0d, nota3 = 0d;
        int cantidad = 3;
        int contador = 0;
        Double valor=0d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Alumno:");
        nombre = sc.next();
        System.out.println("Ingrese 3 notas del Alumno, se recomienda entre 1 al 10 ");
        while(contador<3){
            System.out.println("Ingrese la nota nro. " + (contador+1) + ":");
            Scanner sc1 = new Scanner(System.in);
            valor=sc1.nextDouble();
            if (valor >= 1d && valor <= 10d) {
                if (nota1 == 0d) {
                    nota1 = valor;
                    contador++;
                } else if (nota2 == 0d) {
                    nota2 = valor;
                    contador++;
                } else if (nota3 == 0d) {
                    nota3 = valor;
                    contador++;
                }else{
                    System.out.println("Ingrese notas validas entre 1 al 10 ");
                }
            }else{
                System.out.println("Ingrese notas validas entre 1 al 10 ");
            }
        }
            System.out.println("*****************RESULTADOS******************************");
            System.out.println("Nombre: "+nombre);
            System.out.println("Nota 1: "+nota1);
            System.out.println("Nota 2: "+nota2);
            System.out.println("Nota 3: "+nota3);
            Double promedio=(nota1+nota2+nota3)/3;
            System.out.println("Promedio: "+promedio);
            if(promedio>=7d){
                System.out.println("APROBADO");    
            }else{
                System.out.println("REPROBADO");    
            }
                
            System.out.println("**********************************************************");
        
    }

}
    
    

