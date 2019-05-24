/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GradingStudents {
    
    
    
    static int[] gradingStudentsSolution(int[] grades){
        for(int i=0;i<grades.length;i++){
            int number=5-(grades[i]%5)+grades[i];
            
            if(number-grades[i]<3){
                grades[i]=number;
            }
        }
        
        
        return grades;
    }
    
    
    static int[] gradingStudents(int[] a) {
        for(int i=0;i<a.length;i++){
            if(38<=a[i]&& a[i]<=40){
                a[i]=40;
            }else if(43<=a[i] && a[i]<=45){
                a[i]=45;
            }else if(48<=a[i]&& a[i]<=50){
                a[i]=50;
            }else if(53<=a[i]&& a[i]<=55){
                a[i]=55;
            }else if(58<=a[i]&& a[i]<=60){
                a[i]=60;
            }else if(63<=a[i]&& a[i]<=65){
                a[i]=65;
            }else if(68<=a[i]&& a[i]<=70){
                a[i]=70;
            }else if(73<=a[i]&& a[i]<=75){
                a[i]=75;
            }else if(78<=a[i]&& a[i]<=80){
                a[i]=80;
            }else if(83<=a[i]&& a[i]<=85){
                a[i]=85;
            }else if(88<=a[i]&& a[i]<=90){
                a[i]=90;
            }else if(93<=a[i]&& a[i]<=95){
                a[i]=95;
            }else if(98<=a[i]&& a[i]<=100){
                a[i]=100;
            }else{
                a[i]=a[i];
            }
        }
        return a;

    }

    
    public static void main(String[] arg) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("GradingStudents.txt"));
        int n= sc.nextInt();
        int[] a= new int[n];
        int i=0;
        while(sc.hasNextInt()){
            a[i]=sc.nextInt();
            i++;
        }
        
        a=gradingStudentsSolution(a);
        
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    
    }
    
}
