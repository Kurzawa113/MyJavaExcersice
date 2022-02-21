package system.interview.ingterview3;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {


        int r,c,d;
        int num =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your row number");
        r=sc.nextInt();
        System.out.println("Floyd's triangle");
        for( c= 1; c<=r; c++ ){
            for(d=1;d<=c;d++){
                System.out.print(num+ " ");
                num++;

            }
            System.out.println(" ");
/*
Floyd's Triangle
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31 32 33 34 35 36
37 38 39 40 41 42 43 44 45
46 47 48 49 50 51 52 53 54 55

 */


        }

    }
}
