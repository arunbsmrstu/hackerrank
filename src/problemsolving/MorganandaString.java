/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Arun
 */
public class MorganandaString {
    
    public static String lexicographicalOrder(String words){
        char[] chars = words.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    public static String removeFirstChar(String s){
   return s.substring(1);
}
    
    public static String morganAndString(String a, String b) {
        String result="";
        String temp="";
        List<Character> list_one= new ArrayList();
        List<Character> list_two= new ArrayList();
        Queue<Character> stackOne = new LinkedList<>(); 
        Queue<Character> stackTwo =new LinkedList<>(); 
         char[] chars_one = a.toCharArray();
        char[] chars_two = b.toCharArray();
         for(int i=0;i<chars_one.length;i++){
            stackOne.add(chars_one[i]);
        }
        for(int i=0;i<chars_two.length;i++){
            stackTwo.add(chars_two[i]);
        }
        System.out.println(">>"+stackOne);
        System.out.println(">>"+stackTwo);
        while(stackOne.isEmpty() || !stackTwo.isEmpty() ){
            System.out.println(">stackOne>>"+stackOne.peek());
            System.out.println(">stackTwo>>"+stackTwo.peek());
          
                if(stackOne.peek()<stackTwo.peek()){
                result+=stackOne.peek();
                stackOne.remove();
                }else{
                 result+=stackTwo.peek();
                 stackTwo.remove();
                }
        }
            
       
        
        if(temp!=null && temp.length()>0){
            result+=temp;
        }
        
        return result;
    }
    
    
    public static void main(String arg[]){
        
       String line_one="JACK";
        String line_two="DANIEL";
    //   System.out.println(">>  "+removeFirstChar(line_two));
       
        System.out.println(">>  "+morganAndString(line_two, line_one));
        
    }
    
}
