package system.interview.ingterview3;

public class PrimeOrNot {
    public static void main(String[] args) {


        int num =13;


        boolean prime =true;

        for(int i =2; i<num/2; i++){
            if(num%i==0) {
                prime =false;
            }
        }

        if(prime==true){
            System.out.println("given num is prime number");
        }else {
            System.out.println("given num is not prime number");
        }




    }
}
