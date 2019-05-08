/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CardsPermutation {

    public static List<List<Integer>> listPermutations(List<Integer> list) {

        if (list.size() == 0) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            result.add(new ArrayList<Integer>());
            return result;
        }

        List<List<Integer>> returnMe = new ArrayList<List<Integer>>();

        Integer firstElement = list.remove(0);

        List<List<Integer>> recursiveReturn = listPermutations(list);
        for (List<Integer> li : recursiveReturn) {

            for (int index = 0; index <= li.size(); index++) {
                List<Integer> temp = new ArrayList<Integer>(li);
                temp.add(index, firstElement);
                returnMe.add(temp);
            }

        }
        return returnMe;
    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        List<Integer> intList = new ArrayList<Integer>();
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            intList.add(i);
        }

        List<List<Integer>> myLists = listPermutations(intList);

        for (List<Integer> al : myLists) {
            String appender = "";
            for (Integer i : al) {
                System.out.print(appender + i);
                appender = " ";
            }
            System.out.println();
        }

    }

}
