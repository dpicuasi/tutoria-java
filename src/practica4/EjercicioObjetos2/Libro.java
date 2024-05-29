/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.EjercicioObjetos2;

/**
 *
 * @author Kintydev
 */
public class Libro {
    private String nombre;
    private String autor;
    private int anio;
    private int numeroPaginas;
    private String genero;
    private String idioma;
    private Editorial editorial;

    public Libro() {
    }
    
    

    public Libro(String nombre, String autor, int anio, int numeroPaginas, String genero, String idioma, Editorial editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.idioma = idioma;
        this.editorial = editorial;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

   
    
    

    
    
}
