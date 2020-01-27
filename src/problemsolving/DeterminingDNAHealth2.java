package problemsolving;

import com.algorithms.string.KMP;
import java.util.ArrayList;
import java.util.List;


public class DeterminingDNAHealth2 {
     public static List<Integer> KMPSearch(String pat, String txt) 
    { 
        List<Integer> returnValue= new ArrayList(); 
        int sum=0;
        int M = pat.length(); 
        int N = txt.length(); 
  
        int lps[] = new int[M]; 
        int j = 0;  
        computeLPSArray(pat, M, lps); 
  
        int i = 0; 
        while (i < N) { 
            if (pat.charAt(j) == txt.charAt(i)) { 
                j++; 
                i++; 
            } 
            if (j == M) { 
                System.out.println("Found pattern "
                                   + "at index " + (i - j)); 
                returnValue.add(i-j);
                
                j = lps[j - 1]; 
            }
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) 
                    j = lps[j - 1]; 
                else
                    i = i + 1; 
            } 
        } 
        return returnValue;
    } 
  
    public static void computeLPSArray(String pat, int M, int lps[]) 
    {
        int len = 0; 
        int i = 1; 
        lps[0] = 0; 
        while (i < M) { 
            if (pat.charAt(i) == pat.charAt(len)) { 
                len++; 
                lps[i] = len; 
                i++; 
            } 
            else 
            { 
                if (len != 0) { 
                    len = lps[len - 1]; 

                } 
                else // if (len == 0) 
                { 
                    lps[i] = len; 
                    i++; 
                } 
            } 
        } 
    }
    
    
    public static void main(String arg[]){
        String dna[]={"a","b","c","aa","d","b"};
        String path="caaab";
        int value[]={1,2,3,4,5,6};
        for(int i=0;i<dna.length;i++){
            List<Integer> indexList= KMPSearch(dna[i], path);
            System.out.println(">>"+indexList);
            System.out.println("\n");
        }
    }
    
}
