package system.interview.interview1;

public class StringReverse {

        public static void main(String[] args) {

            String name= "Mum&Dad";
            String rev = "";
            for(int i=name.length()-1;i>=0; i--){
                rev +=name.charAt(i);

            }
            System.out.println(rev);

        }

}



