package system.interview.ingterview3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(13);
        al.add(7);
        al.add(36);
        al.add(89);
        al.add(97);




        /*For Loop Example for traversing ArrayList*/
        System.out.println("Using For Loop");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));

        }

        System.out.println("Using Advanced For Loop");
        for (Integer num : al) {
            System.out.println(num);


        }




        System.out.println("Using While Loop");
        int i = 0;
        while (al.size() > i) {
            System.out.println(al.get(i));
            i++;
        }
    }
}
