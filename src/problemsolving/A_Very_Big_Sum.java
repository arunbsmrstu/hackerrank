/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class A_Very_Big_Sum {
    
    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        
        long sum=0;
        
        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }
        
        return sum;


   }

   

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        long arr[]= new long[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextLong();
        }
        
        System.out.println(aVeryBigSum(arr));
    }
    
}
