/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8.Mezcla;

/**
 *
 * @author Kintydev
 */
public class Ejecucion {

    public void main() {
        Metodos metodos = new Metodos();

        int array[] = {5, 78, 25, 4, 3, 19, 20};

        int n = array.length;

        System.out.println("ARRAY ORDENADO: ");
        metodos.ordenar(array, 0, n - 1);
        metodos.Imprimir(array);

    }

}
