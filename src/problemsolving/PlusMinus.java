/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PlusMinus {
    
    
     static void plusMinus(int[] arr) {
        int n=arr.length;
        double plus=0.0;
        double minus=0.0;
        double zerro=0.0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                plus++;
            }else if(arr[i]<0){
                minus++;
            }else{
                zerro++;
            }
        }
        
         System.out.printf("%.6f\n%.6f\n%.6f\n",plus/n,minus/n,zerro/n);
         
        
    }
    
    
    public static void main(String arg[]) throws FileNotFoundException{
        File file= new File("PlusMinus.txt");
        Scanner sc= new Scanner(file);
        
        int n=sc.nextInt();
        int[] arr= new int[n];
        int count=0;
        while(sc.hasNextInt()){
            arr[count]=sc.nextInt();
            count++;
        }
        
        plusMinus(arr);
    }
    
}
