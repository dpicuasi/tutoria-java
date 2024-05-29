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
public class Ejercicio5 {
    
    
    public  void main(){
        System.out.println("Vector de 5 posiciones ");
        int[]vector={3,4,5,10,10};
        for(int dato:vector){
            System.out.println("Dato: "+dato);
        }
        int indice =0;
        int respuesta=sumarElementosVector(vector, indice);
        System.out.println("Respuesta de la suma del vector: "+respuesta);
    }
    
    public int sumarElementosVector(int[ ]vector, int indice ){
               return vector.length!=indice?vector[indice]+sumarElementosVector(vector,indice+1):0;
    }
    
}



