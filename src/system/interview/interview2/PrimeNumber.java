package system.interview.interview2;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 79;

        boolean flag = false;

        for(int i = 2; i<=num/2; i++){
            if(num %i==0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(num+" is prime number");
        }else {
            System.out.println(num+" is not prime number ");
        }

    }
}
