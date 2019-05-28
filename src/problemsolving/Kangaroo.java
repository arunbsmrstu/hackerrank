/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Kangaroo {
    
    
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        
        int difference=0;
        
        if((x1<x2) && (v1<v2) || v1==v2){
            return "NO";
        }
        
        while(difference>-1){
            x1=x1+v1;
            x2=x2+v2;
            difference=x2-x1;
            if(difference==0){
                return "YES";
            }
        }
        
      return "NO";
    }
    
    public static void main(String[] arg) throws FileNotFoundException{
    
        Scanner sc= new Scanner(new File("Kangarooc.txt"));
        List<Integer> list= new ArrayList<Integer>();
        
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        
        int x1=list.get(0);
        int v1=list.get(1);
        int x2=list.get(2);
        int v2=list.get(3);
        
        System.out.println(kangaroo(x1, v1, x2, v2));
    }
    
}
