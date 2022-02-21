package system.interview.ingterview3;

import java.util.Scanner;

public class PerfectSquareDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number");
        int num = sc.nextInt();
        for (int i = 1; i < num / 2; i++) {
            if (i * i == num) {
                System.out.println("given number is square of " + i);
            } else {
                System.out.println("given number is not perfect square");
                return;

            }
        }


    }}
