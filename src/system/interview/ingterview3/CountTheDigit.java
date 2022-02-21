package system.interview.ingterview3;

public class CountTheDigit {
    public static void main(String[] args) {


   /*     int num =  12345;
        int count=0;


        while (num!=0){
         num=num/10;
            count++;

        }
        System.out.println("the given number is "+count +" digit");
*/


        System.out.println(countDigit(987654321));


    }

    static int countDigit(int n) {
        if (n == 0) {
            return 0;


        }

        return 1 + countDigit(n / 10);
    }

}