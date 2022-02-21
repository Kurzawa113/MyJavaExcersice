package system.interview.ingterview3;

import java.util.Scanner;

public class ArrayInsert {


    public static void main(String[] args) {


        int arr[]=new int [10];

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter you 10 number");
        for(int i=0;i<arr.length-1;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("print number before enter new number");
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("enter your location");
        int location = scanner.nextInt();
        for(int i= arr.length-1; i>location;i--){

            arr[i]= arr[i-1];

        }
        int value = scanner.nextInt();
        System.out.println("enter your value");
        arr[location]=value;

        for(int i: arr){
            System.out.println(i);
        }
















    }
}
