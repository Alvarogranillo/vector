

package vector;

/**
 *
 * @author alvar
 */
import java.util.Arrays;
import java.util.Scanner;
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] vector = new int[10];
     int i = 0;
     int k=0;
     int aux, numero;
     
     Scanner reader = new Scanner(System.in);
     for(i=0;i<10;i++){//lector de datos
         System.out.println("Escriba el numero que se encontrara en el vect0r"+i);
         numero=reader.nextInt();
         vector[i]=numero;
     }//final del for
     for(i=0;i<vector.length;i++){//vector para escribir los datos
         System.out.println("El vector:"+i+"Es equivalente a :"+ vector[i]);
         
         
     }
     
         
     
     
     aux=vector[0];
     for( i=0; i<vector.length ; i++ ){
         if(aux==vector[i]){
             k++;
         }else{
             System.out.println("El numero.."+aux+"se repite:"+k+" veces");
             k=1;
             aux=vector[i];   
         }     
     }
    
    
     
     
    
  
     
    }
}
