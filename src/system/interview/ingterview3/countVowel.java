package system.interview.ingterview3;

import java.util.Scanner;

public class countVowel {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String word = sc.nextLine();

        char ch[] = word.toCharArray();
        int count = 0;
        for (char c : ch) {
            switch (c) {
                case 'a':
                case 'e':
                case 'o':
                case 'i':
                case 'u':
                    count++;
                    break;
            }

        }
        System.out.println(count);
    }
}
