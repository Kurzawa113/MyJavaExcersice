package system.interview.ingterview3;

public class WordReverse {
    public static void main(String[] args) {
        String str = "Welcome to java world";
      String splitArr[]=  str.split(" ");
      for(int i = splitArr.length-1; i>=0;i--){
          System.out.print(splitArr[i]);
      }
    }
}
