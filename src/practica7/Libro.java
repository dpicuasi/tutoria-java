package practica7;

/**
 *
 * @author Kintydev
 */
public class Libro {
    
    private String nombre;
    private String autor;
    private String genero;
    private int anio;

    public Libro() {
    }

    public Libro(String nombre, String autor, String genero, int anio) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
    }
//to string
    @Override
    public String toString() {
        return "\n Nombre:" + nombre
                + "\n, Autor:" + autor
                + "\n, Genero:" + genero
                + "\n, Anio:" + anio;
    }

    //getters and setters
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}

