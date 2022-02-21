package system.interview.interview1;

public class RemoveConductive {
    public static void main(String[] args) {

        String str1 = "PEEATWWUR";
        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {
            if(str2.indexOf(str1.charAt(i))==-1){
              str2= str2+str1.charAt(i);
            }

        }
        System.out.println(str2);

    }

}