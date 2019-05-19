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
public class Staircase {
    
    static void staircase(int n) {
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               if((i+j)>n)
                   System.out.print("#");
               else
                   System.out.print(" ");
           }
           System.out.println("");
       }
    }
    
    public static void main(String arg[]) throws FileNotFoundException{
        File file= new File("Staircase.txt");
        Scanner sc= new Scanner(file);
        
        int n= sc.nextInt();
        staircase(n);
    }
}
