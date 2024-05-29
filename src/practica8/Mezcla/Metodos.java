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
public class Metodos {
    
     public void ordenar(int array[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int media = (izquierda + derecha) / 2;

            ordenar(array, izquierda, media);
            ordenar(array, media + 1, derecha);

            Unir(array, izquierda, derecha, media);
        }
    }

    public void Unir(int array[], int izquierda, int derecha, int media) {
        int n1 = media - izquierda + 1;
        int n2 = derecha - media;

        int Larray[] = new int[n1];
        int Rarray[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            Larray[i] = array[izquierda + i];

        }
        for (int j = 0; j < n2; j++) {

            Rarray[j] = array[media + j + 1];
        }

        int i = 0, j = 0;

        int k = izquierda;

        while (i < n1 && j < n2) {
            if (Larray[i] <= Rarray[j]) {
                array[k] = Larray[i];
                i++;

            } else {
                array[k] = Rarray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            array[k]=Larray[i];
            i++;
            k++;
        }
        while(j<n2){
            array[k]=Rarray[j];
            j++;
            k++;
        }

    }
    
    public void Imprimir(int array[]){
        int num=array.length;
        for(int i=0;i<num;++i){
            System.out.println(array[i] + "");
        }
        System.out.println("");
    }


}
