package system.interview.interview1;

public class Anagram {
    public static void main(String[] args) {

        String st = " listen";
        String st2 = "silent";

      for (int i = 0; i < st.length(); i++) {
            st2 = st2.replaceFirst("" + st.charAt(i), "");
        }
        System.out.println(st2.isEmpty() ? "Anagram" : "Not Anagram");





    }


}
