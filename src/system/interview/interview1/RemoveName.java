package system.interview.interview1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveName {
    public static void main(String[] args) {

     //remove names which contain a speciﬁc letter “e” from a collection type

   String [] nameArrays ={"Ali","Mahmat","Akila","Pettar","Renat","Alexander"};

        List<String>  listName = new LinkedList<>();
        listName.addAll(Arrays.asList(nameArrays));

        Iterator<String> iterator = listName.iterator();

        while (iterator.hasNext()){

            String st = iterator.next();
            if(st.toLowerCase().contains("e")){
                iterator.remove();
            }


        }

        System.out.println(listName);



        String name [] ={"Gulzar","Ablet","Yasin","Gulnur","Hemdullah"};

        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(name));
        Iterator<String > li = list.iterator();

        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.toLowerCase().contains("a")){
                iterator.remove();
            }
        }
        System.out.println(list);




    }
}
