package system.interview.ingterview3;

public class findFirstOccuranceOfDuplicate {
    public static void main(String[] args) {
        int arr[]= new int[]{1,1,2,3,4,56,7,6,3};

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    return;
                }

            }
        }

    }
}
