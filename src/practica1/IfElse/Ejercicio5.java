/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.ifElse;

/**
 *
 * @author Kintydev
 */
public class Ejercicio5 {

    public void main() {
        int dia, mes, anio;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("ingrese un dia: ");
        dia = sc.nextInt();

        System.out.println("ingrese mes (numereo): ");
        mes = sc.nextInt();

        System.out.println("ingrese un año : ");
        anio = sc.nextInt();

        if (dia >= 1 && dia <= 31) {
            if (mes >= 1 && mes <= 12) {
                if ((mes == 2 && dia > 28) || (mes == 4 && dia > 30) || (mes == 6 && dia > 30) || (mes == 9 && dia > 30) || (mes == 11 && dia > 30)) {
                    System.out.println("Ese dia no corresponde al mes indicado ");
                } else {
                    if (anio >= 0 && anio <= 2020) {
                        System.out.println("fecha correcta: " + dia + "/" + mes + "/" + anio);
                    } else {
                        System.out.println("fecha incorrecta año no existe");
                    }
                }
            } else {
                System.out.println("fecha incorrecta, mes no existe");
            }
        } else {
            System.out.println("fecha incorrecta, dia no existe");
        }
    }
}
