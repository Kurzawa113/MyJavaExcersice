package system.interview.interview2;

public class FibonacciSeries {
    public static void main(String[] args) {

        // 0,1,1,2,3,5,8,13.....(nLast-1)+last

/*
        int num = 10;
        int s1 = 1;
        int s2 = 2;
        for (int i = 1; i <= num; i++) {
           System.out.println(s1 + ", ");
            int sum = s1 + s2;
            s1 = s2;
            s2 = sum;


        }
        */

        int num1 =10;
        int s3 =20;
        int s4 =21;
        for(int i = 1; i<=num1; i++){
            System.out.print(s3+", ");
            int sum1 = s3+s4;
            s3=s4;
            s4=sum1;

        }


    }



    }

