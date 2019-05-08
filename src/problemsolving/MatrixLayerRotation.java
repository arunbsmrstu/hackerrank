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
public class MatrixLayerRotation {

    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        
        int m=in.nextInt();
        int n=in.nextInt();
        int r=in.nextInt();
        int [][]matrix= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        
        
        
        for(int layer=0;layer<Math.min(m, n)/2;layer++){
            for(int x=0;x<r ;x++){//r % (2 * (m + n - 2 - 4 * layer))
                int i=layer;
                int j=layer;
                
                int temp=matrix[layer][layer];
                
                while(i<m-1-layer){
                    int temp2=matrix[i+1][j];
                    matrix[i+1][j]=temp;
                    temp=temp2;
                    i++;
                }
                
                while(j<n-1-layer){
                    int temp2=matrix[i][j+1];
                    matrix[i][j+1]=temp;
                    temp=temp2;
                    j++;
                }
                
                while(i>layer){
                    int temp2=matrix[i-1][j];
                    matrix[i-1][j]=temp;
                    temp=temp2;
                    i--;
                }
                
                while(j>layer){
                    int temp2=matrix[i][j-1];
                    matrix[i][j-1]=temp;
                    temp=temp2;
                    j--;
                }
                
            }
        }
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }

}
