/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.Scanner;

/**
 *
 * @author Arun
 */
public class JavaOutputFormatting {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int length=s1.length();
                for(int j=0;j<15-length;j++){
                    s1=s1+" ";
                }
                int x=sc.nextInt();
                 String x1=null;
                if(x<10){
                    x1=s1+"00"+String.valueOf(x);
                }else if(x<100){
                    x1=s1+"0"+String.valueOf(x);
                }
                else{
                    x1=s1+String.valueOf(x);
                }
                System.out.println(">>"+x1);
            }
            System.out.println("================================");
    }
    
}
