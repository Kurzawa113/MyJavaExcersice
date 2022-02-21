package system.interview.interview2;

public class PrimeNumberBetween {
    public static void main(String[] args) {
        // 20 to 50; // 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49,
    /*  int low = 20;
        int high = 50;

        while (low<high){
            boolean flag = false;
            for(int i =2; i<=low/2; i ++){
                    if(low%i==0){
                        flag =true;
                        break;
                    }
            }
            if(!flag){
                System.out.print(low+", ");
            }
            low++;
        }

 */

        int l = 20;
        int h = 50;
        while (l < h) {
            boolean flag1 = false;
            for (int i = 2; i <= l/2; i++) {
                if (l %i == 0) {
                    flag1 = true;
                    break;

                }
            }
                if (!flag1) {
                    System.out.print(l + ", ");
                }
                l++;
            }



    }

    }

