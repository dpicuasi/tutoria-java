/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.Recursividad;

import java.util.ArrayList;

/**
 *
 * @author Kintydev
 */
public class Banco {
    private int codigo;
    private String nombre;
    private String estado;
    private int codEntAbs;
    private ArrayList<Banco> listaBancos;
    private ArrayList<Banco> listaHistorialAbsorcion;

    public Banco() {
    }

    public Banco(int codigo, String nombre, String estado, int codEntAbs) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
        this.codEntAbs = codEntAbs;
    }

    public Banco(ArrayList<Banco> listaHistorialAbsorcion) {
        this.listaHistorialAbsorcion = listaHistorialAbsorcion;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodEntAbs() {
        return codEntAbs;
    }

    public void setCodEntAbs(int codEntAbs) {
        this.codEntAbs = codEntAbs;
    }

    public ArrayList<Banco> getListaHistorialAbsorcion() {
        return listaHistorialAbsorcion;
    }

    public void setListaHistorialAbsorcion(ArrayList<Banco> listaHistorialAbsorcion) {
        this.listaHistorialAbsorcion = listaHistorialAbsorcion;
    }

    public ArrayList<Banco> getListaBancos() {
        return listaBancos;
    }

    public void setListaBancos(ArrayList<Banco> listaBancos) {
        this.listaBancos = listaBancos;
    }


    public Banco buscarBanco(int codigo){
        Banco banco=new Banco();
        
        for(Banco b : this.listaBancos){
            if(b.getCodigo()==codigo){
                banco=b;
                break;
                
            }
            
        }
        return banco;
    }
    public ArrayList<Banco> listarHistorialAbsorcionBanco(int codigo){
        Banco banco=buscarBanco(codigo);
        
        
        if(banco.getCodEntAbs()==0){
            this.listaHistorialAbsorcion.add(banco);// Caso base
            return this.listaHistorialAbsorcion;
        }else{ // Parte recursiva
            this.listaHistorialAbsorcion.add(banco);
            listarHistorialAbsorcionBanco(banco.getCodEntAbs());
        }
        
        return listaHistorialAbsorcion;
    }
}
