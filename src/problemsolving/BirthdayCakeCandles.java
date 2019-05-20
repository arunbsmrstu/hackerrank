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
    
     public static void sort(int[] a) {
        int N = a.length; // array length
        for (int i = 0; i < N; i++) { // Exchange a[i] with smallest entry in a[i+1...N).
            int min = i; // index of minimal entr.
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    private static boolean less(int v, int w) {
        if(v<w)
            return true;
        else
            return false;
    }

    private static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

   

    static int birthdayCakeCandles(int[] ar) {

        int count = 0;
        sort(ar);
        int max = ar[ar.length - 1];
        for (int i = 0; i < ar.length; i++) {
            if (max == ar[i]) {
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
