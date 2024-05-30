package practica1.ifElse;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio4 {

    public void main() {
        int dia, mes, anio;
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un dia: ");
        dia = sc.nextInt();

        System.out.println("ingrese un mes (numereos): ");
        mes = sc.nextInt();

        System.out.println("ingrese año (numereos): ");
        anio = sc.nextInt();

        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (anio >= 0 && anio <= 2020) {
                    System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);
                } else {
                    System.out.println("Fecha incorrecta. Año fuera de rango.");
                }
            } else {
                System.out.println("Fecha incorrecta. Mes fuera de rango.");
            }
        } else {
            System.out.println("Fecha incorrecta. Dia fuera de rango.");
        }

    }
}
