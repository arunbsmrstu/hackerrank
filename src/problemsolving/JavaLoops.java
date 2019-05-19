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
public class JavaLoops {
    
    
    public static void main(String arg[]){
        Scanner in= new Scanner(System.in);
        
        int n=in.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        
    }
    
}
