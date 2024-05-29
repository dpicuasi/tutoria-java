/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.EjercicioObjetos4;

/**
 *
 * @author Kintydev
 */
public class Pelicula {
    private String nombre;
    private String genero;
    private int duracion;
    private int año;
    private String idioma;
    private Actor[] actor=new Actor[3];
    
    //constructores
    public Pelicula() {
        // constructor vacio
    }

    public Pelicula(String nombre, String genero, int duracion, int año, String idioma) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", a\u00f1o=" + año + ", idioma=" + idioma + ", actor=" + actor + '}';
    }
    
    
    

        
}
