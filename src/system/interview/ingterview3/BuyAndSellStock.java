package system.interview.ingterview3;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int arr[]= {10,20,90,100,300,500};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];

            }
            if(arr[i]>max){
                max=arr[i]-min;
            }

        }

        System.out.println("Max profit is "+ max);

    }
}
