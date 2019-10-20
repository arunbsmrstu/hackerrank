/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Arun
 */
public class AngryProfessor {
    
    String angryProfessor(int k, int[] a) {
         int count=0;
         for(int i=0;i<a.length;i++){
                if(a[i]<=0){
                    count++;
                }
            }
          
            if(count<k){
                return "YES";
            }
            return "NO";
    }
    
    
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
           
             List<Integer> list= new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                list.add(sc.nextInt());
            }
            
            
        
        }
    }
    
}
