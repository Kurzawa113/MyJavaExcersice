package system.interview.ingterview3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your numbers");

        double num1 =sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Enter the operator ");
        char operation = sc.next().charAt(0);
  double o ;
        switch (operation){
            case '+':
                o=num1+num2;
                break;
            case '-':
                o=num1-num2;
                break;
            case '*':
                o=num1*num2;
                break;
            case '/':
                o=num1/num2;
                break;
            default:
                System.out.println(" wrong operation");



                 return;




        }


        System.out.println(num1+""+operation+""+num2+"="+o);


    }
}
