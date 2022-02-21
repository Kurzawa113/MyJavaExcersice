package system.interview.interview2;

public class VowelOrConsonant {
    public static void main(String[] args) {

        //a e i o u   = vowel

        char ch = 'w';
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("vowel: "+ch);
        }else {
            System.out.println("consonant: "+ ch);

        }

        switch (ch){
            case 'a':
            case 'o':
            case 'i':
            case 'u':
            case 'e':
                System.out.println(ch+" is vowel");
                break;
            default:
                System.out.println(ch+" is consonant ");

                break;



        }






    }
}
