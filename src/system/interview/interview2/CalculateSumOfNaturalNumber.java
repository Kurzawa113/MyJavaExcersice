package system.interview.interview2;

public class CalculateSumOfNaturalNumber {
    public static void main(String[] args) {
       //1+2+3...+100;

        int num  =9;
        int sum = 0;

        for(int i = 1 ; i<=num; i++){
            sum = sum+i;
        }
        System.out.println("sum is : "+sum);
        System.out.println("-------------");

        int k = 1;
        int sum2 = 0;
        while (k<=num){
            sum2=sum2+k;
            k++;
        }
        System.out.println(" sum is : "+sum2);

    }
}
