/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Arun
 */
public class AshtonandString {
    public static List<String> distinctSubstring(String str) 
    { 
  
        // Put all distinct substring in a HashSet 
        List<String> result = new ArrayList(); 
  
        // List All Substrings 
        for (int i = 0; i <= str.length(); i++) { 
            for (int j = i + 1; j <= str.length(); j++) { 
  
                // Add each substring in Set 
                result.add(str.substring(i, j)); 
            } 
        } 
  
        // Return the HashSet 
        return result; 
    } 
    
    
    public static List<String>  sortStringsDictionaryOrder(List<String>  result){
        for(int i = 0; i < 3; ++i) {
            for (int j = i + 1; j < 4; ++j) {
                if (result.get(i).compareTo(result.get(j)) > 0) {
                    // swap words[i] with words[j[
                    String temp = result.get(i);
                    result.add(i, result.get(i));
                    result.add(j, temp);
//                    words[i] = words[j];
//                    words[j] = temp;
                }
            }
        }
        return result;
    }
    
    
    public static void main(String arg[]){
        String str = "dbac"; 
        List<String> subs = distinctSubstring(str); 
        List<String> words=sortStringsDictionaryOrder(subs);
        System.out.println("Distinct Substrings are: "); 
        for (String s : subs) { 
            System.out.println(s); 
        } 

           
    
    }
    
}
