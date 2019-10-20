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
//        String temp="";
//        List<Character> list_one= new ArrayList();
//        List<Character> list_two= new ArrayList();
//        Queue<Character> stackOne = new LinkedList<>(); 
//        Queue<Character> stackTwo =new LinkedList<>(); 
         char[] chars_one = a.toCharArray();
        char[] chars_two = b.toCharArray();
        
        char temp;
        int flag_i=0;
        int flag=0;
        for(int i=0;i<chars_one.length;i++){
            for(int j=flag;j<chars_two.length;j++){
                if(chars_two[j]<chars_one[i]){
                    result+=chars_two[j];
                    flag_i=j;
                }else{
                    j++;
                    result+=chars_one[i];
                    flag=j;
                    break;
                }
            }
        }
        
        if(flag_i<chars_two.length){
            for(int i=flag_i;i<chars_two.length;i++){
                result+=chars_two[i];
            }
        }
        
        
        
        
//         for(int i=0;i<chars_one.length;i++){
//            stackOne.add(chars_one[i]);
//        }
//        for(int i=0;i<chars_two.length;i++){
//            stackTwo.add(chars_two[i]);
//        }
//        System.out.println(">>"+stackOne);
//        System.out.println(">>"+stackTwo);
//       
//            System.out.println(">stackOne>>"+stackOne.peek());
//            System.out.println(">stackTwo>>"+stackTwo.peek());
//            if(stackOne.size()>0 && stackTwo.size()>0){
//                if(stackOne.peek()<stackTwo.peek()){
//                result+=stackOne.peek();
//                stackOne.remove();
//                temp=removeFirstChar(a);
//            }else{
//                 result+=stackTwo.peek();
//                 stackTwo.remove();
//                 temp=removeFirstChar(b);
//            }
//            }
//            
//       
//        
//        if(temp!=null && temp.length()>0){
//            result+=temp;
//        }
        
        return result;
    }
    
    
    public static void main(String arg[]){
        
       String line_one="ABACABA";
        String line_two="ABACABA";
    //   System.out.println(">>  "+removeFirstChar(line_two));
       
        System.out.println(morganAndString(line_one, line_two));
        
    }
    
}
