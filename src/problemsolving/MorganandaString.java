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
    
    public static String morganAndString(String A, String B) {
        StringBuffer sb = new StringBuffer();
            int i=0;
            int j=0;
            while(i < A.length() && j < B.length()) {
                if (A.charAt(i) < B.charAt(j)) {
                    sb.append(A.charAt(i++));
                } else if (A.charAt(i) > B.charAt(j)) {
                    sb.append(B.charAt(j++));
                } else {
                    int x = i, y = j;
                    char a = A.charAt(i);
                    for(; x < A.length() && y < B.length(); x++, y++) {
                        if (A.charAt(x) != B.charAt(y)) {
                            break;
                        } else if (A.charAt(x) > a) {
                            sb.append(A.substring(i, x)).append(B.substring(j, y));
                            i = x; j = y;
                            a = A.charAt(x);
                        }
                    }

                    if (x == A.length()) {
                        sb.append(B.charAt(j));
                        j++;
                    } else if (y == B.length()) {
                        sb.append(A.charAt(i));
                        i++;
                    } else {
                        if (A.charAt(x) < B.charAt(y)) {
                            sb.append(A.charAt(i));
                            i++;
                        } else {
                            sb.append(B.charAt(j));
                            j++;
                        }
                    }
                }
            }

            sb.append(A.substring(i)).append(B.substring(j));
            return sb.toString();
    }
    
    
    public static void main(String arg[]){
        
       String line_one="JACK";
        String line_two="DANIEL";
        System.out.println(morganAndString(line_one, line_two));
        
    }
    
}
