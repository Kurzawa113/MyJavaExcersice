package system.interview.interview2;

public class FactorialNumber {
    public static void main(String[] args) {
       // !5 = 5*4*3*2*1 = 120;
/*
        int num =5;
        int fact = 1;

        for(int i = 1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("factorial of "+num+" is "+ fact);



*/

        int num = 5;
        double factorialNum = 1;

        for(int i =1; i<=num;i++){
            factorialNum = factorialNum*i;

        }

        System.out.println(num+ " is factotial is "+ factorialNum);



    }
}
