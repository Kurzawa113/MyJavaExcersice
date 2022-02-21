package system.interview.ingterview3;

import java.util.Scanner;

public class MatrixDemo {
    public static void main(String[] args) {


        Scanner sc = new Scanner( System.in);
        System.out.println("Enter row");
        int row =sc.nextInt();
        System.out.println("Enter column");
        int column = sc.nextInt();

        int arr[][]= new int[row][column];

        System.out.println("enter the matrix");

        for(int i = 0 ; i<row;i++){
            for(int j = 0; j<column; j++){
                 arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("display teh matrix");
        for(int i = 0; i<row; i++){
            for(int j = 0;j<column; j++){
                System.out.print(  arr[i][j]+" ");

            }
            System.out.println();
        }





    }
}
