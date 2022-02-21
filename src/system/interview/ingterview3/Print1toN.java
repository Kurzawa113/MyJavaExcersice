package system.interview.ingterview3;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {

        Print1toN pn =new Print1toN();


      pn.printOneToN();
      pn.printEvenNumber();

    }
    public void printOneToN(){

      Scanner  s =  new Scanner(System.in);
        System.out.println("enter your max number: ");
        int n = s.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("the number is : "+i);
        }




    }
    public void printEvenNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you number ");
        int  n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            //for(int i = 1; i<n; i++){
           // System.out.println("even number from 1 to N : "+ (i=(i+1)));
             if(i%2==0)
            System.out.println("even number from 1 to given number : "+i);
        }

    }
}
