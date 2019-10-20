/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.Scanner;
import javax.crypto.Mac;

/**
 *
 * @author Arun
 */
public class Java_Loops {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int x = 0;
            double temp = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                temp = temp + (Math.pow(2, j) * b);
                int nm=a + (int)temp;
                System.out.print(nm+" ");
            }
            System.out.println();

        }
        in.close();
    }

}
