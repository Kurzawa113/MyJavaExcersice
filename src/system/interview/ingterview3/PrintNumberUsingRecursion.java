package system.interview.ingterview3;

public class PrintNumberUsingRecursion {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();
        printNumber(1);


    }

    public static void printNumber(int n) {

        if (n <= 100) {
            System.out.print(n + ", ");
            printNumber(n + 1);
        }
    }


}
