package system.interview.interview2;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();

        if(num %2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

*/
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number:  ");
        int  i = s.nextInt();
        if(i%2==0){
            System.out.println(i + " is even number ");
        }
       else{
           System.out.println(i+ " is Odd number");
        }
    }
}
