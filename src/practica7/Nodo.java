/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;


/**
 *
 * @author Kintydev
 */
public class Nodo {
    
    private Libro libro;
    private Nodo siguiente;

    //constructor
    public Nodo(Libro libro, Nodo siguiente) {
        this.libro = libro;
        this.siguiente = siguiente;
    }
    
    //getters and setters

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
}