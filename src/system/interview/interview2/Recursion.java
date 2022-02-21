package system.interview.interview2;

public class Recursion {
    public static void main(String[] args) {

//backCount(20);
        int n = 5;
     int sum= addNum(5);
       // System.out.println(sum);
        System.out.println(backCount(5));

    }


    public static int backCount(int n) {
        if (n == 0) {
            System.out.println("done");
        } else {
            System.out.println(n);
            n--;
            backCount(n);




        }
        return n ;
    }


    public static int addNum(int n) {
        if (n != 0) {
            return n + addNum(n - 1);
        } else {
            return n;
        }
    }
}