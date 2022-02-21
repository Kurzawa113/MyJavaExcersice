package system.interview.interview2;

public class PowerOfNumber {
    public static void main(String[] args) {
        //4^5 = ?;
      /*
        int base = 4;

        int exponent = 5;
        int result = 1;


        while (exponent != 0) {

            result = result * base;
            --exponent;


        }
        System.out.println(result);
*/

        int base  = 4;
        int exponent = 5;
        int result = 1;
        while (exponent!=0){
            result = result*base;
         exponent--;

        }
        System.out.println(result);


    }
}
