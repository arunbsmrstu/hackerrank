/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

/**
 *
 * @author Arun
 */
public class BeautifulDaysattheMovies {
    
    public static int reverseNumber(int num ){
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
       return  reversed;
    }
    
   public static int beautifulDays(int i, int j, int k) {
       int count=0;
       
       for(int a=i;a<=j;a++){
         int  c=reverseNumber(a);
         int temp=a-c;
         if(temp%k==0){
             count++;
         }
       }
       return count;
    }
    
    
    
    public static void main(String arg[]){
        System.out.println(beautifulDays(20,23,6));
    }
    
}
