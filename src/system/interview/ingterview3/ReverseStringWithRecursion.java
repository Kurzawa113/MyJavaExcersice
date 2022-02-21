package system.interview.ingterview3;

public class ReverseStringWithRecursion {
    public static void main(String[] args) {
        String str = "Akila";

        System.out.println( recursiveString(str));

    }

    public static String recursiveString(String s){

        if(s==null || s.length()<1){
            return s;
        }else {

        }  return recursiveString(s.substring(1))+s.charAt(0);


    }
}
