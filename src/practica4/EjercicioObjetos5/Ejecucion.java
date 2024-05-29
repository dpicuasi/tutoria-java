/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.EjercicioObjetos5;

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
        Producto datos = new Producto();
        Producto[] arregloProductos=new Producto[3];
        Registro[] arregloRegistros;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== INGRESE LA CANTIDAD DE REGISTROS =================");
        int cantidad=0;
        try{
            cantidad = sc.nextInt();
        }catch(Exception ex){
            System.out.println("NO DEBE INGRESAR LETRAS, SOLO NUMEROS");
        }
        
        arregloRegistros = new Registro[cantidad];
        System.out.println("");
        for (int i = 0; i < arregloRegistros.length; i++) {
            Registro reg=new Registro();
            System.out.println("INGRESE DATOS REGISTRO NRO: " + (i + 1));
            System.out.println("");
            System.out.print("INGRESE EL NOMBRE: ");
            String nombre=sc.next();
            reg.setNombre(nombre);
            System.out.print("INGRESE EL CODIGO: ");
            int codigo=sc.nextInt();
            
            while(codigo > 3){
                System.out.print("INGRESE UN CODIGO VALIDO: ");
                codigo=sc.nextInt();
            }
            
            while(codigo < 1){
                System.out.print("INGRESE UN CODIGO VALIDO: ");
                codigo=sc.nextInt();
            }
            
            
            reg.setCodigoProducto(datos.retornaProducto(codigo));
            
            System.out.print("INGRESE LA CANTIDAD: ");
            int cantid=sc.nextInt();
             while(cantid < 1){
                System.out.print("INGRESE UNA CANTIDAD VALIDA: ");
                cantid=sc.nextInt();
            }
            reg.setCantidad(cantidad);
            arregloRegistros[i] = reg;
        }
        
        System.out.println(" ==================================== ");
        for (Registro est : arregloRegistros) {
            System.out.print(" Nombre Cliente: " + est.getNombre());
            System.out.println(" ");
            System.out.print(" Codigo : " + est.getCodigoProducto().getCodigo());
            System.out.println(" ");
            System.out.print(" Producto : " + est.getCodigoProducto().getNombreProducto());
            System.out.println(" ");
            System.out.print(" Precio Unitario : " + est.getCodigoProducto().getPrecioUnitario());
            System.out.println(" ");
            System.out.print(" Cantidad : " + est.getCantidad());
            System.out.println(" ");
            System.out.print(" Total : " + (est.getCantidad()*est.getCodigoProducto().getPrecioUnitario()));
            System.out.println(" ");
        }
        System.out.println("");
    }
}
