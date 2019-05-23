/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arun
 */
public class HowManySubstrings {

    private static void checkSub(String str, ArrayList<String> distinctSubs) {
        int n = 0;
        for (int i = 0; i < distinctSubs.size(); i++) {
            if (distinctSubs.get(i).equals(str)) {
                n++;
                break;
            }
        }
        if (n == 0) {
            distinctSubs.add(str);
        }
    }

    private static int numOfSubs(int start, int end, String str, ArrayList<String> distinctSubs) {

        for (int i = 1; i <= (end - start); i++) {
            for (int j = start; j <= (end - i + 1); j++) {
                
                checkSub(str.substring(j, j + i), distinctSubs);
            }
        }
        int a = distinctSubs.size() + 1;
        return a;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("HowManySubstrings.txt"));
        int j = scan.nextInt();
        int n = scan.nextInt();
        String str = scan.next();
        ArrayList<String> distinctSubs = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            distinctSubs.clear();
            System.out.println(numOfSubs(start, end, str, distinctSubs));
        }
    }

}
