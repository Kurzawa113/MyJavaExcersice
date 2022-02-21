package system.interview.interview2;

import java.util.*;

public class IterateString {
    public static void main(String[] args) {
        // remove all e


        String [] str ={"Ben","Sen","Fen","Ken","Aen"};
        List<String> nameSet = new ArrayList<>();
        nameSet.addAll(Arrays.asList(str));
        Iterator<String> stringIterator1 = nameSet.iterator();
        while (stringIterator1.hasNext()){
            String st = stringIterator1.next();
            if(st.toLowerCase().contains("e")){
                stringIterator1.remove();
            }


        }

        System.out.println(nameSet);
        }

}