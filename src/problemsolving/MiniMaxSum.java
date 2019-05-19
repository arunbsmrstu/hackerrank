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
public class MiniMaxSum {
     // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        
        long max=0;
        long min=Long.MAX_VALUE;
        long sum=0;
        
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            if(max<curr){
                max=curr;
            }
            
            if(min>curr){
                min=curr;
            }
            
            sum=sum+curr;
        }
        
        long maxValue=sum-min;
        long minValue=sum-max;
        
        System.out.println(minValue+" "+maxValue);


    }

   

    public static void main(String[] args) {
        int[] arr ={2,2,3,4,5};

        

        miniMaxSum(arr);

       
    }
}
