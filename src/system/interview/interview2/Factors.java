package system.interview.interview2;

public class Factors {
    public static void main(String[] args) {

        // 10   12510
        // 60 123456101215203060

       /* int num = 10;
        for(int i = 1; i<= num; i++){
            if(num%i==0){
                System.out.println(i+" ");
            }
        }
*/

        int n = 1000;

        for(int i =1; i<=n;i++ ){
            if(n%i==0){
                System.out.print(i+ ", ");
            }
        }




    }
}
