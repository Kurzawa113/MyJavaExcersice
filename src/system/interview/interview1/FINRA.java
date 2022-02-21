package system.interview.interview1;

public class FINRA {
    public static void main(String[] args) {
/*
Write a program that prints out the numbers from 1 to 30
 but for numbers which are a multiple of 3,
  print "FIN" instead of the number and for numbers which are a multiple of 5,
   print "RA" instead of the number.
   For numbers which are a multiple of both 3 and 5,
   print "FINRA" instead of the number.
 */


        for(int i =1; i<=30; i++){
            String print ="";
            if(i %3==0)print="FIN";
            if(i %5==0)print="RA";
            if(i%5==0&i %3==0)print="FINRA";

            if (print.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(print);
            }
        }


    }
}
