/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import com.algorithms.sorting.Insertion;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BirthdayCakeCandles {
    
    

    static int birthdayCakeCandles(int[] ar) {

      int count=0;
      int max=0;
      for(int i=0;i<ar.length;i++){
          if(max<ar[i]){
              max=ar[i];
              count=1;
          }else if(max==ar[i]){
              count++;
          }
      }

        return count;
    }

    public static void main(String arg[]) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BirthdayCakeCandles.txt"));
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        while (sc.hasNextInt()) {
            arr[count] = sc.nextInt();
            count++;
        }

        System.out.println(birthdayCakeCandles(arr));
    }

}
