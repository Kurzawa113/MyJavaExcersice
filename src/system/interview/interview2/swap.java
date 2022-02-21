package system.interview.interview2;

public class swap {
    public static void main(String[] args) {

      // without temp num:

        System.out.println("without temp value");
       int a =10;
       int b = 20;
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("with temp value");
        // with temp number:


        int temp;
        int a1 = 100;
        int b1 = 200;
        temp =a1;
        a1=b1;
        b1=temp;
        System.out.println("b1: "+b1);
        System.out.println("a1: "+a1);



        int a11 =1000;
        int b11 =2000;
        a11=a11+b11;
        b11=a11-b11;
        a11=a11-b11;
        System.out.println("a11: "+a11);
        System.out.println("b11: "+b11);

        int temp111;
        int a111 =10000;
        int b111 =20000;

        temp111=a111;
        a111=b111;
        b111=temp111;
        System.out.println("a111: "+a111);
        System.out.println("b111: "+b111);









    }
}
