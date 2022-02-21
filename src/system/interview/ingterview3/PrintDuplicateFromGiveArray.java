package system.interview.ingterview3;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateFromGiveArray {
    public static void main(String[] args) {


String duplicate[] = new String[]{"java","spring","disney","java","spring","uyghur"};
        Set nonDuplicateSet = new HashSet();
        Set duplicateSet  =  new HashSet();

        for(String  s: duplicate){
            if(!nonDuplicateSet.contains(s)){
                nonDuplicateSet.add(s);
            }else {
                duplicateSet.add(s);
            }
        }
        System.out.println(duplicateSet);




    }
}
