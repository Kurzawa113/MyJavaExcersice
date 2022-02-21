package system.interview.interview2;

public class ReverseStringSentence {
    public static void main(String[] args) {


        String sentences = "Osman Danggal";

        String reversedSentence = "";

        String arr[] = sentences.split("");

        for (int i = sentences.length()-1;i>=0;i--) {
            reversedSentence += arr[i] + "";
        }
            reversedSentence =reversedSentence.trim();


        System.out.println(reversedSentence);
    }
    interface  a {

    }
    interface   b{

    }
   abstract class c implements a, b{

     abstract     void  msg();


   }

}