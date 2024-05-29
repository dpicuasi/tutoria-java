/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.EjercicioObjetos1;


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
        String nombreEstudiante;
        String nombreMateria;
        String nivel;
        Double n1;
        Double n2;
        Double n3;
        Double promedio;
        boolean aprueba;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("=========ingreso de notas==========");
        System.out.println("Numero de estudiantes para ingresar notas:");
        Estudiante[] estudiantes=new Estudiante[sc.nextInt()];
        sc.nextLine();
        
        for(int i=0;i<estudiantes.length;i++){
            System.out.println("Nombre del Estudiante: ");
            nombreEstudiante=sc.nextLine();
            
            System.out.println("nivel:");
            nivel=sc.nextLine();
            
            Materia[] materias=new Materia[3];
            for(int j=0;j<materias.length;j++){
                System.out.println("Ingrese el nombre de la materia: ");
                nombreMateria=sc.nextLine();
                
                System.out.println("Ingrese la primera nota: ");
                n1=sc.nextDouble();
                sc.nextLine();
                
                System.out.println("Ingrese la segunda nota: ");
                n2=sc.nextDouble();
                sc.nextLine();
                
                System.out.println("Ingrese la tercera nota: ");
                n3=sc.nextDouble();
                sc.nextLine();
                
                Materia materia=new Materia(nombreMateria, n1,n2,n3);
                
                
                promedio=materia.calcularPromedio();
                materia.setPromedio(promedio);
                
                aprueba=materia.verificarAprobado();
                materia.setEsAprobado(aprueba);
                
   
                materias[j]=materia;
                
                System.out.println("");
                System.out.println("==================");
                System.out.println("");
                
            }
                Estudiante estudiante=new Estudiante(nombreEstudiante,nivel, materias);
                estudiantes[i]=estudiante;
                System.out.println("");
                System.out.println("==================");
                System.out.println("");
        }
            
            
            System.out.println(" la informacion ingresada es: ");
            System.out.println("numero de estudiantes ingresados "+estudiantes.length);

            for(Estudiante est : estudiantes){   
                System.out.println(" Nombre del estudiante: ");
                System.out.println(" Nivel: "+est.getNivel());
                
                for(Materia m: est.getMaterias()){
            
                    System.out.println("Nombre Materia: "+m.getNombre());
                    System.out.printf("\t Nota 1: %.2f\n", m.getNota1());
                    System.out.printf("\t Nota 2: %.2f\n", m.getNota2());
                    System.out.printf("\t Nota 3: %.2f\n", m.getNota3());
                    System.out.printf("\t Promedio: %.2f\n", m.getPromedio());
                    if(m.isEsAprobado()){
                        System.out.println("\t APROBADO");
                    }else{
                        System.out.println("\t REPROBADO");
                    }
                }
 
           }
            System.out.println("");
            System.out.println("=============================");
            System.out.println("");
            
        }
        
                
                
        
}
