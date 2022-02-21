package system.interview.interview1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateThruMap {
    public static void main(String[] args) {

        Map<String,String>  map = new HashMap<String, String>();

        map.put("yakuza" ,"Akila");
        map.put("Nakamura" ,"Renati");
        map.put("Kawasaki" ,"Aliya");
        map.put("Honda" ,"Akila");
        map.put("Kanji" ,"Alexander");

        for(String each : map.values()){
            System.out.println(each);
        }

        //Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
          Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
           Map.Entry<String,String> enter = iterator.next();
            System.out.println(enter.getKey()+"="+enter.getValue());
        }


        System.gc();


    }
}
