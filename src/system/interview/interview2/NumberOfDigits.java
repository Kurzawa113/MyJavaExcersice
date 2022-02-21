package system.interview.interview2;

public class NumberOfDigits {
    public static void main(String[] args) {
        //1234--4
        //123--3
       /* long num =1009;
        int count=0;
        while (num!=0){
            num = num/10;// 123 12 1 0
            ++count; // 1 2 3 4

        }
        */


        int num =293;
        int count = 0;
        while (num!=0){
            num = num/10;//293 29 2
            count++;

        }

        System.out.println("number of digits : "+count);



    }
}
