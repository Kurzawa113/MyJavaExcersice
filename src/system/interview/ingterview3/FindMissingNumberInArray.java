package system.interview.ingterview3;

import java.util.Arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args) {


        int arr[] = new int[]{1, 2, 3, 4, 6, 7, 8};
        int missingNumber = getMissingNumber(arr, 8);
        System.out.printf("missing number in array %s is %d %n", Arrays.toString(arr), missingNumber);
    }

    private static int getMissingNumber(int[] arr, int n) {


        int actualSum = 0;

        int expectedSum = (n * (n + 1) / 2);
        for (int i : arr) {
            actualSum = actualSum + i;
        }
        return expectedSum - actualSum;
    }
}
