package system.interview.interview2;

import java.util.*;

public class IterateNum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>() ;
        arr.addAll(Arrays.asList(1,1,1,2,3,4,5,1,7,8,9,6));

        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()){
            int num = it.next();
            if(num==1){
                it.remove();
            }
        }

        System.out.println(arr);



System.gc();

    }
}
