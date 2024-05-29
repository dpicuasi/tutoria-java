    package practica4.EjercicioObjetos5;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kintydev
 */
public class Producto {
    
    private int codigo;
    private String nombreProducto;
    private Double precioUnitario;

    public Producto(int codigo, String nombreProducto, Double precioUnitario) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    public Producto retornaProducto(int codigo){
        //PRODUCTO 1
        Producto datos1 = new Producto();
        if(codigo==1){
            
            datos1.setCodigo(1);
            datos1.setNombreProducto("ALCOHOL ANTISEPTICO AL 70%");
            datos1.setPrecioUnitario(16.80);
            return datos1;
        }
    
        //PRODUCTO 2
        if(codigo==2){
            datos1.setCodigo(2);
            datos1.setNombreProducto("ALCOHOL GEL");
            datos1.setPrecioUnitario(22.40);
            return datos1;
        }
        //PRODUCTO 3
        if(codigo == 3){
            datos1.setCodigo(3);
            datos1.setNombreProducto("ALCOHOL ISOPROPILICO");
            datos1.setPrecioUnitario(33.60);
            return datos1;
        }
        
        return null;
    }

}
