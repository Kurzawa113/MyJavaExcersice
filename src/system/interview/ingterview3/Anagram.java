package system.interview.ingterview3;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        String str ="JAVA";
        String rev = "AVAJ";
        char[]strChar = str.toCharArray();
        char[]revChar = rev.toCharArray();
        Arrays.sort(strChar);
        Arrays.sort(revChar);
      if(Arrays.equals(strChar,revChar)){
          System.out.println("its anagram");
      }else {
          System.out.println("its not anagram");
      }

    }
}
