package system.interview.ingterview3;

public class findLargestFromGivenIntArray {
    public static void main(String[] args) {


        int arr[] = {100, 2, 3, 4, 50, 6, 7, 8, 999};

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("largest from given array is : " + max);
        for (int num : arr) {
            if (num < min) {
                min = num;
            }

        }
        System.out.println(" smallest from given array: "+ min);
    }}
