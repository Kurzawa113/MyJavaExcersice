package system.interview.ingterview3;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {


        String arr[]={"a","c","b","z"};
        System.out.println("before sorting");
        for(String st: arr){
            System.out.print(st);
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Sorting with ascending order");
        for(String st : arr){
            System.out.print(st);
        }
        System.out.println();
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("sorting with descending order");
        for(String st: arr){
            System.out.print(st);
        }










    }
}
