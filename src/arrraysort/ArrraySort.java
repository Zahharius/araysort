/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrraysort;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author admin
 */
public class ArrraySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random(); 
        int[] array1 = new int [20];
        for (int i = 0 ; i < array1.length; i++){
            array1[i] = random.nextInt(19-0+1)+0;
        }
        System.out.println("nosort"+Arrays.toString(array1));
        for (int j = 0; j < array1.length-1; j++){
            for (int i = 0; i<array1.length-1; i++){
                if(array1[i] > array1[i+1]){
                    array1[i] = array1[i]+array1[i+1];
                    array1[i+1] = array1[i] - array1[i+1];
                    array1[i] = array1[i] - array1[i+1];                        
                }
            }
        }
        System.out.println("manual sort"+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("sort"+Arrays.toString(array1));
        System.out.println("-------------------------------------------------");
        int[][] array2 = new int [10][10];
        System.out.println("nosort :");
        for (int i=0; i<array2.length; i++) {
            for (int j =0; j<array2.length; j++){
                array2[i][j] = random.nextInt(100);
                System.out.printf("%-4d", array2[i][j]);
                
            }
            System.out.println();
        }
        for (int i=0; i < array2.length; i++){
            for (int j=0; j<array2.length; j++){
                for (int k=0; k<array2.length; k++){
                    for (int m=0; m<array2.length; m++){
                        if(array2[i][j]>array2[k][m]){
                            array2[i][j] = array2[i][j]+array2[k][m];
                            array2[k][m]=array2[i][j] - array2[k][m];
                            array2[i][j] = array2[i][j] - array2[k][m];
                            
                        }
                    }
                }
            }
            
        }
                    System.out.println("sort:");
            for (int i= 0; i<array2.length;i++){
                for (int j=0; j<array2.length; j++){
                    System.out.printf("%-4d", array2[i][j]);
                }
                System.out.println();
    }
    
}
}