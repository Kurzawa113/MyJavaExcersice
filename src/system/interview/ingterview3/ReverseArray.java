package system.interview.ingterview3;

public class ReverseArray {
    public static void main(String[] args) {
// using sudo or swap
/*
        int arr[] = {10, 20, 30, 40, 50};

        int low = 0;
        int high = arr.length - 1;
        System.out.println("before reverse");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();

        while (low < high) {

            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

        }
        System.out.println("after reverse");
        for (int i : arr) {
            System.out.print(i + ", ");

        }

    }

 */
/*
      int arr1[]={50,40,30,20,10};
        System.out.println("original: ");
      for(int i: arr1){
          System.out.print(i+", ");
      }
        System.out.println();


      int low = 0;
      int high = arr1.length-1;

      while (low<high){
          int temp = arr1[low];
          arr1[low]=arr1[high];
          arr1[high]= temp;
          low++;
          high--;
      }
        System.out.println("reversed: ");
      for (int i:arr1){
          System.out.print(i+", ");
      }

*/


        int arr2[]= {1,2,3,4,5};

        int low  = 0;
        int high =arr2.length-1;

        while (low<high){
            int temp= arr2[low];
            arr2[low]=arr2[high];
            arr2[high]=temp;
            low++;
            high--;
        }
        for (int i:arr2){
            System.out.print(i+", ");
        }






    }
}
