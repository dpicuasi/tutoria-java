/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.Recursividad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public void main() {
        
        int codigo;
        
        Banco b1=new Banco(1, "PICHINCHA", "ACTIVO", 0);
        Banco b2=new Banco(2, "FILANBANCO", "EXTINTO", 1);
        Banco b3=new Banco(3, "PRODUBANCO", "EXTINTO", 1);
        Banco b4=new Banco(4, "PACIFICO", "ACTIVO", 0);
        Banco b5=new Banco(5, "DE LOS ANDES", "EXTINTO", 6);
        Banco b6=new Banco(6, "GUAYAQUIL", "EXTINTO", 4);
        Banco b7=new Banco(7, "BOLIVARIANO", "EXTINTO", 5);
    
        
        ArrayList<Banco>listaBancos=new ArrayList<>();
        listaBancos.add(b1);
        listaBancos.add(b2);
        listaBancos.add(b3);
        listaBancos.add(b4);
        listaBancos.add(b5);
        listaBancos.add(b6);
        listaBancos.add(b7);
        
        Banco bancoInicio=new Banco(listaBancos);
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese el codigo del banco: ");
        codigo=sc.nextInt();
        
        ArrayList<Banco> resultado;
        
        resultado=bancoInicio.listarHistorialAbsorcionBanco(codigo);
        System.out.println("El historial de absorciones es el siguiente: ");
        
        for(Banco b : resultado){
        System.out.println("Nombre: "+b.getNombre());
        System.out.println("Estado: "+b.getEstado());
        System.out.println("======================");
        }
    

    }
}
                




   
