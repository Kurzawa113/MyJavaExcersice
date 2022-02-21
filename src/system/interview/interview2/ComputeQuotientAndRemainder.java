package system.interview.interview2;

import javax.crypto.spec.PSource;

public class ComputeQuotientAndRemainder {
    public static void main(String[] args) {

/*
     int dividend = 30;
        int divisor = 4;
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println(quotient);
        System.out.println(remainder);
 */

        double dividend = 20;
       double divisor = 10;
       double quotient = dividend/divisor;
        double remainder = dividend%divisor;

        System.out.println(quotient+" is quotient ");
        System.out.println(remainder+ " is remainder");



    }
}