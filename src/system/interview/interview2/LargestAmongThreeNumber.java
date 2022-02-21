package system.interview.interview2;

public class LargestAmongThreeNumber {
    public static void main(String[] args) {
        int x =1000;
        int y = 1200;
        int z = 1200;

     if(x>y&&x>z){
            System.out.println("x is greatest");
        }
        else if(y>z){
            System.out.println("y is greatest");
        }
        else {
            System.out.println("z is greater");
        }

        if(x>=y){
            if(x>=z){
                System.out.println("x is largest");
            }else {
                System.out.println("z is largest");
            }

        }else if(y>=z){
            System.out.println("y is largest");
        }
        else {
            System.out.println("z is largest");
        }
    }
}
