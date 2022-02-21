package system.interview.interview2;

public class BinaryToDecimal {


    public static void main(String[] args) {

        /*int num = 1001100100;
        int decimalNumber =     ConvertBinaryToDecimal(num);
        System.out.println(decimalNumber);
*/
// using Inbuilt method
        String binaryString ="10101";
        int decimal = Integer.parseInt(binaryString,2);
        System.out.println(decimal);
// without inbuilt method;

        int temp = Integer.parseInt(binaryString);
        System.out.println(temp);
        int power = 0;
        int decimalNumber = 0;

        while (temp!=0){
            int remainder = temp%10;
          decimalNumber= decimalNumber+ (int)(Math.pow(2,power));
            power++;
            temp=temp/10;



        }
        System.out.println(decimal);
    }





    public  static int ConvertBinaryToDecimal(long num){

        int decimalNumber=0;
        int i =0;
        long remainder;

        while (num!=0){
            remainder = num%10;
            num = num/10;
            decimalNumber +=remainder*Math.pow(2,i);
            i++;



        }

    return  decimalNumber;
    }




}





