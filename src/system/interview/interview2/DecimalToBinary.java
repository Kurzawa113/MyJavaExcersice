package system.interview.interview2;

public class DecimalToBinary {
    public static void main(String[] args) {

        int num = 75;
        long binary = ConvertDecimalToBinary(num);
        System.out.println(binary);

    }

    public static long ConvertDecimalToBinary(long num) {

        long binaryNumber = 0;
        long remainder = 1;
        int i = 1;
        int step = 1;
        while (num != 0) {
            remainder = num % 2;
            num = num / 2;
            binaryNumber += remainder * i;
            i *= 10;


        }

        return binaryNumber;
    }
}
