/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Arun
 */
public class HowManySubstrings {
    
    
    static int countSubstrings(String s,int m, int n){
    int count=0;
    for(int i=m;i<n;i++){
        for(int j=i+1;j<=n;j++){
            //System.out.println(s.substring(i, j));
            count++;
        }
    }
    return count;
    }
    
    
    public static void main(String[] arg){
        try {
            Scanner sc = new Scanner(new File("HowManySubstrings.txt"));
            int a=sc.nextInt();
            imt b=sc.nextInt();
            String line =sc.nextLine();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
