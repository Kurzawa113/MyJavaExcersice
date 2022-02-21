package system.interview.ingterview3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class xx {
    public static void main(String[] args) {


        /*

          //Array Declaration and initialization
        String citynames[]={"Boston", "Dallas", "New York", "Chicago"};

        //Array to ArrayList conversion
        ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));

       //Adding new elements to the converted List
        citylist.add("San Francisco");
        citylist.add("San jose");

        //Final ArrayList content display using for loop
        for (String str: citylist)
        {
            System.out.println(str);
        }
         */


        /* Array Declaration and initialization*/
        String citynames[]={"Boston", "Dallas", "New York", "Chicago"};

        /*Array to ArrayList conversion*/
      //  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));
        ArrayList<String> citylist= new ArrayList<String>();
        Collections.addAll(citylist,citynames);

        /*Adding new elements to the converted List*/
        citylist.add("San Francisco");
        citylist.add("San jose");
       // System.out.println(citylist);

        /*Final ArrayList content display using for loop*/
        for (String i : citylist)
        {
            System.out.println(i);
        }

    }
}