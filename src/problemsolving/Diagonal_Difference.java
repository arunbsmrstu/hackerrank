/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Diagonal_Difference {
    
    static int diagonalDifference(int[][] arr) {
        int left=0;
        int right=0;
        
        for(int i=0;i<arr.length;i++){
            left=left+arr[i][i];
            right=right+arr[i][arr.length-1-i];
        }
        
        return Math.abs(left-right);
    }
    
    public static void main(String arg[]){
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int arr[][]= new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        
        System.out.println(diagonalDifference(arr));
    }
    
}
