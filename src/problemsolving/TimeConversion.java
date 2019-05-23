package problemsolving;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun
 */
public class TimeConversion {
    
    
     static String timeConversion(String s) throws ParseException {
         SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssaa");
         SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");
         return date24Format.format(date12Format.parse(s));
    }
    
    
    public static void main(String[] arg) throws FileNotFoundException, ParseException{
        Scanner sc= new Scanner(new File("TimeConversion.txt"));
        String time= sc.nextLine();
        
        System.out.println(timeConversion(time));
    
    }
    
}
