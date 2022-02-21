package system.interview.ingterview3;

import java.util.Scanner;

public class PalindromeStringDemo {

    public static void main(String[] args) {

        String rev = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Word");
        String word = sc.next();
        for (int i = word.length() - 1; i >= 0; i--) {

            rev = rev + word.charAt(i);

        }
        if (word.equalsIgnoreCase(rev)) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }


    }


}

