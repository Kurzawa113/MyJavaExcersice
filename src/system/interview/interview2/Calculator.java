package system.interview.interview2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter two number");
        double first = scanner.nextDouble();
        double  second  =scanner.nextDouble();
        System.out.println(" please enter operator +,-,/,*");
        char operator =   scanner.next().charAt(0);
        double result =0;
        switch (operator){
            case '+':
                result = first+second;
                break;
            case '-':
                result =first-second;
                break;
            case '/':
                result = first/second;
                break;
            case '*':
                result =first*second;
                break;
            default:
                System.out.println("please enter correct operator");
                break;


        }

        System.out.println("result is : "+result);
*/
        double result = 0;

        Scanner s  = new Scanner(System.in);
        System.out.println(" Please enter your first number ");
        double num1 =s.nextDouble();
        System.out.println("Please enter your second number");
        double num2 = s.nextDouble();
        System.out.println("Please enter operator");
        char operator = s.next().charAt(0);

        switch (operator){
            case '+':
              result = num1+num2;
              break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Please reenter your operator");
                break;

        }
        System.out.println(result);

    }
}
