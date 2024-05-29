package practica4.EjercicioObjetos3;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kintydev
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private String nacionalidad;
    private String[] hobbies=new String[3];

    public Persona(String nombre, int edad, String sexo, String nacionalidad, String[] hobbies) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.hobbies = hobbies;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
    
    
    public String mayorDeEdad(){
        if(this.getEdad()>=18){
            return "Es mayor de edad";
        }else{
            return "Es menor de edad";
        }
    }
    
    
    
}
