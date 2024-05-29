/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8.Monticulo;

/**
 *
 * @author Kintydev
 */
public class Ejecucion {
      /**
     * @param args the command line arguments
     */
    public void main() {
        OrdMonticulo ordenar = new OrdMonticulo();
        int[] array = {2, 5, 7, 9, 12, 19, 39, 21, 34, 55, 89};
        System.out.println("Imprimir el array desordenado");
        ordenar.imprimirArray(array);
        for (int i = array.length; i > 1; i--){
            ordenar.ordenamientoMonticulo(array, i - 1);
        }
        System.out.println("Imprimir el array ordenado");
        ordenar.imprimirArray(array);
    }


}
