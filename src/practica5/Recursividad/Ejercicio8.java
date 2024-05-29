/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5.Recursividad;

/**
 *
 * @author Kintydev
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public void main() {
        int[] vector = new int[]{1,33,77,23,5};
             
        System.out.println("Los elementos del vector son.");
        for(int v : vector){
            System.out.println(v);
        }
        System.out.println("La suma de los elementos del vector es: "+sumarElementosVector(vector, 4));
    }
    
    public int sumarElementosVector(int[] vector, int indice){
        int suma;
        if(indice==0){
            return vector[0];
        }else{
            suma=vector[indice]+sumarElementosVector(vector, indice-1);
            return suma;
        
    }
      
    }
}

    


