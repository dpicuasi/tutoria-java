/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.EjercicioObjetos2;

import java.util.Scanner;

/**
 *
 * @author Kintydev
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public  void main() {
        
        String nombre;
        String autor;
        int numeroPaginas;
        int anio;
        String genero;
        String idioma;
        int editorial;

        Editorial e1=new Editorial("Norma", "España");
        Editorial e2=new Editorial("Santillan", "Argentina");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Numero de libros a ingresar: ");
        Libro[] vectorLibros=new Libro[sc.nextInt()];
        sc.nextLine();
        
        
        for(int i=0;i<vectorLibros.length;i++){
            System.out.println("Nombre del libro: ");
            nombre=sc.nextLine();
            
            System.out.println("Autor:");
            autor=sc.nextLine();
            
            System.out.println("Genero:");
            genero=sc.nextLine();
            
            System.out.println("Idioma:");
            idioma=sc.nextLine();
            
            System.out.println("Numero de Paginas:");
            numeroPaginas=sc.nextInt();
            sc.nextLine();
            
            System.out.println("Año:");
            anio=sc.nextInt();
            sc.nextLine();
            
            System.out.println("Editorial (1,2):");
            editorial=sc.nextInt();
            sc.nextLine();
            
            Libro libro;
            
            if(editorial==1){
                libro=new Libro(nombre, autor, anio, numeroPaginas, genero, idioma, e1);
            }else{
                libro=new Libro(nombre, autor, anio, numeroPaginas, genero, idioma, e2);
            }
            
            vectorLibros[i]= libro;
            
            System.out.println("================================");
        }
            System.out.println("Los libros ingresados son los siguientes:");
            
            for(int i=0;i<vectorLibros.length;i++){
                System.out.println("Nombre del libro: "+vectorLibros[i].getNombre());
                System.out.println("Autor:"+vectorLibros[i].getAutor());
                System.out.println("Genero: "+vectorLibros[i].getGenero());
                System.out.println("Idioma: "+vectorLibros[i].getIdioma());
                System.out.println("Año publicacion: "+vectorLibros[i].getAnio());
                System.out.println("Numero de Paginas: "+vectorLibros[i].getNumeroPaginas());
                System.out.println("Editorial: "+vectorLibros[i].getNombre());
                System.out.println("Pais Editorial: "+vectorLibros[i].getEditorial().getPais());
                System.out.println("=======================================");
                
                
            
 
        
    }
    
}
    
    
}
