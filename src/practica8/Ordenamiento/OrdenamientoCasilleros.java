/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8.Ordenamiento;

import java.util.Arrays;

/**
 *
 * @author Kintydev
 */
public class OrdenamientoCasilleros {

       /**
     * @param args the command line arguments
     */
    public void main() {
         int nums[] = {7, 10, 2, 1,1, 0, 45};
        int max_value = max_value(nums);
        System.out.println("Array Desordenado:");
        System.out.println(Arrays.toString(nums));
        nums = sort(nums, max_value);
        System.out.println("Array Ordenado:");
        System.out.println(Arrays.toString(nums));
    }

    public int[] sort(int[] nums, int max_value) {
        //BUCKET SORT O ORDENAMIENTO POR CASILLEROS (CUBOS)
        int[] Bucket = new int[max_value + 1];//ARREGLO DESORDENADO
        int[] sorted_nums = new int[nums.length];//ESPACIO PARA GUARDAR LO ORDENADO
        for (int i = 0; i < nums.length; i++)//RECORRIDO DE ESPACIOS
        {
            Bucket[nums[i]]++;
        }
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)//
        {
            for (int j = 0; j < Bucket[i]; j++) {
                sorted_nums[outPos++] = i;//ESPACIO PARA PONER LOS NUMEROS ORDENADOS
            }
        }
        return sorted_nums;
    }

    public int max_value(int[] nums) {
        int max_value = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max_value) {
                max_value = nums[i];
            }
        }
        return max_value;
    }


    }
    

