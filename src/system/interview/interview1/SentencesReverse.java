package system.interview.interview1;

public class SentencesReverse {
    public static void main(String[] args) {

     // TWO WAYS OF CREATING STRING;
        String name1= "mum";
        StringBuilder RevName1= new StringBuilder(name1);
        RevName1.reverse();
        System.out.println(RevName1);
        System.out.println(  "name1 and RaveName1 is palindrome?: "+ name1.equals(RevName1));//false: because stringBuilder dose not override the.equals();




        String name = "it's a beautiful day";
        String RevName = "";
        String []RevArrayName = name.split("");

        for(int i=RevArrayName.length-1; i>=0; i--){
            RevName += RevArrayName[i]+"";

        }
        RevName  = RevName.trim();
        System.out.println(RevName);
        System.out.println("name and RevName are palindrome? :  "+name.equals(RevName));//true: String override the equals();
    }





}
