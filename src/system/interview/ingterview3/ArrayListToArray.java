package system.interview.ingterview3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
// method one
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Pear"));
        //System.out.println(arrayList);

        String arr[] = new String[arrayList.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayList.get(i);

        }
        for (String k : arr) {
            System.out.println(k);
        }

/*
method two
   ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Banana","Apple","Pear"));

   String arr[] =new String[arrayList.size()];

   String fruitNames[]=arrayList.toArray(new String[arrayList.size()]);

   for(String k: fruitNames){

    System.out.println(k);
        }


 */


    }
}
