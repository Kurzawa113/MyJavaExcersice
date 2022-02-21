package system.interview.ingterview3;

public class evenOddCount {
    public static void main(String[] args) {


        int n = 9888898;

        int oddCount = 0;
        int evenCount = 0;


        while (n > 0) {

            int remainder = n % 10;
            if (remainder % 2 == 0) {
                evenCount++;

            } else{
                oddCount++;
            }
            n=n/10;


        }

        System.out.println("odd: "+oddCount);
        System.out.println("even: "+ evenCount);

    }
}
