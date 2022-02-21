package system.interview.interview1;

public class DivisibleBy {
    public static void main(String[] args) {

//Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
        int num[] = new int[100];
        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        for (int each : num) {
            if (each % 15 == 0&&each%3==0&&each%5==0) {
                divisibleBy15 += each + ",";


            } else if (each % 5 == 0 ) {
                divisibleBy5 += each + ",";

            } else if (each % 3 == 0 ) {
                divisibleBy3 += each + ",";

            } else {

            }

        }


        System.out.println("divisibleBy3: " + divisibleBy3);
        System.out.println("divisibleBy5: " + divisibleBy5);
        System.out.println("divisibleBy15: " + divisibleBy15);

    }
}
