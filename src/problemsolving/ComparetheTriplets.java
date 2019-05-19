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
 * @author ASUS
 */
public class ComparetheTriplets {
    
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int Alice=0 ;
        int Bob=0;
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
                Alice++;
            }else if(a.get(i)<b.get(i)){
                Bob++;
            }else{
            
            }
        }
        
        result.add(Alice);
        result.add(Bob);
        
        return result;
    }

    public static void main(String[] args)  {
        Scanner in= new Scanner(System.in);
        List<Integer> lista= new ArrayList<>();
        List<Integer> listb= new ArrayList<>();
        
        for(int i=0;i<3;i++){
            lista.add(in.nextInt());
        }
        
        for(int i=0;i<3;i++){
            listb.add(in.nextInt());
        }
        
        System.out.println(compareTriplets(lista, listb));;
    }
    
}
