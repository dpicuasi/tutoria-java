/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.EjercicioObjetos5;

/**
 *
 * @author Kintydev
 */
public class Registro {
    private String nombre;
    private Producto codigoProducto;
    private int cantidad;
    
    //constructores
    public Registro() {
        // constructor vacio
    }

    public Registro(String nombre, Producto codigoProducto, int cantidad) {
        this.nombre = nombre;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Producto codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
