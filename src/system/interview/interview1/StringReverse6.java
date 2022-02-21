package system.interview.interview1;

public class StringReverse6 {
    public static void main(String[] args) {


        String  sr = "RonaldoPhinominal";
        String reverse= "";

        for(int i = sr.length()-1; i>=0;i-- ){
            reverse += sr.charAt(i);
        }


        System.out.println(reverse);

    }


}
