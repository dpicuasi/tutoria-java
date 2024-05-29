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
public class OrdMonticulo {
      public void ordenamientoMonticulo(int[] array, int longitud){
        int i, o;
        int lCh, rCh, mCh, root, tmp;
        
        root = (longitud - 1) / 2;
        
        for (o = root; o >= 0; o--){
            for(i = root; i >= 0; i--){
                lCh = (2 * i) +1;
                rCh = (2 * i) +2;
                if((lCh <= longitud) && (rCh <= longitud)){
                   if (array[rCh] >= array[lCh]){
                        mCh = rCh; 
                   } else {
                        mCh = lCh;
                   }                                    
                } else {
                   if (rCh > longitud){
                       mCh = lCh;                       
                   } else {
                       mCh = rCh;
                   }
                } 
                if(array[i] < array[mCh]){
                    tmp = array[i];
                    array[i] = array[mCh];
                    array[mCh] = tmp;                    
                }
            }
            imprimirArray(array);
        }
        tmp = array[0];
        array[0] = array[longitud];
        array[longitud] = tmp;
        return;
    }
    
   public void imprimirArray(int[] array){
      for (int i = 0; i < array.length; i++) {
            System.out.printf("%d \t", array[i]);            
	}
	System.out.println(); 
   }
     
}
    
