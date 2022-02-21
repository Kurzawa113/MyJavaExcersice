package system.interview.interview1;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String st1 = "AABBCCDDEFFFGG";
        String st2 = "";


        for (int i = 0; i < st1.length(); i++) {

            for (int j = 0; j < st1.length(); j++) {
                if(!st2.contains(""+st1.charAt(i))){
                    st2 +=""+st1.charAt(i);
                }

            }
        }
        System.out.println(st2);




        String str1 = "Sundeep";
        String str2 = "";

        for(int i =0; i<str1.length();i++){
            for(int j =0; j<str1.length();j++){
                if(!str2.contains(""+str1.charAt(i))){
                    str2 += ""+str1.charAt(i);

                }
            }
        }
        System.out.println(str2);
    }}