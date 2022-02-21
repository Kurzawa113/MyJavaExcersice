package system.interview.interview1;

public class Palindrome {
    public static void main(String[] args) {

String str1 = "level";
String str2 = new StringBuffer(str1).reverse().toString();
        if(str1.equals(str2)){
            System.out.println("Palindrome");
        }else {
            System.out.println("NotPalindrome");
        }

        String str3 = "Uyghur";
        String str4 = "";



        for(int i =str3.length()-1;i>=0;i--)
        {
            str4 += str3.charAt(i);
        }

        if(str3.equalsIgnoreCase(str4)){
            System.out.println("its plindrome");
        }else {
            System.out.println("it's not palindrome");
        }

        System.out.println(str1+"  "+str2+"  "+str3+"  "+str4);

    }
}
