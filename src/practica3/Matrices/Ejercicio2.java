/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.Matrices;

/**
 *
 * @author Kintydev
 */
public class Ejercicio2 {
    public void main(){
        int [][] m = new int[3][3];
        
        for(int i=0;i<m.length;i++){
        for(int j=0;j<m[i].length;j++){
            if(i==j){
                m[i][j]=1;
            }else{
                m[i][j]=0;
            }
            }
        }
       for(int i=0;i<m.length;i++){
        for(int j=0;j<m[i].length;j++){
            System.out.print(m[i][j]+"\t");
        }
            System.out.println("");
       }
    }
}
