package system.interview.ingterview3;

import javax.crypto.spec.PSource;
import java.util.HashSet;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {


        String st = "asbdgae";
        longest(st);


    }

    private static String longest(String st) {
        String longestNow ="";
        String longestOverAll="";

        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<st.length();i++){

            char c = st.charAt(i);
            if(set.contains(c)){
                longestNow="";
                set.clear();
            }
            {
                set.add(c);
                longestNow+=c;
            }
            if(longestNow.length()>longestOverAll.length()){
                longestOverAll=longestNow;


            }

        }
        System.out.println(longestOverAll);


     return  longestOverAll;

    }
}
