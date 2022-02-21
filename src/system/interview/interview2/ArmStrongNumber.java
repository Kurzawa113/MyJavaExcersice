package system.interview.interview2;

public class ArmStrongNumber {
    public static void main(String[] args) {
        //153==> 1*1*1+5*5*5+3*3*3 = 1+125+27 = 153;
        // 371
/*
        int num = 371;
        double result = 0;
        int actualNum = num;
        while (actualNum != 0){
            int n = actualNum%10; //1 , 7  , 3
            result = result + Math.pow(n,3);//1 , 343 , 27
            actualNum = actualNum/10;//37 , 3


        }
        if(result == num ){
            System.out.println(num +" is armstrong number");
        }
else
        {
            System.out.println(num +" is not armstrong");
        }
*/

        int num = 153;
        double result =0 ;
        int ActualNum = num;

      while (ActualNum !=0) {
            int n = ActualNum % 10;
            result = result + Math.pow(n, 3);
            ActualNum = ActualNum /10;
        }
          if(result==num){
              System.out.println(num +" is ArmStrong ");
          }
          else {
              System.out.println(num+" is not ArmStrong");
          }

        }
    }


