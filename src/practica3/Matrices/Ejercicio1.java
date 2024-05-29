
package practica3.Matrices;

/**
 *
 * @author Kintydev
 */
public class Ejercicio1 {
    public void main(){
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0;i<matriz.length;i++){
            
        for(int j=0;j<matriz[i].length;j++){ 
            System.out.print(matriz[i][j]+"\t");
           
        }
            System.out.println("");
        }
}
}