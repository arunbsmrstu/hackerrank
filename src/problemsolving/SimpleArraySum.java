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
public class SimpleArraySum {
        
        
        
       public  static int simpleArraySum(int[] ar) {
           int sum=0;
           
           for(int i=0;i<ar.length;i++){
               sum=sum+ar[i];
           }
           
           return sum;
       }
    
    
    
    public static void main(String arg[]){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int array[]= new int[n];
        
        for(int i=0;i<n;i++){
            array[i]=in.nextInt();
        }
        
        System.out.println(simpleArraySum(array));
    }
    
}
