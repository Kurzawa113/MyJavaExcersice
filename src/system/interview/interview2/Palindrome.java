package system.interview.interview2;

public class Palindrome {
    public static void main(String[] args) {
     /*   int num = 121;
        int rev = 0;

        int actualNum = num;

        while (num !=0){
            int n = num%10;// 1 2 1
            rev =rev*10+n;//1 12 121
            num = num/10;//12 1 0

        }
        if(actualNum ==rev){
            System.out.println(actualNum+ " is palindrome");
        }
        else {
            System.out.println(actualNum + " is  not palindrome ");
        }
*/
        int num = 212;
        int reverse = 0;
        int actualNum = num;
        while (num != 0) {
            int n = num % 10;
            reverse = reverse * 10 + n;
            num = num / 10;

        }
        if (actualNum == reverse) {

            System.out.println(actualNum + " is palindrome");

        } else {
            System.out.println(actualNum + " is not palindrome");
        }
    }

}
