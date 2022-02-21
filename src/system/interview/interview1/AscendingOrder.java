package system.interview.interview1;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {

   //sort array in ascending order without using sort method;

   int arr []= {99,33,11,22,66,33,12}  ;
   int temp=0;
   for(int i = 0; i<arr.length;  i++){
       for(int j =0; j<arr.length; j++){
           if(arr[i]<arr[j]){
               temp =arr[i];
               arr[i]= arr[j];
               arr[j]= temp;



           }
       }

        }
        System.out.println(Arrays.toString(arr));

        String str = String.valueOf(7);
        System.out.println(str);

        }






    }

