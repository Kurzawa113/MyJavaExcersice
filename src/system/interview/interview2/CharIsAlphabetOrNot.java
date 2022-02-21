package system.interview.interview2;

public class CharIsAlphabetOrNot {
    public static void main(String[] args) {

/*
        char c = 'q';
        if((c>='a' && c<='z')|| (c>='A'&&c<='Z')){
            System.out.println(c + " is alphabet");

        }else {
            System.out.println(c+" is not alphabet");
        }

*/
        char str = 'Q';
        if(str>='a'&&str<='z'||str>='A'&&str<='Z'){
            System.out.println(str+ " is char");
        }else {
            System.out.println(str+ " is not char");
        }


    }
}
