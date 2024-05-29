/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.Switch;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejercicio3 {
    public void main() {

        double total, iva, tmpTotal;
        String tmpEstudiante, tmpFacultad;
        Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese nombre del Postulante");
        tmpEstudiante = sc.nextLine();
        System.out.println("Ingrese Facultad del Postulante");
        tmpFacultad = sc.nextLine();
        switch (tmpFacultad) {
            case "Sistemas":
                total = (350 + 650);
                tmpTotal = total * (1.12);
                iva = tmpTotal - total;
                System.out.println("Estudiante:" + tmpEstudiante + "||" + " Importe:350" + " Matricula:650" +                   " IVA:" + iva + " Total a Pagar:" + tmpTotal);
                break;
            case "Derecho":
                total = (300 + 550);
                tmpTotal = total * (1.12);
                iva = tmpTotal - total;
                System.out.println("Estudiante:" + tmpEstudiante + "||" + " Importe:300" + " Matricula:550" +                   " IVA:" + iva + " Total a Pagar:" + tmpTotal);
                break;
            case "Naviera":
                total = (300 + 500);
                tmpTotal = total * (1.12);
                iva = tmpTotal - total;
                System.out.println("Estudiante:" + tmpEstudiante + "||" + " Importe:300" + " Matricula:500" +                   " IVA:" + iva + " Total a Pagar:" + tmpTotal);
                break;
            case "Pesquera":
                total = (310 + 460);
                tmpTotal = total * (1.12);
                iva = tmpTotal - total;
                System.out.println("Estudiante:" + tmpEstudiante + "||" + " Importe:310" + " Matricula:460" +                   " IVA:" + iva + " Total a Pagar:" + tmpTotal);
                break;
            case "Contabilidad":
                total = (280 + 490);
                tmpTotal = total * (1.12);
                iva = tmpTotal - total;
                System.out.println("Estudiante:" + tmpEstudiante + "||" + " Importe:280" + " Matricula:490" +                   " IVA:" + iva + " Total a Pagar:" + tmpTotal);
                break;
            case "Administracion":
                total = (360 + 520);
                tmpTotal = total * (1.12);
                iva = tmpTotal - total;
                System.out.println("Estudiante:" + tmpEstudiante + "||" + " Importe:360" + " Matricula:520" +                   " IVA:" + iva + " Total a Pagar:" + tmpTotal);
                break;
                 default:
                System.out.println("Facultad incorrecta");
                break;
        }

    }

}
