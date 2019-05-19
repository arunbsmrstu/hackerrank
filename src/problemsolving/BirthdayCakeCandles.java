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
public class BirthdayCakeCandles {
    
    
    
    static int birthdayCakeCandles(int[] ar) {
        int n=ar.length;
        int count=0;
        int temp=0;
        for(int i=0;i<n-1;i++){
            temp=ar[i];
            if(temp==ar[i+1]){
                count++;
            }else if(temp<ar[i+1]){
                temp=ar[i+1];
                count=0;
            }
        }
    return count;
    }
    
    
    public static void main(String arg[]) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("BirthdayCakeCandles.txt"));
        int n= sc.nextInt();
        int[] arr= new int[n];
        int count=0;
        
        while (sc.hasNextInt()) {            
            arr[count]=sc.nextInt();
            count++;
        }
        
        System.out.println(birthdayCakeCandles(arr));
    }
    
}
