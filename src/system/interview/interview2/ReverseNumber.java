package system.interview.interview2;

import javax.lang.model.element.Name;

public class ReverseNumber {
    public static void main(String[] args) {

   /*     int num = 2345;// 5432
        int rev = 0 ;

        while (num !=0){

            int n = num%10;//5 4 3 2
            rev = rev * 10 +n; //5  54 543 5432
            num = num /10 ;// 234  23 2

         }
        System.out.println("Reversed number is : "+rev);
*/

        int n1 = 1234;
        int re =0;
        while (n1 !=0){
            int n  = n1%10;
            re =re*10+n;
            n1=n1/10;
        }
        System.out.println(re);







    }
}
