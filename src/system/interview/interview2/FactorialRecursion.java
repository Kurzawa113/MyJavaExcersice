package system.interview.interview2;

public class FactorialRecursion {
    public static void main(String[] args) {
        multiplyRecursion(5);
        multiplyRecursion(0);
        System.out.println( multiplyRecursion(5));
        System.out.println(  multiplyRecursion(10));

    }
    public static int multiplyRecursion(int n){
        if(n>=1){
            return n*multiplyRecursion(n-1);

            }
        else {
            return 1;

        }
    }




}
