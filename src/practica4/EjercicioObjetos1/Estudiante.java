/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.EjercicioObjetos1;

/**
 *
 * @author Kintydev
 */
public class Estudiante {
    private String nombre;
    private String nivel;
    private Materia[] materias;
    
    //constructores
    public Estudiante(){
       //constructor vacio 
    }

    public Estudiante(String nombre, String nivel, Materia[] materias) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.materias = materias;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }
    
    
    
}
