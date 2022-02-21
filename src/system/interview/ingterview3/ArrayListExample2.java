package system.interview.ingterview3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample2 {
    public static void main(String[] args) {

        ArrayList<String> st = new ArrayList<>();

        st.add("Apple");
        st.add("Orange");
        st.add("Pear");
        st.add("Banana");
        st.add("Watermelon");
        System.out.println("before Sorting=============");
        for (String i : st) {
            System.out.println(i);

        }
        Collections.sort(st);
        System.out.println("After sorting=============");
        for (String i : st) {
            System.out.println(i);

        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(13);
        al.add(7);
        al.add(36);
        al.add(89);
        al.add(97);


        System.out.println("before sort==============");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));

        }
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After sort descending order===============");
      for (int i = 0; i < al.size(); i++) {
        System.out.println(al.get(i));

    }

}
}