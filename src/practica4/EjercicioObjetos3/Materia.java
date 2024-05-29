/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4.EjercicioObjetos3;

/**
 *
 * @author Kintydev
 */
public class Materia {
    private String nombre;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double promedio;
    private boolean esAprobado=false;
    
    //constructores
    public Materia() {
        // constructor vacio
    }
    
    

    public Materia(String nombre, Double nota1, Double nota2, Double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    //metodos 
    public Double calcularPromedio(){
        return (this.nota1+this.nota2+this.nota3)/3;
        
    }
    
    public Boolean verificarAprobado(){
        if(this.promedio>=7){
            return true;
        }else{
            return false;
        }
    }
    //getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public boolean isEsAprobado() {
        return esAprobado;
    }

    public void setEsAprobado(boolean esAprobado) {
        this.esAprobado = esAprobado;
    }
    
    
    
}
