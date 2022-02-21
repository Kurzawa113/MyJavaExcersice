package system.interview.interview1;

import java.util.*;

public class ReturnEvenNumberOnly {
    public static void main(String[] args) {

      //  Write a program which returns even numbers only

        List<Integer> listNum = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        Iterator<Integer>  iterator = listNum.iterator();

        while (iterator.hasNext()){
            int num = iterator.next();
            if(num %2==0){
                iterator.remove();
            }
        }
        System.out.println(listNum);





     List<Integer>  ll = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

     Iterator<Integer> iterator1 = ll.iterator();

     while (iterator1.hasNext()){
         int num1 =iterator1.next();
         if(num1 %2 !=0){
             iterator1.remove();
         }

     }
        System.out.println(ll);






    }
}
