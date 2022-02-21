package system.interview.ingterview3;

import java.util.Scanner;

public class OccurrenceOfCharacter {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String st1 = sc.nextLine();

        int st1initialLength = st1.length();
        System.out.println("Enter Character");
        String  st2 =  sc.next();
        st1 =st1.replaceFirst(st2,"");

        int st1finalLength = st1.length();
        int totalLength = st1initialLength-st1finalLength;
        System.out.println("total occurrence of character is : "+totalLength);



    }
}