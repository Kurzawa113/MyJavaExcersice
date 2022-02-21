package system.interview.interview1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveData {
    public static void main(String[] args) {

        // Remove all data elements that are equal to 1

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);



        list.addAll(Arrays.asList(1,1,1,2,2,3,3,4,4,5,6,6,1,11,1));
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            int num = it.next();
            if(num==1){
                it.remove();
            }

        }
        System.out.println(list);





        List<Integer> list2 = new LinkedList<>();

        list2.add(5);
        list2.add(6);
        list2.add(5);
        list2.add(7);
        list2.add(9);
        list2.add(10);
        list2.add(5);
        list2.add(6);



        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()){

            int num1 = iterator.next();
            if(num1==5){
                iterator.remove();
            }
        }
        System.out.println(list2);





    }
}
