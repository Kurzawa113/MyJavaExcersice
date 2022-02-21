package system.interview.interview1;

import java.util.Arrays;

public class ReturnMaxNumber {
    public static void main(String[] args) {


        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];

            }
        }
        System.out.println(max);

        int []n ={99,2,3,4,5,100};
        int max1 = Integer.MIN_VALUE;
        for (int each : n){
            if(each>max1)
            max1 = each;
        }


        System.out.println(max1);



        int[]digit ={1222,3,4,56,78,99,125};
        Arrays.sort(digit);
        int Max= digit[digit.length-1];
        System.out.println(Max);


        int shuzi []={99,33,44,55,66,77} ;
        int Min  =shuzi[0];
        for(int i =0 ;i<shuzi.length;i++){
            if(Min>shuzi[i]){
                Min = shuzi[i];
            }

        }
        System.out.println(Min);


    }
}


