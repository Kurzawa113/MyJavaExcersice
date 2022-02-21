package system.interview.ingterview3;

import java.util.Scanner;

public class FirstDigitAndLastDigitSums {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = sc.nextInt();

        int lastDigit =number%10;

        int firstDigit = number;
        while (firstDigit>10){
            firstDigit=firstDigit/10;

        }
        System.out.println("firstDigit: "+firstDigit);
        System.out.println("lastDigit : "+lastDigit);
        System.out.println("sum : "+(firstDigit+lastDigit));






    }}
