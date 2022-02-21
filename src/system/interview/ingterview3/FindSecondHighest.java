package system.interview.ingterview3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondHighest {
    public static void main(String[] args) {


        int arr[] = {10, 20, 99, 36, 88};
        Arrays.sort(arr);
        int secondLargest = arr[arr.length - 2];
        System.out.println(secondLargest);


    }
}
